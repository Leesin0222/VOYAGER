package com.yongjincompany.voyager.ui.end

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityResultBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class ResultActivity : BaseActivity<ActivityResultBinding>(
    R.layout.activity_result
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun initView() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

}