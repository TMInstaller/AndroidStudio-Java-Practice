package com.example.app0412;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    EditText et;
    private static TextSender sender;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_first, container, false);
        et = (EditText)viewGroup.findViewById(R.id.editText4);
        Button button = (Button)viewGroup.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sender.send(et.getText().toString());

            }
        });
        return viewGroup;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof TextSender) {
            sender = (TextSender) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        sender = null;
    }


    public interface TextSender {
        // TODO: Update argument type and name
        void send(String text);
    }
}
