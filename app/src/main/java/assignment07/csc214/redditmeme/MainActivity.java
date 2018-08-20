package assignment07.csc214.redditmeme;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.Fragment;


import static assignment07.csc214.redditmeme.R.string.testText;

public class MainActivity extends AppCompatActivity {

    //Context mContext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = findViewById(R.id.text1);

        //final TextView an = findViewById(R.id.animText);

//        Animation bottomUp = AnimationUtils.loadAnimation(this,
//                R.anim.bottom_up);
//
//        an.startAnimation(bottomUp);



        final Switch switch1 = findViewById(R.id.switch1);
        final Switch switch2 = findViewById(R.id.switch2);
        final Switch switch3 = findViewById(R.id.switch3);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked && switch2.isChecked() && switch3.isChecked()){
                    if(isChecked){
                        switch2.setChecked(false);
                    }

                }

                if (isChecked){
                    t.setText("Yes");
                }
                else{
                    t.setText("No");
                }
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked && switch1.isChecked() && switch3.isChecked()){
                    if(isChecked){
                        switch3.setChecked(false);
                    }

                }



                if (isChecked){
                    t.setText("Yes2");
                }
                else{
                    t.setText("No3");
                }
            }
        });

        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked && switch1.isChecked() && switch2.isChecked()){
                    if(isChecked){
                        switch1.setChecked(false);
                    }

                }


                if (isChecked){
                    t.setText("Yes3");
                }
                else{
                    t.setText("No3");
                }
            }
        });




    }//onCreate



}
