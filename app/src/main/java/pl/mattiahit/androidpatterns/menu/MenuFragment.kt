package pl.mattiahit.androidpatterns.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import pl.mattiahit.androidpatterns.R
import pl.mattiahit.androidpatterns.databinding.FragmentMenuBinding

class MenuFragment: Fragment(R.layout.fragment_menu) {

    private lateinit var binding: FragmentMenuBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMenuBinding.bind(view)

        binding.btnMvp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_exampleMvpFragment)
        }

        binding.btnMvvm.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_exampleMvvmFragment)
        }
    }
}