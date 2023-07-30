package com.example.instagram.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.R
import com.example.instagram.ui.theme.InstagramTheme

@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ), backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp)
                )

                UsersStatistics(title = "Posts", value = "6,950")
                UsersStatistics(title = "Followers", value = "436M")
                UsersStatistics(title = "Following", value = "76")
            }

            Text(
                text = "Instagram",
                fontSize = (32.sp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "#YoursToMake",
                fontSize = (14.sp),
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "www.facebook.com/emotional_health",
                fontSize = (14.sp),
                fontWeight = FontWeight.ExtraBold
            )
            Button(onClick = { }) {
                Text(text = "Follow")
            }
        }
    }
}

@Composable
private fun UsersStatistics(
    title: String,
    value: String,
) {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    InstagramTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    InstagramTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}