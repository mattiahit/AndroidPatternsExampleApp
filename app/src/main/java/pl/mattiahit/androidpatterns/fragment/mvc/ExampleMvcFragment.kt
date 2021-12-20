package pl.mattiahit.androidpatterns.fragment.mvc

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
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
        repository = EmployeeRepository(context)
        val employees = repository.loadEmplyeeList()
        exampleMvcFragmentViewImpl.bindEmployees(employees)
        exampleMvcFragmentViewImpl.registerListener(this)
    }

    override fun onEmployeeClicked(employee: Employee) {
        Toast.makeText(context, employee.toString(), Toast.LENGTH_SHORT).show()
    }
}