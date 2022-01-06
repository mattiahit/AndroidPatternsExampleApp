package pl.mattiahit.androidpatterns.fragment.mvc

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.databinding.FragmentMvcDetailsBinding
import pl.mattiahit.androidpatterns.model.Employee

class ExampleMvcDetailFragment: Fragment(R.layout.fragment_mvc_details) {

    lateinit var exampleMvcDetailFragmentView: ExampleMvcDetailFragmentView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exampleMvcDetailFragmentView = ExampleMvcDetailFragmentViewImpl(FragmentMvcDetailsBinding.bind(view))
        val employee = arguments?.getParcelable<Employee>("EmployeeParcelable");
        employee?.let {
            (exampleMvcDetailFragmentView as ExampleMvcDetailFragmentViewImpl).bindEmployee(it)
        }
    }
}