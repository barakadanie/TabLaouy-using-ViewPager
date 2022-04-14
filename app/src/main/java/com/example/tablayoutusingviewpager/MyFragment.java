package com.example.tablayoutusingviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_my,container,false);
        TextView textView=view.findViewById(R.id.text_disp);
        String text=getArguments().getString("ID");
        textView.setText(text);
        return  view;
    }
}
