package com.example.habittracker2025.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habits")
data class Habit(
    @PrimaryKey(autoGenerate = true)
    val habitId: Long = 0,
    val title : String,
    val description : String?,
    val category : String?, // e.g., 'health', 'productivity', 'fitness'
    val frequency : String, // 'daily', 'weekly', 'monthly'
    val timeOfDay : String?, // 'morning', 'mid-day', 'evening'
    val targetValues : String?, //  e.g., number of steps, glasses of water
    val measurementUnit : String?, //  e.g., 'steps', 'minutes', 'times'

)