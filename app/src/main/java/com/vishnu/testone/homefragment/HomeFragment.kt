package com.vishnu.testone.homefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.vishnu.testone.R
import com.vishnu.testone.base.BaseFragment
import com.vishnu.testone.databinding.HomeFragmentBinding

class HomeFragment : BaseFragment<HomeFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): HomeFragmentBinding {
        return HomeFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding()?.apply {
            btnValidateOtp.setOnClickListener {
                if (edtTxtOtp.text?.toString() == "0612") {
                    view.findNavController()
                        .navigate(R.id.action_homeFragment_to_browserFragment)
                }
            }
        }
    }
}
