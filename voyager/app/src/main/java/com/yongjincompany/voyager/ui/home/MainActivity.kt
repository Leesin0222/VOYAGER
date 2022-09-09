package com.yongjincompany.voyager.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityMainBinding
import com.yongjincompany.voyager.remote.response.Rocket
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.home.adapter.RocketListAdapter
import com.yongjincompany.voyager.ui.loading.LoadingActivity
import com.yongjincompany.voyager.ui.memo.MemoActivity
import com.yongjincompany.voyager.ui.participate.BoardHomeActivity
import com.yongjincompany.voyager.ui.room.MakeHomeActivity

class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var rocketList = mutableListOf(
            Rocket("유니톤9호", "탑승대기"),
            Rocket("드래곤호", "탑승완료"),
            Rocket("나로호", "항해종료"),
            Rocket("디자인짱호", "항해중")
        )
        val myAdapter by lazy {
            RocketListAdapter(rocketList)
        }

        binding.rvRocketList.adapter = myAdapter
        binding.rvRocketList.layoutManager = LinearLayoutManager(this)
    }

    override fun initView() {
        binding.btnMakeRocket.setOnClickListener {
            val intent = Intent(this, MakeHomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }

        binding.btnBoardRocket.setOnClickListener {
            val intent = Intent(this, BoardHomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}