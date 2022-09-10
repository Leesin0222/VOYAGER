package com.yongjincompany.voyager.ui.end.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ItemMemoBinding
import com.yongjincompany.voyager.databinding.ItemRocketBinding
import com.yongjincompany.voyager.remote.response.Memo
import com.yongjincompany.voyager.ui.end.DateActivity
import com.yongjincompany.voyager.ui.end.ResultActivity
import com.yongjincompany.voyager.ui.loading.LoadingActivity
import com.yongjincompany.voyager.ui.participate.BoardWaitingActivity

class MemoListAdapter(
    var memos: List<Memo>,
) : RecyclerView.Adapter<MemoListAdapter.MemoDataViewHolder>() {

    inner class MemoDataViewHolder(val itemMemoBinding: ItemMemoBinding) :
        RecyclerView.ViewHolder(itemMemoBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MemoDataViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_memo,
            parent,
            false
        )
    )

    override fun getItemCount() = memos.size

    override fun onBindViewHolder(holder: MemoDataViewHolder, position: Int) {

        holder.itemMemoBinding.tvNickname.text = memos[position].name
        holder.itemMemoBinding.tvContents.text = memos[position].detail
    }
}