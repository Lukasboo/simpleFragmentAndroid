package com.example.lucas.fragmentexercises;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by lucas on 24/09/16.
 */

public class RightFragment extends Fragment {

    TextView txtright;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        txtright = (TextView) view.findViewById(R.id.txtright);
        return view;
    }

    public void clickcolor(String background_color){
        txtright.setBackgroundColor(Color.parseColor(background_color));
    }
}
