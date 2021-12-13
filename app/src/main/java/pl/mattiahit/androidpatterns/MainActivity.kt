package pl.mattiahit.androidpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import pl.mattiahit.androidpatterns.model.Employee
import pl.mattiahit.androidpatterns.repository.EmployeeRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val repository = EmployeeRepository(this)
//        val list = repository.loadEmplyeeList()
//        Log.d(javaClass.name, list.toString())
    }
}