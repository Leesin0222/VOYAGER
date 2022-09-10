package com.yongjincompany.voyager.ui.end

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityResultBinding
import com.yongjincompany.voyager.remote.response.Memo
import com.yongjincompany.voyager.remote.response.Rocket
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.end.adapter.MemoListAdapter
import com.yongjincompany.voyager.ui.home.adapter.RocketListAdapter

class ResultActivity : BaseActivity<ActivityResultBinding>(
    R.layout.activity_result
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var memoList = mutableListOf(
            Memo("오로나민C", "안녕? 나의 비밀은 밥을 맛있게 먹는 방법이야. 이건 아무한테도 말한 적이 없는데 사실 난 치킨이 더 좋아"),
            Memo("쿠키런킹킹덤", "으 날 먹지마. 난 그저 쿠키일 뿐이야 날 먹는다면 분명 맛이 없어서 퉤하고 뷑어버리고 말꺼야 안돼! 이런.,,"),
            Memo("뀨은", "지구에서의 여름 유니콘을 기억해요? 우리 정말 열심히 준비했는데 좋은 결과까지 얻을 수 있어서 좋았어요."),
            Memo("드래곤 찐",
                "안녕하세요 저는 이용진이고요 . 저는 정말로 씼고 싶은데 이팜 정말  이 해커톤ㄷ이 저를 가만두지 않네요 정말 슬픕니다. 진짜 하하하하하하하하하")
        )
        val myAdapter by lazy {
            MemoListAdapter(memoList)
        }

        binding.rvMemoList.adapter = myAdapter
        binding.rvMemoList.layoutManager = LinearLayoutManager(this)
    }

    override fun initView() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

}