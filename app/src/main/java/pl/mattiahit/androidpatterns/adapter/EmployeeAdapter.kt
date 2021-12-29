package pl.mattiahit.androidpatterns.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import pl.mattiahit.androidpatterns.databinding.ItemEmployeeBinding
import pl.mattiahit.androidpatterns.fragment.mvc.EmployeeClickedListener
import pl.mattiahit.androidpatterns.model.Employee

class EmployeeAdapter(private val employees: List<Employee>): RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>(), EmployeeListItem.Listener {

    private lateinit var context: Context
    inner class EmployeeViewHolder(val employeeListItem: EmployeeListItem): RecyclerView.ViewHolder(employeeListItem.getRootView())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        context = parent.context;
        val binding = ItemEmployeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val employeeListItem = EmployeeListItemImpl(binding)
        employeeListItem.registerListener(this)
        return EmployeeViewHolder(employeeListItem)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.employeeListItem.bindEmployee(employees[position])
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    override fun onEmployeeClicked(employee: Employee) {
        Toast.makeText(context, employee.toString(), Toast.LENGTH_SHORT).show()
    }
}