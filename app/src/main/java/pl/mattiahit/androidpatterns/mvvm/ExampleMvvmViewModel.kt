package pl.mattiahit.androidpatterns.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleMvvmViewModel : ViewModel() {

    var mutablelivedata: MutableLiveData<String> = MutableLiveData()

    private fun getTextData(): String {
        return "MVVM Works!!!!"
    }

    public fun getTextToShow() {
        mutablelivedata.value = getTextData()
    }

}