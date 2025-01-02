package com.example.habittracker2025.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {
//    Create
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHabit(habit: Habit): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMultipleHabits(habits : List<Habit>)

//    Read
    @Query("SELECT * FROM habits WHERE habitId = :habitId")
    fun getHabitById(habitId : Long): Flow<Habit?>

    //  Update
    @Update
    suspend fun updateHabit(habit: Habit)

//    Delete
    @Delete
    suspend fun deleteHabit(habit: Habit)

    @Query("DELETE FROM habits WHERE habitId = :habitId ")
    suspend fun deleteHabitById(habitId: Long)


}

