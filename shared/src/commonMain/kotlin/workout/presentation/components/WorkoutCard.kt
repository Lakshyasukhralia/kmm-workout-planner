package workout.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import core.utils.AsyncImage
import workout.presentation.models.WorkoutModel

@Composable
fun WorkoutCard(
    workoutModel: WorkoutModel = WorkoutModel(1, "Squats", "Core"),
    onClick: () -> Unit = {}
) {

    Card(
        elevation = 3.dp,
        shape = RoundedCornerShape(14.dp),
        modifier = Modifier
            .wrapContentSize()
            .padding(5.dp)
            .clickable { }
            .height(IntrinsicSize.Min),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .size(75.dp)
                        .weight(1f),
                    elevation = 5.dp
                ) {
                    AsyncImage(
                        imageUrl = "https://picsum.photos/200",
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp)
                    .padding(vertical = 10.dp)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(
                    text = workoutModel.name,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                )
                Text(
                    text = "It's important to listen to your body and avoid any exercises",
                    color = Color.Black,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    maxLines = 3
                )
            }
        }
    }
}
