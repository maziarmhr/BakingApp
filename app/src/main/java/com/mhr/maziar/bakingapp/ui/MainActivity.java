package com.mhr.maziar.bakingapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mhr.maziar.bakingapp.R;
import com.mhr.maziar.bakingapp.data.DummyContent;

public class MainActivity extends AppCompatActivity implements RecipeFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
