package pl.mattiahit.androidpatterns.fragment.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.databinding.FragmentMvvmBinding

class ExampleMvvmFragment : Fragment(R.layout.fragment_mvvm) {

    lateinit var binding: FragmentMvvmBinding
    lateinit var exampleMvvmViewModel: ExampleMvvmViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMvvmBinding.bind(view)
        exampleMvvmViewModel = ViewModelProvider(this)[ExampleMvvmViewModel::class.java]
        exampleMvvmViewModel.mutablelivedata.observe(viewLifecycleOwner, Observer {
            binding.textView.text = it
        })
        binding.btnCheckMvvm.setOnClickListener {
            exampleMvvmViewModel.getTextToShow()
        }
        binding.btnMvvmToMenu.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_exampleMvvmFragment_to_menuFragment)
        }
    }
}