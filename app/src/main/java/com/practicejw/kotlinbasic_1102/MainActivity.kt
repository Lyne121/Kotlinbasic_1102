package com.practicejw.kotlinbasic_1102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

//          Ctrl + / : 이 줄을 주석으로 변경 혹은 해제
//          주석 ? 코드에 메모 남기기. 컴퓨터가 분석하지 않고 넘어감

//          로그를 찍어보기
            Log.d("메인화면", "로그찍기 버튼이 눌림")
            Log.e("메인화면", "Log.e로 찍어보기")

        }

        btnToast.setOnClickListener {
//            토스트 버튼이 눌리면 할 일 지정

//            토스트 띄우기
            Toast.makeText(this, "토스트 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()

        }

        btnToast2.setOnClickListener {

            Toast.makeText(this, "두번째 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()

        }

        btnCopyText.setOnClickListener {
//            1. 입력칸에 어떤 내용이 있는지? > 컴퓨터에게 메모 명령하자 = 변수를 만들고 값을 담아두자
            val inputContent = edtContent.text.toString()

//            2. 텍스트 뷰에 알아낸 내용을 세팅 = 메모해둔 내용을 > 텍스트 뷰의 text 속성에 대입한다
            txtCopyResult.text = inputContent
        }

        btnContentToast.setOnClickListener {
            val inputContent = edtContent.text.toString()

//            입력된 내용을 > 토스트로 출력
            Toast.makeText()
        }

    }

}