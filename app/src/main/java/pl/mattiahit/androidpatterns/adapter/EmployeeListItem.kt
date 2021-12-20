package pl.mattiahit.androidpatterns.adapter

import android.view.View
import pl.mattiahit.androidpatterns.model.Employee

interface EmployeeListItem {
    interface Listener {
        fun onEmployeeClicked(employee: Employee)
    }

    fun getRootView(): View
    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
    fun bindEmployee(employee: Employee)
}