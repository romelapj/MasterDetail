package com.romelapj.masterdetail.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.romelapj.masterdetail.R;
import com.romelapj.masterdetail.activity.LibroDetailActivity;
import com.romelapj.masterdetail.activity.LibroListActivity;
import com.romelapj.masterdetail.model.BookContent;


public class LibroDetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";

    private BookContent.BookItem mItem;


    public LibroDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = BookContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_libro_detail, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.libro_detail)).setText(mItem.content);
            ((ImageView)rootView.findViewById(R.id.iv_libro_detail)).setImageResource(mItem.imagen);
            ((TextView) rootView.findViewById(R.id.tv_libro_detail)).setText(mItem.description);

        }

        return rootView;
    }
}
