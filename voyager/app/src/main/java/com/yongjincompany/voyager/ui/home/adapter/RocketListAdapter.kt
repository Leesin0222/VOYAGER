package com.yongjincompany.voyager.ui.home.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.yongjincompany.voyager.R
import com.yongjincompany.voyager.databinding.ItemRocketBinding
import com.yongjincompany.voyager.remote.response.Rocket
import com.yongjincompany.voyager.ui.end.DateActivity
import com.yongjincompany.voyager.ui.end.ResultActivity
import com.yongjincompany.voyager.ui.loading.LoadingActivity
import com.yongjincompany.voyager.ui.participate.BoardWaitingActivity

class RocketListAdapter(
    var rockets: List<Rocket>,
) : RecyclerView.Adapter<RocketListAdapter.RocketDataViewHolder>() {

    inner class RocketDataViewHolder(val itemRocketBinding: ItemRocketBinding) :
        RecyclerView.ViewHolder(itemRocketBinding.root)

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RocketDataViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_rocket,
            parent,
            false
        )
    )


    override fun getItemCount() = rockets.size

    override fun onBindViewHolder(holder: RocketDataViewHolder, position: Int) {
        context = holder.itemRocketBinding.tvWaitingName.context
        holder.itemRocketBinding.tvWaitingName.text = rockets[position].name
        holder.itemRocketBinding.tvReady.text = rockets[position].ready

        holder.itemView.setOnClickListener {
            when (rockets[position].ready) {
                "탑승대기" -> {
                    val intent = Intent(context, BoardWaitingActivity::class.java)
                    context.startActivity(intent)
                }
                "탑승완료" -> {
                    val intent = Intent(context, LoadingActivity::class.java)
                    context.startActivity(intent)
                }
                "항해종료" -> {
                    val intent = Intent(context, ResultActivity::class.java)
                    context.startActivity(intent)
                }
                "항해중" -> {
                    val intent = Intent(context, DateActivity::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }
}