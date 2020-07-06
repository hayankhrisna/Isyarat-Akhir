package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi6;

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

public class Recycler6 extends RecyclerView.Adapter<Recycler6.MyViewHolder> {

    private Context context6;
    private List<Tema2Materi2> data6;

    public Recycler6 (Context context6, List<Tema2Materi2>data6){
        this.context6 = context6;
        this.data6 = data6;
    }


    @Override
    public Recycler6.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context6);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler6.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler6.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data6.get(position).getThumbnail6());
        holder.titleMateri.setText(data6.get(position).getTitle6());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context6, Materi6_Activity.class);

                //data ke Materi6_Activity
                intent1.putExtra("Title", data6.get(position).getTitle6());
                intent1.putExtra("Video", data6.get(position).getVideo6());

                //start activity
                context6.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data6.size();
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

