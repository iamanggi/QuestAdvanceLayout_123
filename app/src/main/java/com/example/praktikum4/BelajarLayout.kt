package com.example.praktikum4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.concurrent.ConcurrentLinkedQueue

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier)
{
    Column(
        modifier = Modifier.fillMaxSize())
    {
        HeaderSection()
        DetailMhs(param = "Nama", argum = "Anggi Puspita")
        DetailMhs(param = "Nim" , argum = "20220140123")
        DetailMhs(param = "Prodi", argum = "Teknologi Informasi")
        DetailMhs(param = "Fakultas", argum = "Teknik")
        DetailMhs(param = "Universitas", argum = "Universitas Muhammadiyah Yogyakarta")
        DetailMhs(param = "Alamat", argum = "Cirebon, Jawa Barat")
        DetailMhs(param = "Email", argum = "anggi.puspita.ft22@mail.umy.ac.id")
    }
}


@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray))
    {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp))
        {
            Box(
                contentAlignment = Alignment.BottomEnd)
            {
                Image(painter = painterResource(id = R.drawable.ti_umyy),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape))

                Icon(Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                        .background(Color.Blue), tint = Color.White)
            }

            Column(
                modifier = Modifier.padding(16.dp))
            {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }

        }

    }
}

@Composable
fun DetailMhs(
    param: String, argum: String
){
    Column(
        modifier = Modifier.padding(16.dp))
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Text(text = param,
                modifier = Modifier.weight(0.8f)) // memberi ruang seberapa banyak dalam kolon/barisnya
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argum, //kenapa argum? karena isinya akan digantikan dengan parameter argum
                modifier = Modifier.weight(2f))

        }
    }
}