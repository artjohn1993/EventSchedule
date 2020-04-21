package com.littleone.eventschedule

import android.app.Activity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.startActivity

class EventAdapter(var activity: Activity) : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): EventViewHolder {
        val inflater = LayoutInflater.from(p0?.context)
        val layout = inflater.inflate(R.layout.layout_event_schedule, p0, false)



        return EventViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(view: EventViewHolder, p1: Int) {
        view.tips.setOnClickListener {
            activity.startActivity<TroubleshootingActivity>()
        }

    }


    class EventViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val dayTime = itemView.findViewById<TextView>(R.id.dayTime)
        val tips = itemView.findViewById<LinearLayout>(R.id.warningContainer)
    }
}