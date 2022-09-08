package com.yongjincompany.voyager.ui.login

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityRegisterBinding
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.home.MainActivity

class RegisterActivity: BaseActivity<ActivityRegisterBinding>(
    R.layout.activity_register
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun initView() {
        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}