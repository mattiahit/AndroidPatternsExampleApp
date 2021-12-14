package pl.mattiahit.androidpatterns.fragment.mvc

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.adapter.EmployeeAdapter
import pl.mattiahit.androidpatterns.databinding.FragmentMvcBinding
import pl.mattiahit.androidpatterns.repository.EmployeeRepository

class ExampleMvcFragment : Fragment(R.layout.fragment_mvc) {

    lateinit var binding: FragmentMvcBinding
    lateinit var repository: EmployeeRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMvcBinding.bind(view)
        repository = EmployeeRepository(context)
        val employees = repository.loadEmplyeeList()
        val adapter = EmployeeAdapter(employees)
        binding.employeeList.adapter = adapter
        binding.employeeList.layoutManager = LinearLayoutManager(context)
    }
}