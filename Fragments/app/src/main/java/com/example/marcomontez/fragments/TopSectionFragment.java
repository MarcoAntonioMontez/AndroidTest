package com.example.marcomontez.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.*;
import android.app.Activity;
import android.widget.*;

public class TopSectionFragment extends Fragment{
    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    //deprecated
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try {
            activityCommander = (TopSectionListener) activity;
        } catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }

                }
        );
        return view;
    }
    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
