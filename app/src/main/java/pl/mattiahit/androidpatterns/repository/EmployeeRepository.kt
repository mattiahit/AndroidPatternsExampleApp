package pl.mattiahit.androidpatterns.repository

import android.content.Context
import android.util.Log
import com.google.gson.*
import pl.mattiahit.androidpatterns.model.Employee
import java.lang.Exception
import java.nio.charset.Charset

class EmployeeRepository (private val context: Context) {

    fun loadEmplyeeList(): List<Employee> {
        val resultList = mutableListOf<Employee>()
        try {
            val inputStream = context.assets.open("data.json")
            val inputSize = inputStream.available()
            val buffer = ByteArray(inputSize)
            inputStream.read(buffer)
            inputStream.close()
            val data = JsonParser.parseString(String(buffer, Charset.defaultCharset())).asJsonObject
            data?.let {
                for(jsonObj: JsonElement in it.getAsJsonArray("employees")) {
                    resultList.add(Gson().fromJson(jsonObj, Employee::class.java))
                }
            }
        }catch (e: Exception){
            Log.e(javaClass.name, e.message.toString())
        }
        return resultList
    }

}