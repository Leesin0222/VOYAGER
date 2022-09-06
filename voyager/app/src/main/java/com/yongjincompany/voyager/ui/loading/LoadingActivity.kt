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
        Glide.with(this).load(R.drawable.space).centerCrop().into(binding.ivSpaceBackground)
    }
}