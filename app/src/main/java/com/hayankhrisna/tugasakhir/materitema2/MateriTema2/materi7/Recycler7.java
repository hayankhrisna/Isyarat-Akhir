package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi7;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;


import java.util.List;

public class Recycler7 extends RecyclerView.Adapter<Recycler7.MyViewHolder> {

    private Context context7;
    private List<Tema2Materi3> data7;

    public Recycler7 (Context context7, List<Tema2Materi3>data7){
        this.context7 = context7;
        this.data7 = data7;
    }


    @Override
    public Recycler7.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context7);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler7.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler7.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data7.get(position).getThumbnail7());
        holder.titleMateri.setText(data7.get(position).getTitle7());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context7, Materi7_Activity.class);

                //data ke Materi6_Activity
                intent1.putExtra("Title", data7.get(position).getTitle7());
                intent1.putExtra("Video", data7.get(position).getVideo7());

                //start activity
                context7.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data7.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView materi_thumb;
        CardView cardViewmateri;
        TextView titleMateri;

        public MyViewHolder(View itemView){
            super(itemView);

            materi_thumb = itemView.findViewById(R.id.materi_img_id);
            titleMateri = itemView.findViewById(R.id.materi_title_id);
            cardViewmateri = itemView.findViewById(R.id.cardviewmateri_id);
        }
    }
}

