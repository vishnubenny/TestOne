package com.vishnu.testone.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.vishnu.testone.util.extension.hideKeyboard
import com.vishnu.testone.util.extension.orDefault

abstract class BaseFragment<B : ViewBinding> : Fragment() {

    private var binding: B? = null

    fun binding() = binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding(inflater, container)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun hideKeyboard(): Boolean {
        return binding()?.root
            ?.hideKeyboard()
            .orDefault()
    }

    abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): B
}
