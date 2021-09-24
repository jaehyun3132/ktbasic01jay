package com.example.ktbasic01jay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

            //코드에 메모 남기기 + 주석
// Ctrl + / 하면 주석처리 {이 중괄호} 안에 있는 코드만 ,버튼이 눌렸을 떄 실행됨

            Log.d("메인화면로그", "클릭버튼이 눌림")
            Log.e("메인화면로그","에러관련로그")
        }
        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()

        }
    }
}