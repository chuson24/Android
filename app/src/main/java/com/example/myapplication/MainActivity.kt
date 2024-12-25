package com.example.myapplication

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Cyan) // Đặt nền cyan cho toàn bộ màn hình
                ) {
                    GreetingText(
                        name = "Android",
                        from = "Eaama"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Cyan) // Đảm bảo màu nền cyan ở Column
    ) {
        // Hiển thị ảnh từ tài nguyên
        val image = painterResource(id = R.drawable.cam_bien_sieu_am)
        Image(painter = image,
            alpha = 0.5F,
            contentDescription = "Image aa",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(200.dp)
        )


        Spacer(modifier = Modifier.height(16.dp))

        // Hiển thị tên và thông tin
        Text(
            text = "Hello 12 3 $name!",
            fontSize = 50.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp)) // Thêm khoảng cách giữa 2 Text
        Text(
            text = "From $from",
            fontSize = 50.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )

        // Nút bấm
        Button(
            onClick = { /* TODO: Thêm logic xử lý */ },
            modifier = Modifier.size(200.dp, 60.dp) // Thêm padding xung quanh nút
        ) {
            Text(
                text = "Click Me",
                fontSize = 24.sp, // Chỉnh sửa kích thước chữ
            )
        }
    }
}

@Preview(showBackground = true, name = "my preview")
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        GreetingText("Android", "From Emma")
    }
}