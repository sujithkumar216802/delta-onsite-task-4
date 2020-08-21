package com.example.deltaonsitetask4;

import android.graphics.Path;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class viewmodel extends ViewModel {



    /*MutableLiveData<ArrayList<Float>> x = new MutableLiveData<>();

    MutableLiveData<ArrayList<Float>> y = new MutableLiveData<>();

    public MutableLiveData<ArrayList<Float>> getX() {
        if(x.getValue()==null)
            x.setValue(new ArrayList<Float>());

        return x;
    }

    public MutableLiveData<ArrayList<Float>> getY() {
        if(y.getValue()==null)
            y.setValue(new ArrayList<Float>());

        return y;
    }*/


     public MutableLiveData<Path> getPath() {
        if (path == null) {
            path = new MutableLiveData<>();
            path.setValue(new Path());
        }


        return path;
    }

    MutableLiveData<Path> path;

    public Boolean getMoveto() {
        return moveto;
    }

    public void setMoveto(Boolean moveto) {
        this.moveto = moveto;
    }

    Boolean moveto = true;


}
