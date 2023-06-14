package com.example.quiz.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiz.Activities.QuestionActivity;
import com.example.quiz.Models.setModel;
import com.example.quiz.R;
import com.example.quiz.databinding.ItemSetsBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SetAdapter extends RecyclerView.Adapter<SetAdapter.viewHolder>{

    Context context;
    ArrayList<setModel>list;

    public SetAdapter(Context context, ArrayList<setModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_sets,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final setModel model=list.get(position);
        holder.binding.setName.setText(model.getSetNmae());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, QuestionActivity.class);
                intent.putExtra("set",model.getSetNmae());
                intent.putExtra("name",model.getName());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ItemSetsBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding=ItemSetsBinding.bind(itemView);
        }
    }

}
