package com.compilation.demos.adapterToggle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.compilation.R;

import java.util.List;

class ModelsAdapter extends RecyclerView.Adapter<ModelsAdapter.MyViewHolder> {

    private List<Model> models;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }


    ModelsAdapter(List<Model> questions) {
        this.models = questions;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.question_row_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Model question = models.get(position);
        holder.title.setText(question.getTitle());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}