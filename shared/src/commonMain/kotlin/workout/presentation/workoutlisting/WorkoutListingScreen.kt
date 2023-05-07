package workout.presentation.workoutlisting

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import workout.presentation.components.WorkoutCard
import workout.presentation.models.WorkoutModel

class WorkoutListingScreen(val category: String = "My Category") : Screen {

    val workoutList = listOf(
        WorkoutModel(1, "Squats", "Core workout"),
        WorkoutModel(1, "Leg Curl", "Core workout"),
        WorkoutModel(1, "Deadlift", "Core workout"),
        WorkoutModel(1, "Squats", "Core workout"),
        WorkoutModel(1, "Squats", "Core workout"),
        WorkoutModel(1, "Squats", "Core workout"),
        WorkoutModel(1, "Squats", "Core workout"),
        WorkoutModel(1, "Squats", "Core workout"),
        WorkoutModel(1, "Squats", "Core workout"),
    )

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,

            ) {
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource("arrow_back_headless.xml"),
                        contentDescription = "Back",
                        modifier = Modifier.size(30.dp).clickable {
                            navigator.pop()
                        }
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = category,
                            textAlign = TextAlign.Start,
                            fontWeight = FontWeight.Normal,
                            fontSize = 32.sp,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Text(
                            text = "Workouts.",
                            textAlign = TextAlign.Start,
                            fontWeight = FontWeight.Bold,
                            fontSize = 32.sp,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
            items(workoutList) {
                WorkoutCard(it)
            }
        }
    }
}