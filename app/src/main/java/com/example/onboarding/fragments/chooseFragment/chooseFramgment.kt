package com.example.onboarding.fragments.chooseFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboarding.R
import com.example.onboarding.base.BaseFragment

class chooseFramgment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.choose_fragment,container,false)
    }


}