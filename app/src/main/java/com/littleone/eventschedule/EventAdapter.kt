package com.littleone.eventschedule

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EventAdapter : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): EventViewHolder {
        val inflater = LayoutInflater.from(p0?.context)
        val layout = inflater.inflate(R.layout.layout_event_schedule, p0, false)


        return EventViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(p0: EventViewHolder, p1: Int) {
        println("from onBindViewHolder")
        println(p1)
        //p0.text.text = p1.toString().plus(" Position")
    }


    class EventViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val dayTime = itemView.findViewById<TextView>(R.id.dayTime)
    }
}