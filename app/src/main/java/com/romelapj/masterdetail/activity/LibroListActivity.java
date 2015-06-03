package com.romelapj.masterdetail.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.romelapj.masterdetail.fragment.LibroDetailFragment;
import com.romelapj.masterdetail.fragment.LibroListFragment;
import com.romelapj.masterdetail.R;



public class LibroListActivity extends FragmentActivity
        implements LibroListFragment.Callbacks {
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_list);

        if (findViewById(R.id.libro_detail_container) != null) {
            mTwoPane = true;
            ((LibroListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.libro_list))
                    .setActivateOnItemClick(true);
        }
    }
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(LibroDetailFragment.ARG_ITEM_ID, id);
            LibroDetailFragment fragment = new LibroDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.libro_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, LibroDetailActivity.class);
            detailIntent.putExtra(LibroDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
