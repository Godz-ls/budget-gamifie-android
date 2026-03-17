package com.budgetgamifie.data.repository

import androidx.lifecycle.LiveData
import com.budgetgamifie.data.model.Expense
import com.budgetgamifie.data.model.UserData

class BudgetRepository {
    // Method to get all expenses
    fun getAllExpenses(): LiveData<List<Expense>> {
        // Implementation here
    }

    // Method to add a new expense
    fun addExpense(expense: Expense) {
        // Implementation here
    }

    // Method to delete an expense
    fun deleteExpense(expenseId: String) {
        // Implementation here
    }

    // Method to get user data
    fun getUserData(userId: String): LiveData<UserData> {
        // Implementation here
    }

    // Method to update user data
    fun updateUserData(userData: UserData) {
        // Implementation here
    }
}