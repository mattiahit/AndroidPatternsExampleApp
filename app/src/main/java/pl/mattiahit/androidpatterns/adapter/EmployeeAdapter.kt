package pl.mattiahit.androidpatterns.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pl.mattiahit.androidpatterns.databinding.ItemEmployeeBinding
import pl.mattiahit.androidpatterns.fragment.mvc.EmployeeClickedListener
import pl.mattiahit.androidpatterns.model.Employee

class EmployeeAdapter(private val employees: List<Employee>, private val employeeClickedListener: EmployeeClickedListener): RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    inner class EmployeeViewHolder(val binding: ItemEmployeeBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val binding = ItemEmployeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmployeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.binding.apply {
            tvEmployeeName.text = employees[position].name
            tvEmployeeEmail.text = employees[position].email
        }
        holder.binding.root.setOnClickListener {
            employeeClickedListener.onEmployeeClicked(employees[position])
        }
    }

    override fun getItemCount(): Int {
        return employees.size
    }
}