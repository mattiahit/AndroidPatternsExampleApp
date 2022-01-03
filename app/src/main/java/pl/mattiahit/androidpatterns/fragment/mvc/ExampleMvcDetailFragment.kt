package pl.mattiahit.androidpatterns.fragment.mvc

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.databinding.FragmentMvcDetailsBinding

class ExampleMvcDetailFragment: Fragment(R.layout.fragment_mvc_details) {

    lateinit var exampleMvcDetailFragmentView: ExampleMvcDetailFragmentView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exampleMvcDetailFragmentView = ExampleMvcDetailFragmentViewImpl(FragmentMvcDetailsBinding.bind(view))
    }
}