package pl.mattiahit.androidpatterns.fragment.mvc

import pl.mattiahit.androidpatterns.model.Employee

interface ExampleMvcFragmentView {
    interface Listener {
        fun onEmployeeClicked(employee: Employee)
    }

    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
    fun bindEmployees(employees: List<Employee>)
}