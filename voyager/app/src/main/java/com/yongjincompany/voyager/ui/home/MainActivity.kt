package com.yongjincompany.voyager.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityMainBinding
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.participate.BoardHomeActivity
import com.yongjincompany.voyager.ui.room.MakeHomeActivity

class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        binding.btnMakeRocket.setOnClickListener {
            val intent = Intent(this, MakeHomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnBoardRocket.setOnClickListener {
            val intent = Intent(this, BoardHomeActivity::class.java)
            startActivity(intent)
        }
    }
}