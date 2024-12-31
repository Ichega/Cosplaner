package ru.yatsevyukcompany.testrecycle.Adapter

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import ru.yatsevyukcompany.testrecycle.Domain.OngoingDomain
import ru.yatsevyukcompany.testrecycle.R

class OngoingAdapter(private val items: List<OngoingDomain>) :
    RecyclerView.Adapter<OngoingAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.tittleTxt)

        var progressBarPercentage: TextView = itemView.findViewById(R.id.percentTxt)
        var progressTxt: TextView = itemView.findViewById(R.id.progressTxt)
        var progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        var pic: ImageView = itemView.findViewById(R.id.pic)
        var layout: ConstraintLayout = itemView.findViewById(R.id.constLay)


       

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title

        holder.progressBarPercentage.text = "${item.progressPercent}"

        val drawableResourceId = holder.itemView.context.resources.getIdentifier(
            item.picPath, "drawable", holder.itemView.context.packageName
        )

        Glide.with(holder.itemView.context).load(drawableResourceId).into(holder.pic)
        holder.progressBar.progress = item.progressPercent

    }
}