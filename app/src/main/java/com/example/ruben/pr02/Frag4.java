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
public class Frag4 extends Fragment {

    View parentView = null;

    public Frag4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.fragment_frag4, container, false);
        return parentView;
    }

    void RebreMissatge4(String msg){
        TextView t = (TextView) parentView.findViewById(R.id.textFrag4);
        t.setText(msg);

    }

}
