import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import workout.presentation.workoutcategory.WorkoutCategoryScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(WorkoutCategoryScreen())
    }
}

expect fun getPlatformName(): String