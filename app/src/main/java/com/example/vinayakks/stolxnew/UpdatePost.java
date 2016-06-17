package com.example.vinayakks.stolxnew;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.vinayakks.stolxnew.MainActivity;
public class UpdatePost extends AppCompatActivity {
    protected EditText title;
    protected EditText desc;
    protected ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_post);
        title = (EditText)findViewById(R.id.title);
        desc = (EditText)findViewById(R.id.desc);
        button = (ImageButton)findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(UpdatePost.this);
                builder.setMessage("Hello this is alert box");
                builder.setCancelable(false);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
