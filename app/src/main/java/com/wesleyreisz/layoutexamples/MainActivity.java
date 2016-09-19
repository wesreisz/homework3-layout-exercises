package com.wesleyreisz.layoutexamples;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fireScissors(View view){
        showToast("Scissors was clicked");
    }
    public void fireRock(View view){
        showToast("Rock was clicked");
    }
    public void firePaper(View view){
        showToast("Paper was clicked");
    }
    public void fireSpock(View view){
        showToast("Spock was clicked");
    }
    public void fireLizard(View view){
        showToast("Lizard was clicked");
    }
    private void showToast(String message){
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
