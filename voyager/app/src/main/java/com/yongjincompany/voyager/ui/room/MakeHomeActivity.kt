package com.yongjincompany.voyager.ui.room

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityMakeHomeBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class MakeHomeActivity: BaseActivity<ActivityMakeHomeBinding>(
    R.layout.activity_make_home
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        binding.tvMakeRocket.setOnClickListener {
            val intent = Intent(this, MakeRocketActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}