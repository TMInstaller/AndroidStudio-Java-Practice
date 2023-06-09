package com.example.app0412;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFragment extends Fragment {

    String[] values = {"첫째이미지","둘째이미지","셋째이미지"};
    public interface ImageSelectionCallback {
        void onImageSelected(int position);
    }
    public ImageSelectionCallback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ImageSelectionCallback) {
            callback = (ImageSelectionCallback)context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_list, container, false);
        ListView listView = (ListView)rootView.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            if (callback != null) {
                callback.onImageSelected(position);
            }
        });
        return rootView;
    }

}