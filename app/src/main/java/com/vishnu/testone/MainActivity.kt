package com.vishnu.testone

import com.vishnu.testone.base.BaseActivity
import com.vishnu.testone.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getBindingVariable() = ActivityMainBinding.inflate(layoutInflater)
}
