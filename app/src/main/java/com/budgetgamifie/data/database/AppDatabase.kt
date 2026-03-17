package com.budgetgamifie.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.budgetgamifie.data.model.Expense

@Database(entities = [Expense::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao
}