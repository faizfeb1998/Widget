package com.example.faiz.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    EditText editTitle,editContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init Paper
        Paper.init(this);

        btnSave = (Button)findViewById(R.id.btn_save);
        editTitle = (EditText) findViewById(R.id.edit_title);
        editContent = (EditText) findViewById(R.id.edit_content);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paper.book().write("title",editTitle.getText().toString());
                Paper.book().write("description",editContent.getText().toString());

            }
        });
    }
}
