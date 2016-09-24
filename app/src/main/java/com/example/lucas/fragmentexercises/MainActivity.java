package com.example.lucas.fragmentexercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LeftFragment.OnClickListener {

    private RightFragment rightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rightFragment = (RightFragment) getFragmentManager().findFragmentById(R.id.fragment_right);
    }

    @Override
    public void onClick(String cor) {
        rightFragment.clickcolor(cor);
    }
}