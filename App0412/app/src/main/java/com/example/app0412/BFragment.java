package com.example.app0412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BFragment newInstance(String param1) {
        BFragment fragment = new BFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.fragment_b, container, false);
        TextView tv = vg.findViewById(R.id.textView);
        tv.setText(mParam1);
        Button btn = vg.findViewById(R.id.button2);
        EditText et1 = vg.findViewById(R.id.editText2);
        EditText et2 = vg.findViewById(R.id.editText3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AFragment aFragment = AFragment.newInstance(et1.getText().toString(), et2.getText().toString());
                ((MainActivity)getActivity()).replaceFragment(aFragment);
            }
        });
        return vg;
    }
}