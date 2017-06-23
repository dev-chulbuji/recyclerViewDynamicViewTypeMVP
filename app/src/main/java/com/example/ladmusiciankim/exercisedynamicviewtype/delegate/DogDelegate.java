package com.example.ladmusiciankim.exercisedynamicviewtype.delegate;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ladmusiciankim.exercisedynamicviewtype.R;
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Animal;
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Dog;
import com.hannesdorfmann.adapterdelegates3.AbsListItemAdapterDelegate;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ladmusician.kim on 2017. 6. 23..
 */

public class DogDelegate extends AbsListItemAdapterDelegate<Dog, Animal, DogDelegate.DogViewHolder>{

    private LayoutInflater inflater;

    public DogDelegate(Activity activity) {
        inflater = activity.getLayoutInflater();
    }

    @Override
    protected boolean isForViewType(@NonNull Animal item, @NonNull List<Animal> items, int position) {
        return item instanceof Dog;
    }

    @NonNull
    @Override
    protected DogViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent) {
        return new DogViewHolder
                (inflater.inflate(R.layout.item_dog, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull Dog item, @NonNull DogViewHolder
            viewHolder, @NonNull List<Object> payloads) {
        viewHolder.mName.setText(item.getName());
    }


    public class DogViewHolder
            extends RecyclerView.ViewHolder {

        @BindView(R.id.dog_name) TextView mName;

        public DogViewHolder
                (View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}


