package com.romelapj.masterdetail.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

import com.romelapj.masterdetail.fragment.LibroDetailFragment;
import com.romelapj.masterdetail.R;


public class LibroDetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString(LibroDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(LibroDetailFragment.ARG_ITEM_ID));
            LibroDetailFragment fragment = new LibroDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.libro_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpTo(this, new Intent(this, LibroListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
