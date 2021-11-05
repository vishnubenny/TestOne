package com.vishnu.testone

import android.os.Bundle
import androidx.fragment.app.commit
import com.vishnu.testone.base.BaseActivity
import com.vishnu.testone.databinding.ActivityMainBinding
import com.vishnu.testone.webbrowser.BrowserFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.commit {
            replace(binding.vwFragmentContainer.id, BrowserFragment())
        }
    }
}
