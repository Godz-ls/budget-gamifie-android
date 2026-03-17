import android.content.Context
import android.content.SharedPreferences

class UserPreferences(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    var monthlySalary: Float
        get() = prefs.getFloat("monthly_salary", 0f)
        set(value) = prefs.edit().putFloat("monthly_salary", value).apply()

    var someSetting: Boolean
        get() = prefs.getBoolean("some_setting", false)
        set(value) = prefs.edit().putBoolean("some_setting", value).apply()

    // Additional settings can be added here
}