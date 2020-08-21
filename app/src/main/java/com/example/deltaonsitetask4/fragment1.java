package com.example.deltaonsitetask4;

import android.graphics.Path;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class fragment1 extends Fragment {

    viewclass canvas;
    static Observer<Path> path;
    viewmodel rep;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        canvas = new viewclass(requireContext());
        return canvas;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rep = new ViewModelProvider(requireActivity()).get(viewmodel.class);
        //rep.getPath().removeObservers(requireActivity());
        path = new Observer<Path>() {
            @Override
            public void onChanged(Path path) {
                canvas.setVisibility(View.INVISIBLE);
                canvas.setVisibility(View.VISIBLE);
            }
        };
        rep.getPath().observe(requireActivity(), path);

    }
}
