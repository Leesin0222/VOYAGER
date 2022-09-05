package com.yongjincompany.voyager.ui.room

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityMakeRocketBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class MakeRocketActivity : BaseActivity<ActivityMakeRocketBinding>(
    R.layout.activity_make_rocket
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun initView() {
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, FinishRocketActivity::class.java)
            startActivity(intent)
        }
    }
}