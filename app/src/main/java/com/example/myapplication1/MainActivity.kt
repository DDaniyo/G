package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * 액티비티가 실행 될 떄 호출되는 함수입니다.
         * 인텐트를 DeloyedMessageService 객체로 넘겨줍니다.
         * @param view 뷰 클래스의 객체를 인자로 넘겨받습니다.
         * @Warning 주의사항 없습니다.
         * @sww DeloyedMessageService
         */
    }
}