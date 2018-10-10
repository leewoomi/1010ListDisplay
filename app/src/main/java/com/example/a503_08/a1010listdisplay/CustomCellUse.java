package com.example.a503_08.a1010listdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomCellUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_cell_use);

        //출력할 데이터 생성
        List<VO> list = new ArrayList<>();
        VO vo = new VO();
        vo.setIcon(R.drawable.ninza);
        vo.setName("채팅");
        list.add(vo);


        vo = new VO();
        vo.setIcon(R.drawable.chicken);
        vo.setName("배달");
        list.add(vo);


        //데이터를 출력할 Adapter 만들기
        MyAdapter adapter = new MyAdapter(this, list, R.layout.icontext);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);


        AnimationSet set = new AnimationSet(true);

        Animation rtl = new TranslateAnimation(Animation.RELATIVE_TO_SELF,1.0f,
                Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
        rtl.setDuration(3000);
        set.addAnimation(rtl);

        Animation alpha = new AlphaAnimation(0.0f,1.0f);
        alpha.setDuration(1000);
        set.addAnimation(alpha);
        LayoutAnimationController controller = new LayoutAnimationController(set, 0.5f);
        listView.setLayoutAnimation(controller);


    }
}
