package pl.mattiahit.androidpatterns.fragment.mvc

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import pl.mattiahit.androidpatterns.PatternsApplication
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.databinding.FragmentMvcBinding
import pl.mattiahit.androidpatterns.model.Employee
import pl.mattiahit.androidpatterns.repository.EmployeeRepository

class ExampleMvcFragment : Fragment(R.layout.fragment_mvc), ExampleMvcFragmentView.Listener {

    lateinit var exampleMvcFragmentViewImpl: ExampleMvcFragmentViewImpl
    lateinit var repository: EmployeeRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exampleMvcFragmentViewImpl = ExampleMvcFragmentViewImpl(FragmentMvcBinding.bind(view))
        repository = (context?.applicationContext as PatternsApplication).getEmployeeRespository()
        val employees = repository.loadEmplyeeList()
        exampleMvcFragmentViewImpl.bindEmployees(employees)
        exampleMvcFragmentViewImpl.registerListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        exampleMvcFragmentViewImpl.unregisterListener(this)
    }

    override fun onEmployeeClicked(employee: Employee) {
        val bundle = Bundle()
        bundle.putParcelable("EmployeeParcelable", employee)
        Navigation.findNavController(exampleMvcFragmentViewImpl.getRootView())
            .navigate(R.id.action_exampleMvcFragment_to_exampleMvcDetailFragment, bundle)
    }
}