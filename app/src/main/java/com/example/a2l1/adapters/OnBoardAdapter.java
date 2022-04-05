package com.example.a2l1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2l1.databinding.ItemBoardBinding;
import com.example.a2l1.models.OnBoardModels;

import java.util.ArrayList;

public class OnBoardAdapter extends RecyclerView.Adapter<OnBoardAdapter.BoardViewHolder> {

    ArrayList<OnBoardModels> list;

    public OnBoardAdapter(ArrayList<OnBoardModels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public OnBoardAdapter.BoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBoardBinding binding = ItemBoardBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,false);
        return new BoardViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoardAdapter.BoardViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BoardViewHolder extends RecyclerView.ViewHolder {
        ItemBoardBinding binding;
        public BoardViewHolder(ItemBoardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(OnBoardModels onBoardModels) {
            binding.ivImage.setImageResource(onBoardModels.getImage());
            binding.tvText.setText(onBoardModels.getText());
        }
    }
}
