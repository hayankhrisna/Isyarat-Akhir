package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi2;

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

public class Recycler2 extends RecyclerView.Adapter<Recycler2.MyViewHolder> {

    private Context context2;
    private List<Tema1Materi2> data2;

    public Recycler2 (Context context2, List<Tema1Materi2>data2){
        this.context2 = context2;
        this.data2 = data2;
    }


    @Override
    public Recycler2.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context2);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler2.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler2.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data2.get(position).getThumbnail2());
        holder.titleMateri.setText(data2.get(position).getTitle2());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context2, Materi2_Activity.class);

                //data ke Materi1_Activity
                intent1.putExtra("Title", data2.get(position).getTitle2());
                intent1.putExtra("Video", data2.get(position).getVideo2());

                //start activity
                context2.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data2.size();
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