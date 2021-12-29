package pl.mattiahit.androidpatterns.common

import pl.mattiahit.androidpatterns.fragment.mvc.ExampleMvcFragmentView

interface ObservableViewMvc<ListenerType> : ViewMvc {
    fun registerListener(listener: ListenerType)
    fun unregisterListener(listener: ListenerType)
}