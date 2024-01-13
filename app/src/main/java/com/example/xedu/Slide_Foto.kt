package com.example.xedu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Slide_Foto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xedu_belajar)

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://cdn1.katadata.co.id/media/images/thumb/2022/10/10/Ilustrasi_Hari_Kesehatan_Mental_Sedunia_2022-2022_10_10-09_34_55_7386f8477c9bd2536012580a10816ddd_960x640_thumb.jpg", "Gambar 1"))
        imageList.add(SlideModel("https://grhasia.jogjaprov.go.id/assets/content_upload/images/imagefile__2020_12_15_09_54_47.jpg", "Gambar 2"))
        imageList.add(SlideModel("https://sehatnegeriku.kemkes.go.id/wp-content/uploads/2023/10/Screenshot_20231012_211304_Samsung-Notes.jpg", "Gambar 3"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
        }
}