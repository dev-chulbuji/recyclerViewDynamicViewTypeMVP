package com.example.ladmusiciankim.exercisedynamicviewtype.presenter;

import com.example.ladmusiciankim.exercisedynamicviewtype.AnimalContract;
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Animal;
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Cat;
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ladmusician.kim on 2017. 6. 23..
 */

public class AnimalPresenter implements AnimalContract.Presenter {

    private BaseAdapter adapter;

    public AnimalPresenter(BaseAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void loadItems() {
        List<Animal> items = new ArrayList<>();
        items.add(new Cat("cat1"));
        items.add(new Dog("dog1"));
        items.add(new Cat("cat2"));
        items.add(new Dog("dog2"));
        items.add(new Cat("cat3"));
        items.add(new Dog("dog3"));
        items.add(new Cat("cat4"));
        items.add(new Dog("dog4"));

        adapter.setAdapterItems(items);
    }
}
