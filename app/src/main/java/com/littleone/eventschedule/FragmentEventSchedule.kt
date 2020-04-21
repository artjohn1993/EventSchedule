package com.littleone.eventschedule

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import com.leochuan.CenterSnapHelper
import com.leochuan.ScaleLayoutManager
import com.leochuan.ScrollHelper
import kotlinx.android.synthetic.main.fragment_event_schedule.*

@SuppressLint("ValidFragment")
class FragmentEventSchedule(var activity: Activity): Fragment() {

    var recyclerView : RecyclerView? = null
    var downButton : ImageButton? = null
    var upButton : ImageButton? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_event_schedule, container, false)
        setView(view)
        setRecycler()

        CenterSnapHelper().attachToRecyclerView(recyclerView)
        val layoutManager = ScaleLayoutManager.Builder(activity,0)
            .setMoveSpeed(1.000f)
            .build()

        layoutManager.enableBringCenterToFront = true
        layoutManager.orientation = ScaleLayoutManager.VERTICAL
        layoutManager.maxVisibleItemCount = 3
        recyclerView?.layoutManager = layoutManager

        downButton?.setOnClickListener {
            recyclerView?.smoothScrollToPosition(layoutManager.currentPosition + 1)
        }

        upButton?.setOnClickListener {
            recyclerView?.smoothScrollToPosition(layoutManager.currentPosition - 1)
        }

        return view
    }

    fun setRecycler() {
        recyclerView?.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        recyclerView?.adapter = EventAdapter(activity)
    }


    fun setView(view:View) {
        recyclerView = view.findViewById(R.id.eventRecyclerView)
        downButton = view.findViewById(R.id.downButton)
        upButton = view.findViewById(R.id.upButton)
    }
}