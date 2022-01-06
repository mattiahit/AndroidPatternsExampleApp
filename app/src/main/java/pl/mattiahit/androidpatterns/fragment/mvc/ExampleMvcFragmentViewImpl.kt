package pl.mattiahit.androidpatterns.fragment.mvc

import android.content.Context
import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pl.mattiahit.androidpatterns.adapter.EmployeeAdapter
import pl.mattiahit.androidpatterns.databinding.FragmentMvcBinding
import pl.mattiahit.androidpatterns.model.Employee

class ExampleMvcFragmentViewImpl(private val binding: FragmentMvcBinding): EmployeeClickedListener,
    ExampleMvcFragmentView {

    private val listeners = mutableListOf<ExampleMvcFragmentView.Listener>()

    override fun registerListener(listener: ExampleMvcFragmentView.Listener){
        listeners.add(listener)
    }

    override fun unregisterListener(listener: ExampleMvcFragmentView.Listener) {
        listeners.remove(listener)
    }

    private fun getContext(): Context {
        return getRootView().context
    }

    override fun onEmployeeClicked(employee: Employee) {
        for (listener: ExampleMvcFragmentView.Listener in listeners){
            listener.onEmployeeClicked(employee)
        }
    }

    override fun bindEmployees(employees: List<Employee>) {
        val adapter = EmployeeAdapter(employees, this)
        binding.employeeList.adapter = adapter
        binding.employeeList.layoutManager = LinearLayoutManager(getContext())
    }

    override fun getRootView(): View {
        return binding.root
    }


}