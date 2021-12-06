package pl.mattiahit.androidpatterns.mvp

class ExampleMvpPresenter(val view: MvpView){

    private fun getTextData(): String {
        return "MVP Works!!!!"
    }

    public fun showAppText() {
        view.onShowAppText(getTextData())
    }

    public fun backToMenu() {
        view.onBackToMenu()
    }

}