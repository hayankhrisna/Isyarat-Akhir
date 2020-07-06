package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi8;

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

public class Recycler8 extends RecyclerView.Adapter<Recycler8.MyViewHolder> {

    private Context context8;
    private List<Tema2Materi4> data8;

    public Recycler8 (Context context8, List<Tema2Materi4>data8){
        this.context8 = context8;
        this.data8 = data8;
    }


    @Override
    public Recycler8.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context8);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler8.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler8.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data8.get(position).getThumbnail8());
        holder.titleMateri.setText(data8.get(position).getTitle8());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context8, Materi8_Activity.class);

                //data ke Materi6_Activity
                intent1.putExtra("Title", data8.get(position).getTitle8());
                intent1.putExtra("Video", data8.get(position).getVideo8());

                //start activity
                context8.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data8.size();
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

