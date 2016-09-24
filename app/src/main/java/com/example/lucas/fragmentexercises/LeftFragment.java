package com.example.lucas.fragmentexercises;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lucas on 24/09/16.
 */

public class LeftFragment extends Fragment {

    private String cor;
    private Button btpreto;
    private Button btazul;
    private Button btverde;
    private Button btvermelho;
    private Button btamarelo;
    private OnClickListener listener;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        if(!(activity instanceof OnClickListener)){
            throw new RuntimeException("A Activity deve implementar a interface LeftFragment.OnClickListener");
        }
        listener = (OnClickListener) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);

        btpreto = (Button) view.findViewById(R.id.btpreto);
        btazul = (Button) view.findViewById(R.id.btazul);
        btverde = (Button) view.findViewById(R.id.btverde);
        btvermelho = (Button) view.findViewById(R.id.btvermelho);
        btamarelo = (Button) view.findViewById(R.id.btamarelo);

        btpreto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cor = "#000000";
                if(listener!=null){
                    listener.onClick(cor);
                }
            }
        });
        btazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cor = "#0000FF";
                if(listener!=null){
                    listener.onClick(cor);
                }
            }
        });
        btverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cor = "#00FF00";
                if(listener!=null){
                    listener.onClick(cor);
                }
            }
        });
        btvermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cor = "#FF0000";
                if(listener!=null){
                    listener.onClick(cor);
                }
            }
        });
        btamarelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cor = "#0FF000";
                if(listener!=null){
                    listener.onClick(cor);
                }
            }
        });

        return view;
    }

    public interface OnClickListener{
        void onClick(String cor);
    }



}
