package tw.edu.pu.s1081707.baby1

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_car_main.*

class CarMainActivity : AppCompatActivity() {
    private var soundPool1: SoundPool? = null
    private val soundId1 = 1

    private var soundPool2: SoundPool? = null
    private val soundId2 = 2

    private var soundPool3: SoundPool? = null
    private val soundId3 = 3

    private var soundPool4: SoundPool? = null
    private val soundId4 = 4

    private var soundPool5: SoundPool? = null
    private val soundId5 = 5

    private var soundPool6: SoundPool? = null
    private val soundId6 = 6

    private var soundPool7: SoundPool? = null
    private val soundId7 = 7

    private var soundPool8: SoundPool? = null
    private val soundId8 = 8


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_main)

        soundPool1 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool1!!.load(baseContext, R.raw.ambutlance_mc, 1)

        soundPool2 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool2!!.load(baseContext, R.raw.carmc2, 2)

        soundPool3 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool3!!.load(baseContext, R.raw.carmc3, 3)

        soundPool4 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool4!!.load(baseContext, R.raw.carmc4, 4)

        soundPool5 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool5!!.load(baseContext, R.raw.carmc5, 5)

        soundPool6 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool6!!.load(baseContext, R.raw.carmc6, 6)

        soundPool7 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool7!!.load(baseContext, R.raw.carmc7, 7)

        soundPool8 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool8!!.load(baseContext, R.raw.carmc8, 8)


    }

    fun playSound1(view: View) {
        soundPool1?.play(soundId1, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound2(view: View) {
        soundPool2?.play(soundId2, 1F, 1F, 1, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound3(view: View) {
        soundPool3?.play(soundId3, 1F, 1F, 2, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound4(view: View) {
        soundPool4?.play(soundId4, 1F, 1F, 3, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound5(view: View) {
        soundPool5?.play(soundId5, 1F, 1F, 4, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound6(view: View) {
        soundPool6?.play(soundId6, 1F, 1F, 5, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound7(view: View) {
        soundPool7?.play(soundId7, 1F, 1F, 6, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound8(view: View) {
        soundPool8?.play(soundId8, 1F, 1F, 7, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }
}