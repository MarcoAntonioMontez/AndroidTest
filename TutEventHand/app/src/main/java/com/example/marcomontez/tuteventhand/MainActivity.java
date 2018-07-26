package com.example.marcomontez.tuteventhand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buckysButton = (Button)findViewById(R.id.buckysButton);
        buckysButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        TextView buckysText=(TextView)findViewById(R.id.buckysText);
                        buckysText.setText("Good Job!");
                    }
                }
        );

        buckysButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View view) {
                        TextView buckysText = (TextView) findViewById(R.id.buckysText);
                        buckysText.setText("That was a long click :O ");
                        return true;
                    }
                }

        );

        

    }
}
