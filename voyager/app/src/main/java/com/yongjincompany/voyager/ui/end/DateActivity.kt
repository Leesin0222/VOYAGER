package com.yongjincompany.voyager.ui.end

import android.os.Bundle
import com.bumptech.glide.Glide
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityDateBinding
import com.yongjincompany.voyager.ui.base.BaseActivity

class DateActivity: BaseActivity<ActivityDateBinding>(
    R.layout.activity_date
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun initView() {
        Glide.with(this).load(R.drawable.space).centerCrop().into(binding.ivSpaceBackground)
    }
}