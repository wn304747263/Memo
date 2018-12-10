package com.example.ex_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 =(Button)findViewById(R.id.btn);
        Button btn_login=(Button)findViewById(R.id.login);
        final EditText editText =(EditText)findViewById(R.id.pwd);
        final EditText editText1 =(EditText)findViewById(R.id.user);
        Button btn_register=(Button)findViewById(R.id.register);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user =editText.getText().toString();
                String pwd=editText1.getText().toString();
                if(user.equals("")){
                    Toast tst = Toast.makeText(MainActivity.this,"账号不能为空！",Toast.LENGTH_SHORT);
                    tst.show();
                  // Intent i =new Intent(MainActivity.this,MainActivity2.class);
                   //startActivity(i);
                }else if(pwd.equals("")){
                   Toast tst = Toast.makeText(MainActivity.this, "请输入密码！", Toast.LENGTH_SHORT);
                   tst.show();
                }else {
                     Intent i =new Intent(MainActivity.this,Main4Activity.class);
                     startActivity(i);
                }
            }
        });

    }
    public void MyonClick(View v) {
        Toast tst = Toast.makeText(MainActivity.this, "我叫向冲", Toast.LENGTH_SHORT);
        tst.show();
    }

}
