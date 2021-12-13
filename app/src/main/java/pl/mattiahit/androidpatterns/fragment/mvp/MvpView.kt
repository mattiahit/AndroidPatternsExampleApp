package pl.mattiahit.androidpatterns.fragment.mvp

interface MvpView {

    fun onShowAppText(exampleText: String)
    fun onBackToMenu()
}