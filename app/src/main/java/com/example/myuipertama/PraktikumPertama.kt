package com.example.myuipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    // Tambahkan background utama warna hitam dan pusatkan konten
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        // Gunakan Column utama untuk menata konten vertikal secara seimbang
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 60.dp, bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Bagian atas — menampilkan informasi profil
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                // Tampilkan foto profil berbentuk lingkaran
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Foto Profil",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Tambahkan nama utama pengguna
                Text(
                    text = "Aini Rana Salsabil",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Tambahkan username dan email dengan warna abu-abu lembut
                Text(
                    text = "@aini_rana",
                    fontSize = 14.sp,
                    color = Color(0xFFBBBBBB)
                )

                Text(
                    text = "ainiranasalsabil09.com",
                    fontSize = 13.sp,
                    color = Color(0xFFBBBBBB)
                )

                Spacer(modifier = Modifier.height(14.dp))

                // Tambahkan deskripsi singkat pekerjaan atau bio
                Text(
                    text = "Saya seorang Data Analyst",
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Tambahkan barisan ikon media sosial dengan jarak teratur
                Row(
                    horizontalArrangement = Arrangement.spacedBy(22.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Ikon Facebook dengan aksi klik
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "Facebook",
                        modifier = Modifier
                            .size(42.dp)
                            .clickable { }
                    )
                    // Ikon Twitter dengan aksi klik
                    Image(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "Twitter",
                        modifier = Modifier
                            .size(42.dp)
                            .clickable { }
