package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi1;

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

public class Recycler1 extends RecyclerView.Adapter<Recycler1.MyViewHolder> {

    private Context context1;
    private List<Tema1Materi1> data1;

    public Recycler1 (Context context1, List<Tema1Materi1>data1){
        this.context1 = context1;
        this.data1 = data1;
    }


    @Override
    public Recycler1.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context1);
        view = inflater.inflate(R.layout.cardview_materi,parent, false);
        return new Recycler1.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler1.MyViewHolder holder, final int position) {
        holder.materi_thumb.setImageResource(data1.get(position).getThumbnail1());
        holder.titleMateri.setText(data1.get(position).getTitle1());
        holder.cardViewmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context1, Materi1_Activity.class);

                //data ke Materi1_Activity
                intent1.putExtra("Title", data1.get(position).getTitle1());
                intent1.putExtra("Video", data1.get(position).getVideo1());


                //start activity
                context1.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data1.size();
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
