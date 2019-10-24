package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void on_button_click(View view){

        TextView tv = this.findViewById(R.id.NumberTextView);

        Random r = new Random();

        int number = r.nextInt(7);
        tv.setText(Integer.toString(number));
        level2_3();
    }

    public void level2_3(){

        TextView mssgoutput = this.findViewById(R.id.message);
        TextView tv = this.findViewById(R.id.NumberTextView);
        TextView inputt = this.findViewById(R.id.input);
        TextView score1 = this.findViewById(R.id.score);

        int random = Integer.parseInt(tv.getText().toString());
        int inputUser = Integer.parseInt(inputt.getText().toString());
        int score2  = Integer.parseInt(score1.getText().toString());

        if (random == inputUser){
            mssgoutput.setText("Congratulations!!");
          score2++;
          score1.setText(Integer.toString(score2));
        }
        else{
            mssgoutput.setText("Keep Trying");
        }










    }
}

