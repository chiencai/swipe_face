package com.example.kl.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_ClassList.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_ClassList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_ClassList extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment__class_list, container, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }


}
