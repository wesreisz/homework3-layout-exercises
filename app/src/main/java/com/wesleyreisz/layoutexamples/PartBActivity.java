package com.wesleyreisz.layoutexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PartBActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "Part-B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_b);

        Button btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        /*get data*/
        EditText txtName = (EditText)findViewById(R.id.txtName);
        EditText txtCity = (EditText)findViewById(R.id.txtCity);
        EditText txtState = (EditText)findViewById(R.id.txtState);
        EditText txtZip = (EditText)findViewById(R.id.txtZip);
        String result = String.format(
                "Result: Name: %s, City: %s, State: %s, Zip: %s",
                txtName.getText(), txtCity.getText(), txtState.getText(), txtZip.getText()
        );
        Log.d(TAG,result);

        Toast toast = Toast.makeText(PartBActivity.this, "Form Submitted Successfully", Toast.LENGTH_SHORT);
        toast.show();
    }
}
