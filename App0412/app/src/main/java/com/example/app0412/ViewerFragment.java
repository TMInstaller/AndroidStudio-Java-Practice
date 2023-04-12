package com.example.app0412;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewerFragment extends Fragment {

    private ImageView imageView;

    public ViewerFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_viewer, container, false);
        imageView = (ImageView) rootView.findViewById(R.id.imageView);
        return rootView;
    }

    public void setImage(int resId) {
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
    }
}

