package pl.mattiahit.androidpatterns.fragment.mvc

import pl.mattiahit.androidpatterns.model.Employee

interface EmployeeClickedListener {

    fun onEmployeeClicked(employee: Employee)
}