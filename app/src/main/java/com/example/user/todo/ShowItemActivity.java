package com.example.user.todo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowItemActivity extends AppCompatActivity {

    private TextView title;
    private TextView text;
    private TextView edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);

        title=findViewById(R.id.title);
        text=findViewById(R.id.text);
        edit=findViewById(R.id.edit);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShowItemActivity.this,NewActivity.class);
                startActivity(intent);
            }
        });
    }
}
