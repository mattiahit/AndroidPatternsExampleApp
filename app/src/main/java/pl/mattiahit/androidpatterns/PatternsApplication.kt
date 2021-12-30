package pl.mattiahit.androidpatterns

import android.app.Application
import pl.mattiahit.androidpatterns.repository.EmployeeRepository

class PatternsApplication : Application() {

    private lateinit var emplyeeRepository: EmployeeRepository

    override fun onCreate() {
        emplyeeRepository = EmployeeRepository(this)
        super.onCreate()
    }

    fun getEmployeeRespository(): EmployeeRepository {
        return emplyeeRepository
    }
}