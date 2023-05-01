package com.example.todo

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.text.SimpleDateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newTaskBtn = findViewById<Button>(R.id.new_task_btn)
        val allTv = findViewById<TextView>(R.id.categoriesMenu_all_tv)
        val openTv = findViewById<TextView>(R.id.categoriesMenu_open_tv)
        val closedTv = findViewById<TextView>(R.id.categoriesMenu_closed_tv)
        val archivedTv = findViewById<TextView>(R.id.categoriesMenu_archived_tv)
        findViewById<TextView>(R.id.subtitle_tv).text =
            SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().time)

        allTv.setOnClickListener {
            allTv.setTextColor(ContextCompat.getColor(this, R.color.blue))
            openTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            closedTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            archivedTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            allTv.setTypeface(null, Typeface.BOLD)
            openTv.setTypeface(null, Typeface.NORMAL)
            closedTv.setTypeface(null, Typeface.NORMAL)
            archivedTv.setTypeface(null, Typeface.NORMAL)

        }
        openTv.setOnClickListener {
            allTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            openTv.setTextColor(ContextCompat.getColor(this, R.color.blue))
            closedTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            archivedTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            allTv.setTypeface(null, Typeface.NORMAL)
            openTv.setTypeface(null, Typeface.BOLD)
            closedTv.setTypeface(null, Typeface.NORMAL)
            archivedTv.setTypeface(null, Typeface.NORMAL)
        }
        closedTv.setOnClickListener {
            allTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            openTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            closedTv.setTextColor(ContextCompat.getColor(this, R.color.blue))
            archivedTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            allTv.setTypeface(null, Typeface.NORMAL)
            openTv.setTypeface(null, Typeface.NORMAL)
            closedTv.setTypeface(null, Typeface.BOLD)
            archivedTv.setTypeface(null, Typeface.NORMAL)
        }
        archivedTv.setOnClickListener {
            allTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            openTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            closedTv.setTextColor(ContextCompat.getColor(this, R.color.gray))
            archivedTv.setTextColor(ContextCompat.getColor(this, R.color.blue))
            allTv.setTypeface(null, Typeface.NORMAL)
            openTv.setTypeface(null, Typeface.NORMAL)
            closedTv.setTypeface(null, Typeface.NORMAL)
            archivedTv.setTypeface(null, Typeface.BOLD)

        }

    }
}