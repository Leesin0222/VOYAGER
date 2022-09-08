package com.yongjincompany.voyager.ui.end

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import androidx.databinding.DataBindingUtil
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.DoneCustomDialogBinding

class DoneDialog(
    private val context: Context,
    private val onYesClick: () -> Unit = {},
    private val onNoClick: () -> Unit = {}
) {

    fun callDialog() {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val binding: DoneCustomDialogBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.done_custom_dialog,
            null,
            false
        )
        dialog.setContentView(binding.root)

        binding.btnFinish.setOnClickListener {
            onYesClick()
            dialog.dismiss()
        }
        dialog.show()
    }
}