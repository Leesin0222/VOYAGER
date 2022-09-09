package com.yongjincompany.voyager.ui.intro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ActivityFirstBinding
import com.yongjincompany.voyager.ui.base.BaseActivity
import com.yongjincompany.voyager.ui.home.MainActivity
import com.yongjincompany.voyager.ui.login.HomeActivity

class FirstActivity : BaseActivity<ActivityFirstBinding>(
    R.layout.activity_first
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {

        val fadeInAnim =
            AnimationUtils.loadAnimation(this, com.google.android.material.R.anim.abc_fade_in)
        val fadeInAnim2 =
            AnimationUtils.loadAnimation(this, com.google.android.material.R.anim.abc_fade_in)
        val fadeOutAnim2 =
            AnimationUtils.loadAnimation(this, com.google.android.material.R.anim.abc_fade_out)
        fadeInAnim2.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

                binding.tvIntroduce.visibility = View.VISIBLE
                binding.ivTop.visibility = View.VISIBLE
                binding.tvFooter.visibility = View.VISIBLE


            }

            override fun onAnimationEnd(p0: Animation?) {
                Thread.sleep(1000)
                binding.tvIntroduce.startAnimation(fadeOutAnim2)
                binding.ivTop.startAnimation(fadeOutAnim2)
                binding.tvFooter.startAnimation(fadeOutAnim2)
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }
        })
        fadeOutAnim2.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                binding.tvIntroduce.visibility = View.INVISIBLE
                binding.ivTop.visibility = View.INVISIBLE
                binding.tvFooter.visibility = View.INVISIBLE
                Thread.sleep(500)

                val intent = Intent(this@FirstActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }
        })

        fadeInAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(anim: Animation?) {
            }

            override fun onAnimationEnd(anim: Animation?) {
                Thread.sleep(1000)
                val fadeOutAnim = AnimationUtils.loadAnimation(this@FirstActivity,
                    com.google.android.material.R.anim.abc_fade_out)
                fadeOutAnim.setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(p0: Animation?) {}

                    override fun onAnimationEnd(p0: Animation?) {
                        binding.ivTitle.visibility = View.INVISIBLE
                        binding.tvSub.visibility = View.INVISIBLE
                        Thread.sleep(700)
                        binding.tvIntroduce.startAnimation(fadeInAnim2)
                        binding.ivTop.startAnimation(fadeInAnim2)
                        binding.tvFooter.startAnimation(fadeInAnim2)
                    }

                    override fun onAnimationRepeat(p0: Animation?) {
                        TODO("Not yet implemented")
                    }
                })

                binding.ivTitle.startAnimation(fadeOutAnim)
                binding.tvSub.startAnimation(fadeOutAnim)

            }

            override fun onAnimationStart(p0: Animation?) {
            }
        })
        binding.ivTitle.startAnimation(fadeInAnim)
        binding.tvSub.startAnimation(fadeInAnim)
    }

}
