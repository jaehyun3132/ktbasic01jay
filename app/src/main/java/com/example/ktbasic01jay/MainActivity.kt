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
// 문법 연습( 변수)
// 변수만들기
        val myName = "이재현"  //변수생성 + 대입 = 변수의 초기화

        Log.d("변수값" , myName)

//        문법연습 (조건문)
//        나이를 확인해서 > 성인인지 아닌지


        val userAge = 20


        if (userAge >= 20) {

            Log.d("성인판별", "성인이 맞습니다")
        }

        else if (userAge >=17){

                Log.d("성인판별","고등학생")

            }
        else {
            Log.d("성인판별","성인이 아닙니다")
        }

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