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
import com.example.ladmusiciankim.exercisedynamicviewtype.entity.Cat;
import com.hannesdorfmann.adapterdelegates3.AbsListItemAdapterDelegate;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ladmusician.kim on 2017. 6. 23..
 */

public class CatDelegate extends AbsListItemAdapterDelegate<Cat, Animal, CatDelegate.CatViewHolder>{

    private LayoutInflater inflater;

    public CatDelegate(Activity activity) {
        inflater = activity.getLayoutInflater();
    }

    @Override
    protected boolean isForViewType(@NonNull Animal item, @NonNull List<Animal> items, int position) {
        return item instanceof Cat;
    }

    @NonNull
    @Override
    protected CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        return new CatViewHolder(inflater.inflate(R.layout.item_cat, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull Cat item, @NonNull CatViewHolder viewHolder, @NonNull List<Object> payloads) {
        viewHolder.mName.setText(item.getName());
    }


    public class CatViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cat_name) TextView mName;

        public CatViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}


