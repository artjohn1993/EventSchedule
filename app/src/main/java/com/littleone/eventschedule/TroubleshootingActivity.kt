package com.littleone.eventschedule

import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TroubleshootingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_troubleshooting)
        setView()
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun setView() {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(this.resources.getColor(R.color.colorPrimaryDark)))
        supportActionBar?.elevation = 0f
        title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
