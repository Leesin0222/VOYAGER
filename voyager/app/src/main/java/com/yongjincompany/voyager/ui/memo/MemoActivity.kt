package com.yongjincompany.voyager.ui.memo

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityMemoBinding
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.home.MainActivity

class MemoActivity : BaseActivity<ActivityMemoBinding>(
    R.layout.activity_memo
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun initView() {
        binding.btnFinish.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}