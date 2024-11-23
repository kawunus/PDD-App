package com.kawunus.pddapp.presentation.tickets.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kawunus.pddapp.databinding.TicketsFragmentBinding

class TicketsFragment : Fragment() {

    private lateinit var binding: TicketsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TicketsFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}