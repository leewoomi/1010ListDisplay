package com.example.a503_08.a1010listdisplay;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {



    public DBOpenHelper(Context context){


        super(context,"data.db",null,1);

    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table tb_data("+"_id integer primary key autoincrement,"+" name text, "+"phone text);");
        db.execSQL("insert into tb_data(name, phone) values('고아라','01012345678');");
        db.execSQL("insert into tb_data(name, phone) values('서현진','01023456789');");
        db.execSQL("insert into tb_data(name, phone) values('아이유','01054378745');");
        db.execSQL("insert into tb_data(name, phone) values('수지','01043789876');");
    }



    //버전이 변경되었을 때 호출되는 메소드
    //테이블을 삭제하고 다시 생성
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
        db.execSQL("drop table tb_data;");
        onCreate(db);
    }




}
