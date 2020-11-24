package com.myregion.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myregion.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.search);
        setContentView(R.layout.detail_view);
    }



    final View.OnClickListener loginHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


        }
    };

}