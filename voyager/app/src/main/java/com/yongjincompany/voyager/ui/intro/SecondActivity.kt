package com.yongjincompany.voyager.ui.intro

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.MainActivity
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivitySecondBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class SecondActivity : BaseActivity<ActivitySecondBinding>(
    R.layout.activity_second
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun initView() {
        binding.all.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}