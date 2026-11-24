package com.example.mobileappproject

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.keepScreenOn
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileappproject.ui.theme.MobileAppProjectTheme


@Composable
fun HomeScreen(
    onSeePlansClicked: () -> Unit,
    onEditPlanClicked: () -> Unit,
    onBeginWorkoutClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.home_title),
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(
            modifier = Modifier.padding(16.dp)
        )
        Button(
            onClick = onSeePlansClicked
        ) {
            Text(stringResource(R.string.see_workout_plans))
        }
        Button(
            onClick = onEditPlanClicked
        ) {
            Text(stringResource(R.string.edit_workout_plan))
        }
        Button(
            onClick = onBeginWorkoutClicked
        ) {
            Text(stringResource(R.string.begin_workout))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MobileAppProjectTheme(){
        HomeScreen(
            onSeePlansClicked = {},
            onEditPlanClicked = {},
            onBeginWorkoutClicked = {}
        )
    }
}