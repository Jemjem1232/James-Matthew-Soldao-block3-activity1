package Soldao_JamesMatthew_Block3.p1quiz

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class cardpicker : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

    }
}