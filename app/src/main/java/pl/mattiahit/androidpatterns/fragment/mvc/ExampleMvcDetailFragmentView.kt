package pl.mattiahit.androidpatterns.fragment.mvc

import pl.mattiahit.androidpatterns.common.ViewMvc
import pl.mattiahit.androidpatterns.model.Employee

interface ExampleMvcDetailFragmentView: ViewMvc {

    fun bindEmployee(employee: Employee)
}