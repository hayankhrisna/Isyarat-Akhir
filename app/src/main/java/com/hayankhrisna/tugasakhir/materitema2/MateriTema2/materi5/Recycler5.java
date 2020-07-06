package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi5;

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

public class Recycler5 extends RecyclerView.Adapter<Recycler5.MyViewHolder> {

    private Context context5;
    private List<Tema2Materi1> data5;

    public Recycler5 (Context context5, List<Tema2Materi1>data5){
        this.context5 = context5;
        this.data5 = data5;
    }


    @Override
    public Recycler5.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context5);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler5.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler5.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data5.get(position).getThumbnail5());
        holder.titleMateri.setText(data5.get(position).getTitle5());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context5, Materi5_Activity.class);

                //data ke Materi5_Activity
                intent1.putExtra("Title", data5.get(position).getTitle5());
                intent1.putExtra("Video", data5.get(position).getVideo5());

                //start activity
                context5.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data5.size();
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
