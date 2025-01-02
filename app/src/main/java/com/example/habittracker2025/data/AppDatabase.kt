package com.example.habittracker2025.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities =[ Habit::class] , version = 0, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitDao
}