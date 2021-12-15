package com.aam.tamaya

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.yasin_item.*

class adapter_rc_yasin(private val context: Context, private val items:ArrayList<yasin_model>):
    RecyclerView.Adapter<adapter_rc_yasin.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.yasin_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))

    }

    class ViewHolder(override val containerView: View):
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item:yasin_model) {
            var imgg = item.gm_yasin
            imgYasin.setImageResource(imgg)


        }
    }
}