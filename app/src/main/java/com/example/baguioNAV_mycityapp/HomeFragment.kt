package com.example.baguioNAV_mycityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.baguioNAV_mycityapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.coffeeButton.setOnClickListener {
            navigateToCategory("Cafe")
        }

        binding.restaurantButton.setOnClickListener {
            navigateToCategory("Restaurants")
        }

        binding.kidFriendlyButton.setOnClickListener {
            navigateToCategory("Malls")
        }

        binding.parksButton.setOnClickListener {
            navigateToCategory("Parks")
        }

        binding.shoppingButton.setOnClickListener {
            navigateToCategory("Museums")
        }
    }

    private fun navigateToCategory(category: String) {
        val action = HomeFragmentDirections.actionHomeFragmentToCategoryFragment(category)
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}