package pl.mattiahit.androidpatterns.mvp

interface MvpView {

    fun onShowAppText(exampleText: String)
    fun onBackToMenu()
}