package com.app.studyreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.app.questiontest2.R;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(">>Clik--","");

                Intent intent = new Intent();
                intent.setAction("com.receiver");
                intent.putExtra("iData","hi Android");
                sendBroadcast(intent);

            }
        });

    }
}
