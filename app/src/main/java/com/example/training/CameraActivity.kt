package com.example.training

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import androidx.core.content.withStyledAttributes
import kotlinx.android.synthetic.main.activity_camera.*

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)


        btnVideo.isEnabled = false
        if (ActivityCompat.checkSelfPermission(this , Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA),1)
        }else{
            btnVideo.isEnabled = true

        }
        btnVideo.setOnClickListener {
            var intent  = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivityForResult(intent,11)
        }
        btnImage.setOnClickListener {
            var intent  = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,123)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 11 ){
            videoView.setVideoURI(data?.data)
            videoView.start()
        }

        if (requestCode == 123 ){
            val takenPicture =  data?.extras?.get("data") as Bitmap
            imageView3.setImageBitmap(takenPicture)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            btnVideo.isEnabled = true
        }
    }
}