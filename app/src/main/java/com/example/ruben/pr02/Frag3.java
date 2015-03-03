package com.example.ruben.pr02;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    View parentView = null;

    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        parentView = inflater.inflate(R.layout.fragment_frag3, container, false);
        return parentView;
    }


    void RebreMissatge3(String msg){
        TextView t = (TextView) parentView.findViewById(R.id.textFrag3);
        t.setText(msg);

    }

}


