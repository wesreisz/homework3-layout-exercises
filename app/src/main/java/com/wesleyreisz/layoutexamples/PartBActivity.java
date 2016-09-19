package com.wesleyreisz.layoutexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class PartBActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "Part-B";
    private static final String[] STATES = new String[]{"California", "New York", "Texas", "Kentucky"};

    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_b);

        Spinner listState = (Spinner)findViewById(R.id.spinnerState);
        listAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,STATES);
        listState.setAdapter(listAdapter);

        Button btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        /*get data*/
        EditText txtName = (EditText)findViewById(R.id.txtName);
        EditText txtCity = (EditText)findViewById(R.id.txtCity);
        Spinner spinnerState = (Spinner)findViewById(R.id.spinnerState);
        EditText txtZip = (EditText)findViewById(R.id.txtZip);
        String result = String.format(
                "Result: Name: %s, City: %s, State: %s, Zip: %s",
                txtName.getText(), txtCity.getText(), spinnerState.getSelectedItem(), txtZip.getText()
        );
        Log.d(TAG,result);

        Toast toast = Toast.makeText(PartBActivity.this, "Form Submitted Successfully", Toast.LENGTH_SHORT);
        toast.show();
    }
}
