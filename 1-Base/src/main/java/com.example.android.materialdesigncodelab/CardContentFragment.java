package com.example.android.materialdesigncodelab;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.android.materialdesigncodelab.MainActivity.ViewHolder;

/**
 * Created by Gleb on 04.12.2017.
 */

public class CardContentFragment extends Fragment {
    public static class ContentAdapter extends RecyclerView.Adapter<ViewHolder> {

        private static final int LENGHT = 18;

        public ContentAdapter() {

        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()),parent);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return LENGHT;
        }
    }
}
