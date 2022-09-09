package com.yongjincompany.voyager.ui.login

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityLoginBinding
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.home.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(
    R.layout.activity_login
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun initView() {
        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finishAffinity()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}


