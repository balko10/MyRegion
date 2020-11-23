package com.myregion.activitys;

import android.os.Bundle;
import android.view.View;

import com.myregion.R;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
    }



    final View.OnClickListener loginHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


        }
    };

}