package com.bolex.addshortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button) findViewById(R.id.add);
        final EditText name = (EditText) findViewById(R.id.name);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShortCutUtils.addShortcut(MainActivity.this, name.getText() != null ? name.getText().toString() : "1");
            }
        });
    }


}
