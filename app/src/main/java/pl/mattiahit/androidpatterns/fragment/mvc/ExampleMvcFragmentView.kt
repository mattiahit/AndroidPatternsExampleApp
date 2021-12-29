package pl.mattiahit.androidpatterns.fragment.mvc

import pl.mattiahit.androidpatterns.common.ObservableViewMvc
import pl.mattiahit.androidpatterns.model.Employee

interface ExampleMvcFragmentView : ObservableViewMvc<ExampleMvcFragmentView.Listener> {
    interface Listener {
        fun onEmployeeClicked(employee: Employee)
    }
    fun bindEmployees(employees: List<Employee>)
}