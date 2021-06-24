package tw.edu.pu.s1081707.baby1

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_car_main.*

class ShaMainActivity : AppCompatActivity() {

    private var soundPool1: SoundPool? = null
    private val soundId = 1

    private var soundPool2: SoundPool? = null

    private var soundPool3: SoundPool? = null

    private var soundPool4: SoundPool? = null

    private var soundPool5: SoundPool? = null

    private var soundPool6: SoundPool? = null

    private var soundPool7: SoundPool? = null

    private var soundPool8: SoundPool? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sha_main)
        button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                finish()

            }
        })

        soundPool1 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool1!!.load(baseContext, R.raw.sha1, 0)

        soundPool2 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool2!!.load(baseContext, R.raw.sha2, 1)

        soundPool3 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool3!!.load(baseContext, R.raw.sha3, 3)

        soundPool4 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool4!!.load(baseContext, R.raw.sha4, 4)

        soundPool5 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool5!!.load(baseContext, R.raw.sha5, 5)

        soundPool6 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool6!!.load(baseContext, R.raw.sha6, 6)

        soundPool7 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool7!!.load(baseContext, R.raw.sha7, 7)

        soundPool8 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool8!!.load(baseContext, R.raw.sha8, 8)
    }

    fun playSound1(view: View) {
        soundPool1?.play(soundId, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound2(view: View) {
        soundPool2?.play(soundId, 1F, 1F, 1, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound3(view: View) {
        soundPool3?.play(soundId, 1F, 1F, 2, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound4(view: View) {
        soundPool4?.play(soundId, 1F, 1F, 3, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound5(view: View) {
        soundPool5?.play(soundId, 1F, 1F, 4, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound6(view: View) {
        soundPool6?.play(soundId, 1F, 1F, 5, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound7(view: View) {
        soundPool7?.play(soundId, 1F, 1F, 6, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound8(view: View) {
        soundPool8?.play(soundId, 1F, 1F, 7, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }
}