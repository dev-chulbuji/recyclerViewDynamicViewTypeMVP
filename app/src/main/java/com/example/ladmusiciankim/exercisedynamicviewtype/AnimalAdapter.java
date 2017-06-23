package com.example.ladmusiciankim.exercisedynamicviewtype;

import android.app.Activity;

import com.example.ladmusiciankim.exercisedynamicviewtype.delegate.CatDelegate;
import com.example.ladmusiciankim.exercisedynamicviewtype.delegate.DogDelegate;
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Animal;
import com.example.ladmusiciankim.exercisedynamicviewtype.presenter.BaseAdapter;
import com.hannesdorfmann.adapterdelegates3.ListDelegationAdapter;

import java.util.List;

/**
 * Created by ladmusician.kim on 2017. 6. 23..
 */

public class AnimalAdapter extends ListDelegationAdapter<List<Animal>>
    implements BaseAdapter<List<Animal>> {

    public AnimalAdapter(Activity activity) {
        delegatesManager.addDelegate(new CatDelegate(activity));
        delegatesManager.addDelegate(new DogDelegate(activity));
    }

    @Override
    public void setAdapterItems(List<Animal> items) {
        setItems(items);
    }
}
