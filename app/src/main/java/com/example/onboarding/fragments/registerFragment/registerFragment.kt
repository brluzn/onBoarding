package com.example.onboarding.fragments.registerFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboarding.R
import com.example.onboarding.base.BaseFragment

class registerFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.register_fragment,container,false)
    }

}