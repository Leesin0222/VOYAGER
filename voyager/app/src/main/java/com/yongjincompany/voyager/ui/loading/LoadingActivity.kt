package com.yongjincompany.voyager.ui.loading

import android.os.Bundle
import com.bumptech.glide.Glide
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityLoadingBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class LoadingActivity: BaseActivity<ActivityLoadingBinding>(
    R.layout.activity_loading
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun initView() {
        //TODO: 달이 막 화면으로 점점 커져서 도착한 것 같은 효과를 내게 하자 어차피 로딜화면 아니우주로 가는 화면이니깐..!
        Glide.with(this).load(R.drawable.space).centerCrop().into(binding.ivSpaceBackground)
    }
}