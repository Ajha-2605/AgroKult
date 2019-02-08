package com.example.anubh.agrokult4a;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvPersInfo = (TextView) findViewById(R.id.tvPersInfo);
        TextView tvFirstName = (TextView) findViewById(R.id.tvFirstName);
        TextView tvMiddleName = (TextView) findViewById(R.id.tvMiddleName);
        TextView tvLastName = (TextView) findViewById(R.id.tvLastName);
        TextView tvDOB = (TextView) findViewById(R.id.tvDOB);
        TextView tvCompany = (TextView) findViewById(R.id.tvCompany);
        TextView tvWebsite = (TextView) findViewById(R.id.tvWebsite);
        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);
        TextView tvPhoneNumber = (TextView) findViewById(R.id.tvPhoneNumber);
        TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        TextView tvUserName = (TextView) findViewById(R.id.tvUserName);
        TextView tvAddress = (TextView) findViewById(R.id.tvAddress);


        EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
        EditText etMiddleName = (EditText) findViewById(R.id.etMiddleName);
        EditText etLastName = (EditText) findViewById(R.id.etLastName);
        EditText etDOB = (EditText) findViewById(R.id.etDOB);
        EditText etCompany = (EditText) findViewById(R.id.etCompany);
        EditText etWebsite = (EditText) findViewById(R.id.etWebsite);
        EditText etTitle = (EditText) findViewById(R.id.etTitle);
        EditText etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        EditText etUserName = (EditText) findViewById(R.id.etUserName);
        EditText etAddress = (EditText) findViewById(R.id.etAddress);

        ImageButton ImgEdit = (ImageButton) findViewById(R.id.imgEdit);
        ImageView imgProfile = (ImageView) findViewById(R.id.imgProfile);

        ImgEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {



    }
}
