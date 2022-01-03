package pl.mattiahit.androidpatterns.fragment.mvc

import android.view.View
import pl.mattiahit.androidpatterns.databinding.FragmentMvcDetailsBinding
import pl.mattiahit.androidpatterns.model.Employee

class ExampleMvcDetailFragmentViewImpl(private val binding: FragmentMvcDetailsBinding): ExampleMvcDetailFragmentView {

    override fun bindEmployee(employee: Employee) {
        binding.tvEmployeeName.text = employee.name
        binding.tvEmployeeEmail.text = employee.email
        binding.tvEmployeeRole.text = employee.role
    }

    override fun getRootView(): View {
        return binding.root
    }
}