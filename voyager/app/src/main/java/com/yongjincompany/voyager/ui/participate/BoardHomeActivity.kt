package com.yongjincompany.voyager.ui.participate

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityBoardHomeBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class BoardHomeActivity : BaseActivity<ActivityBoardHomeBinding>(
    R.layout.activity_board_home
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun initView() {
        binding.btnBoardRocket.setOnClickListener {
            val intent = Intent(this, BoardWaitingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}