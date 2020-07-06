package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi4;

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

public class Recycler4 extends RecyclerView.Adapter<Recycler4.MyViewHolder> {

    private Context context4;
    private List<Tema1Materi4> data4;

    public Recycler4 (Context context4, List<Tema1Materi4>data4){
        this.context4 = context4;
        this.data4 = data4;
    }


    @Override
    public Recycler4.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context4);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler4.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler4.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data4.get(position).getThumbnail4());
        holder.titleMateri.setText(data4.get(position).getTitle4());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context4, Materi4_Activity.class);

                //data ke Materi1_Activity
                intent1.putExtra("Title", data4.get(position).getTitle4());
                intent1.putExtra("Video", data4.get(position).getVideo4());

                //start activity
                context4.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data4.size();
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