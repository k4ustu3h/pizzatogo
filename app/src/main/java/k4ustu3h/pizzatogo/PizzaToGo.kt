package k4ustu3h.pizzatogo

import android.app.Application
import com.google.android.material.color.DynamicColors

class PizzaToGo : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}