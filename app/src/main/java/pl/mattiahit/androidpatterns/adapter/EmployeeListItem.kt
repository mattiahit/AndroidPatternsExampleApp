package pl.mattiahit.androidpatterns.adapter

import pl.mattiahit.androidpatterns.common.ObservableViewMvc
import pl.mattiahit.androidpatterns.model.Employee

interface EmployeeListItem : ObservableViewMvc<EmployeeListItem.Listener> {
    interface Listener {
        fun onEmployeeClicked(employee: Employee)
    }
    fun bindEmployee(employee: Employee)
}