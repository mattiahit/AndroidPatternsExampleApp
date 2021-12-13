package pl.mattiahit.androidpatterns.fragment.mvp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.databinding.FragmentMvpBinding

class ExampleMvpFragment : Fragment(R.layout.fragment_mvp), MvpView{

    private lateinit var binding: FragmentMvpBinding
    private lateinit var presenter: ExampleMvpPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMvpBinding.bind(view)
        presenter = ExampleMvpPresenter(this)
        binding.btnCheckMvp.setOnClickListener {
            presenter.showAppText()
        }
        binding.btnMvpToMenu.setOnClickListener {
            presenter.backToMenu()
        }
    }

    override fun onShowAppText(exampleText: String) {
        binding.textView.text = exampleText
    }

    override fun onBackToMenu() {
        view?.let {
            Navigation.findNavController(it).navigate(R.id.action_exampleMvpFragment_to_menuFragment)
        }
    }
}
