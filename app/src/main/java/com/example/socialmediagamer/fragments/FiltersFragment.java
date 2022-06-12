package com.example.socialmediagamer.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediagamer.R;
import com.example.socialmediagamer.activities.FiltersActivity;


public class FiltersFragment extends Fragment {
    View mView;
    CardView mCardViewPS4;
    CardView mCardViewXbox;
    CardView mCardViewNintendo;
    CardView mCardViewPc;


    public FiltersFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView= inflater.inflate(R.layout.fragment_filters, container, false);
        mCardViewPS4= mView.findViewById(R.id.cardViewPs4);
        mCardViewXbox= mView.findViewById(R.id.cardViewXbox);
        mCardViewNintendo= mView.findViewById(R.id.cardViewNintendo);
        mCardViewPc= mView.findViewById(R.id.cardViewPc);

        mCardViewPS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              goToFilterActivity("PS4");
            }
        });

        mCardViewXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              goToFilterActivity("XBOX");
            }
        });

        mCardViewNintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              goToFilterActivity("NINTENDO");
            }
        });

        mCardViewPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              goToFilterActivity("PC");
            }
        });

        return mView;
    }

    private void goToFilterActivity(String category){
        Intent intent= new Intent(getContext(), FiltersActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}