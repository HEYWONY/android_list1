package com.example.a220118_mp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);

        // 우리는 최근에 ArrayAdapter<String> adapter = new ArrayAdapter<String> (this
        // 라는 문장을 사용할 수 있다. 그리고 이 안에 들어가는 것은 배열의 요소 타입을 선언하는 것이다.
        // 글씨, 예시로 들자면 nct DREAM의 고래 즉 text 타입, String 타입이다. 그렇기 때문에 <String> 이 들어가는 것이다.
        // 만약 ArrayAdapter<Integer> 로 선언을 했다면 배열을 int 형으로 하겠다는 의미이다.

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,
                android.R.layout.simple_list_item_1, new String[] { "apple", "orange", "banana"});
                //simple_list_item_1은 안드로이드의 핵심 포인트이다. -> 자식 뷰를 만들 때 사용할 레이아웃
        list.setAdapter(adapter);

    }
}