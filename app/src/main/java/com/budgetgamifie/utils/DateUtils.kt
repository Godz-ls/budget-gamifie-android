package com.budgetgamifie.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
    private const val DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss"

    // Convert timestamp to readable date string
    fun convertTimestampToReadableDate(timestamp: Long, format: String = DEFAULT_DATE_FORMAT): String {
        val dateFormat = SimpleDateFormat(format, Locale.getDefault())
        return dateFormat.format(Date(timestamp))
    }

    // Get current date and time as a formatted string
    fun getCurrentDateTime(format: String = DEFAULT_DATE_FORMAT): String {
        val dateFormat = SimpleDateFormat(format, Locale.getDefault())
        return dateFormat.format(Date())
    }
}