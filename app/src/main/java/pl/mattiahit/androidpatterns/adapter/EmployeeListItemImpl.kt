package pl.mattiahit.androidpatterns.adapter

import android.view.View
import pl.mattiahit.androidpatterns.databinding.ItemEmployeeBinding
import pl.mattiahit.androidpatterns.model.Employee

class EmployeeListItemImpl(private val binding: ItemEmployeeBinding) : EmployeeListItem {

    private val listeners = mutableListOf<EmployeeListItem.Listener>()
    private lateinit var employee: Employee

    init {
        getRootView().setOnClickListener {
            for (listener : EmployeeListItem.Listener in listeners) {
                listener.onEmployeeClicked(employee)
            }
        }
    }

    override fun getRootView(): View {
        return binding.root
    }

    override fun registerListener(listener: EmployeeListItem.Listener) {
        listeners.add(listener)
    }

    override fun unregisterListener(listener: EmployeeListItem.Listener) {
        listeners.remove(listener)
    }

    override fun bindEmployee(employee: Employee) {
        this.employee = employee
        binding.apply {
            tvEmployeeName.text = employee.name
            tvEmployeeEmail.text = employee.email
        }
    }
}