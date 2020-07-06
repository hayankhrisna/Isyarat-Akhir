package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi3;

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

public class Recycler3 extends RecyclerView.Adapter<Recycler3.MyViewHolder> {

    private Context context3;
    private List<Tema1Materi3> data3;

    public Recycler3 (Context context3, List<Tema1Materi3>data3){
        this.context3 = context3;
        this.data3 = data3;
    }


    @Override
    public Recycler3.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context3);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler3.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler3.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data3.get(position).getThumbnail3());
        holder.titleMateri.setText(data3.get(position).getTitle3());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context3, Materi3_Activity.class);

                //data ke Materi1_Activity
                intent1.putExtra("Title", data3.get(position).getTitle3());
                intent1.putExtra("Video", data3.get(position).getVideo3());

                //start activity
                context3.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data3.size();
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