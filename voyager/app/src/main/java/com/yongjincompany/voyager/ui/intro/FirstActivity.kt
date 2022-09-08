package com.yongjincompany.voyager.ui.intro

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityFirstBinding
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.home.MainActivity
import com.yongjincompany.voyager.ui.login.HomeActivity

class FirstActivity : BaseActivity<ActivityFirstBinding>(
    R.layout.activity_first
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun initView() {
        binding.all.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }

}
