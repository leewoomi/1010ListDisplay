package com.example.a503_08.a1010listdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SimpleAdapter를 이용해서 출력할 데이터 생성
        //List<Map<String, Object>> 구조
        List<Map<String,String>> list =new  ArrayList<>();
        Map<String,String> map =new HashMap<>();
        map.put("name","아이유");
        map.put("phone","01011111111");
        list.add(map);

        map = new HashMap<>();
        map.put("name","수지");
        map.put("phone","01022222222");
        list.add(map);

        map = new HashMap<>();
        map.put("name","강다니엘");
        map.put("phone","01033333333");
        list.add(map);

        map = new HashMap<>();
        map.put("name","옹성우");
        map.put("phone","01044444444");
        list.add(map);

       //데이터 출력을 위한 Adapter 생성
        //첫번째 Context
        //두번째 데이터
        //세번째 셀의 출력 모양
        //네번째 출력할 데이터의 키 배열
        //다섯번째 출력할 셀 안의 id
        SimpleAdapter adapter = new SimpleAdapter(this, list,android.R.layout.simple_list_item_2,new String[]{"name","phone"},new int[]{android.R.id.text1,android.R.id.text2});


        //ListView에 adapter를 연결해서 출력
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
