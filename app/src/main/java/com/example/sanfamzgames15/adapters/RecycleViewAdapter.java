package com.example.sanfamzgames15.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sanfamzgames15.R;
import com.example.sanfamzgames15.activities.ItemResults;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private List<ItemResults> dataGame;
    private Context mContext;

    public RecycleViewAdapter(List<ItemResults> dataGame, Context mContext){
        this.dataGame = dataGame;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_game, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.nameMenu.setText(dataGame.get(i).getName());
        Glide.with(mContext).load(dataGame.get(i).getBackgroundImage()).into(viewHolder.imgMenu);
    }

    @Override
    public int getItemCount() {
        return dataGame.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name_Menu)
        TextView nameMenu;
        @BindView(R.id.img_Menu)
        ImageView imgMenu;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
