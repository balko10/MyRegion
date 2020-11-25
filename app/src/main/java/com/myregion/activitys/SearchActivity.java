package com.myregion.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import com.myregion.R;
import com.myregion.util.ConstantUtil;

public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    SearchView editsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.search);
        setContentView(R.layout.search_view);

        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);
    }

    final View.OnClickListener loginHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };

    @Override
    public boolean onQueryTextSubmit(String query) {
        if (query != null && !query.equals("")) {
            Intent intent = new Intent(this, ListViewActivity.class);
            intent.putExtra(ConstantUtil.PARAMETER_SEARCH_STRING, query);
            startActivity(intent);
        }
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

}