package tw.edu.pu.s1081707.baby1

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game_main.*

class GameMainActivity : AppCompatActivity(), View.OnClickListener {
    var xdata: String = ""

    private var soundPool1: SoundPool? = null
    private val soundId = 1
    private var soundPool2: SoundPool? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)

        soundPool1 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool1!!.load(baseContext, R.raw.yes, 0)

        soundPool2 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool2!!.load(baseContext, R.raw.no, 1)

        val rollButton: Button = findViewById(R.id.button3)
        rollButton.setOnClickListener {
            game()
            button3.text = "跳過"
        }
    }

    fun game(){
        var b:Boolean = false
        var theme: Int = (1..4).random()
        var x: Int = (1..6).random()

        when(theme){
            1 -> {
                when(x){
                    1 -> {
                        img.setImageResource(R.drawable.ambulance)
                        xdata = "救護車"
                    }
                    2 -> {
                        img.setImageResource(R.drawable.bicycle)
                        xdata = "腳踏車"
                    }
                    3 -> {
                        img.setImageResource(R.drawable.bus)
                        xdata = "公車"
                    }
                    4 -> {
                        img.setImageResource(R.drawable.whitecar)
                        xdata = "轎車"
                    }
                    5 -> {
                        img.setImageResource(R.drawable.firetruck)
                        xdata = "消防車"
                    }
                    6 -> {
                        img.setImageResource(R.drawable.motorcycle)
                        xdata = "摩托車"
                    }
                    7 -> {
                        img.setImageResource(R.drawable.police)
                        xdata = "警察車"
                    }
                    8 -> {
                        img.setImageResource(R.drawable.taxi)
                        xdata = "計程車"
                    }
                }
            }
            2 -> {
                when(x){
                    1 -> {
                        img.setImageResource(R.drawable.veg1)
                        xdata = "馬鈴薯"
                    }
                    2 -> {
                        img.setImageResource(R.drawable.veg2)
                        xdata = "瓠瓜"
                    }
                    3 -> {
                        img.setImageResource(R.drawable.veg3)
                        xdata = "番茄"
                    }
                    4 -> {
                        img.setImageResource(R.drawable.veg8)
                        xdata = "花椰菜"
                    }
                    5 -> {
                        img.setImageResource(R.drawable.veg4)
                        xdata = "白菜"
                    }
                    6 -> {
                        img.setImageResource(R.drawable.veg7)
                        xdata = "紅椒"
                    }
                    7 -> {
                        img.setImageResource(R.drawable.veg5)
                        xdata = "洋蔥"
                    }
                    8 -> {
                        img.setImageResource(R.drawable.veg6)
                        xdata = "南瓜"
                    }
                }
            }
            3 -> {
                when(x){
                    1 -> {
                        img.setImageResource(R.drawable.sha1)
                        xdata = "圓形"
                    }
                    2 -> {
                        img.setImageResource(R.drawable.sha2)
                        xdata = "橢圓形"
                    }
                    3 -> {
                        img.setImageResource(R.drawable.sha3)
                        xdata = "心型"
                    }
                    4 -> {
                        img.setImageResource(R.drawable.sha8)
                        xdata = "三角形"
                    }
                    5 -> {
                        img.setImageResource(R.drawable.sha4)
                        xdata = "五邊形"
                    }
                    6 -> {
                        img.setImageResource(R.drawable.sha7)
                        xdata = "星形"
                    }
                    7 -> {
                        img.setImageResource(R.drawable.sha5)
                        xdata = "長方形"
                    }
                    8 -> {
                        img.setImageResource(R.drawable.sha6)
                        xdata = "正方形"
                    }
                }
            }
            4 -> {
                when(x){
                    1 -> {
                        img.setImageResource(R.drawable.ani1)
                        xdata = "貓"
                    }
                    2 -> {
                        img.setImageResource(R.drawable.ani2)
                        xdata = "狗"
                    }
                    3 -> {
                        img.setImageResource(R.drawable.ani3)
                        xdata = "無尾熊"
                    }
                    4 -> {
                        img.setImageResource(R.drawable.ani8)
                        xdata = "老虎"
                    }
                    5 -> {
                        img.setImageResource(R.drawable.ani4)
                        xdata = "老鼠"
                    }
                    6 -> {
                        img.setImageResource(R.drawable.ani7)
                        xdata = "企鵝"
                    }
                    7 -> {
                        img.setImageResource(R.drawable.ani5)
                        xdata = "貓頭鷹"
                    }
                    8 -> {
                        img.setImageResource(R.drawable.ani6)
                        xdata = "豹"
                    }
                }
            }
        }



        //改變按鈕
        var y: Int = (1..6).random()
        var ydata: String = ""
        while (y==x){
            y = (1..6).random()
        }

        when(theme){
            1 -> {
                when(y){
                    1 -> ydata = "救護車"
                    2 -> ydata = "腳踏車"
                    3 -> ydata = "公車"
                    4 -> ydata = "轎車"
                    5 -> ydata = "消防車"
                    6 -> ydata = "摩托車"
                    7 -> ydata = "警察車"
                    8 -> ydata = "計程車"
                }
            }
            2 -> {
                when(y){
                    1 -> ydata = "馬鈴薯"
                    2 -> ydata = "瓠瓜"
                    3 -> ydata = "番茄"
                    4 -> ydata = "花椰菜"
                    5 -> ydata = "白菜"
                    6 -> ydata = "紅椒"
                    7 -> ydata = "洋蔥"
                    8 -> ydata = "南瓜"
                }
            }
            3 -> {
                when(y){
                    1 -> ydata = "圓形"
                    2 -> ydata = "橢圓形"
                    3 -> ydata = "心型"
                    4 -> ydata = "三角形"
                    5 -> ydata = "五邊形"
                    6 -> ydata = "星形"
                    7 -> ydata = "長方形"
                    8 -> ydata = "正方形"
                }
            }
            4 -> {
                when(y){
                    1 -> ydata = "貓"
                    2 -> ydata = "狗"
                    3 -> ydata = "無尾熊"
                    4 -> ydata = "老虎"
                    5 -> ydata = "老鼠"
                    6 -> ydata = "企鵝"
                    7 -> ydata = "貓頭鷹"
                    8 -> ydata = "豹"
                }
            }
        }

        var key: Int = (1..2).random()
        if(key==1){
            button1.text = xdata
            button2.text = ydata
        }else{
            button1.text = ydata
            button2.text = xdata
        }
    }

    override fun onClick(view: View) {
        if (view.id.equals(R.id.button1)){
            if(button1.text==xdata){
                Toast.makeText(baseContext, "答對", Toast.LENGTH_SHORT).show()
                soundPool1?.play(soundId, 1F, 1F, 0, 0, 1F)
                game()
            }else{
                Toast.makeText(baseContext, "答錯", Toast.LENGTH_SHORT).show()
                soundPool2?.play(soundId, 1F, 1F, 0, 0, 1F)
            }
        }
        else{
            if(button2.text==xdata){
                Toast.makeText(baseContext, "答對", Toast.LENGTH_SHORT).show()
                soundPool1?.play(soundId, 1F, 1F, 0, 0, 1F)
                game()
            }else{
                Toast.makeText(baseContext, "答錯", Toast.LENGTH_SHORT).show()
                soundPool2?.play(soundId, 1F, 1F, 0, 0, 1F)
            }
        }
    }
}