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
        val cardImages: IntArray = intArrayOf(
            R.drawable.clubace,
            R.drawable.clubeight,
            R.drawable.clubfive,
            R.drawable.clubfour,
            R.drawable.clubjack,
            R.drawable.clubking,
            R.drawable.clubnine,
            R.drawable.clubqueen,
            R.drawable.clubseven,
            R.drawable.clubsix,
            R.drawable.clubten,
            R.drawable.diamondthree,
            R.drawable.diamondace,
            R.drawable.diamondeight,
            R.drawable.diamondfive,
            R.drawable.diamondfour,
            R.drawable.diamondjack,
            R.drawable.diamondking,
            R.drawable.diamondnine,
            R.drawable.diamondqueen,
            R.drawable.diamondseven,
            R.drawable.diamondsix,
            R.drawable.diamondten,
            R.drawable.diamondthree,
            R.drawable.heartthree,
            R.drawable.heartace,
            R.drawable.hearteight,
            R.drawable.heartfive,
            R.drawable.heartfour,
            R.drawable.heartjack,
            R.drawable.heartking,
            R.drawable.heartnine,
            R.drawable.heartqueen,
            R.drawable.heartseven,
            R.drawable.heartsix,
            R.drawable.heartten,
            R.drawable.heartthree,
            R.drawable.spadethree,
            R.drawable.spadeace,
            R.drawable.spadeeight,
            R.drawable.spadefive,
            R.drawable.spadejack,
            R.drawable.spadeking,
            R.drawable.spadenine,
            R.drawable.spadequeen,
            R.drawable.spadeseven,
            R.drawable.spadesix,
            R.drawable.spadeten,
            R.drawable.spadethree,

            )

        button.setOnClickListener {
            val random = Random
            imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }

    }
}




