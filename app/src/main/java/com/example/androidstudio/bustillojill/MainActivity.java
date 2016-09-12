package com.example.androidstudio.bustillojill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button);
        email=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);

        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email.setError(null);
                password.setError(null);
                if (email.getText().toString().equals("admin") &&
                        password.getText().toString().equals("test")) {
                    Intent i;
                    i = new Intent(MainActivity.this, ontouch.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Email and Password", Toast.LENGTH_LONG).show(); }

            }
        });
    }
}
