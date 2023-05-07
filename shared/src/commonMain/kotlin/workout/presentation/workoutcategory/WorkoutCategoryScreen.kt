package workout.presentation.workoutcategory

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import workout.presentation.components.WorkoutCategoryCard
import workout.presentation.workoutlisting.WorkoutListingScreen

class WorkoutCategoryScreen : Screen {


    private val workoutCategoryList =
        listOf<String>("Abs", "Back", "Shoulder", "Arms", "Biceps", "Triceps")

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,

            ) {
            item {
                Text(
                    text = "Workout",
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Normal,
                    fontSize = 32.sp,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "Categories.",
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            items(workoutCategoryList) {
                WorkoutCategoryCard(it) { navigator.push(WorkoutListingScreen(it)) }
            }
        }
    }

}