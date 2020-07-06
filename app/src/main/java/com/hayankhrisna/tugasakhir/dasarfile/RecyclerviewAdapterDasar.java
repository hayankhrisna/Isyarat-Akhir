package com.hayankhrisna.tugasakhir.dasarfile;

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

public class RecyclerviewAdapterDasar extends RecyclerView.Adapter<RecyclerviewAdapterDasar.MyViewHolder>{

    private Context mContext;
    private List<Dasar> mData;

    public RecyclerviewAdapterDasar(Context mContext, List<Dasar> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_bdasar, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.dasar_title.setText(mData.get(position).getTitle());
        holder.img_dasar_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, Dasar_Activity.class);

                // passing data to the book activity
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                // start the activity
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView dasar_title;
        ImageView img_dasar_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            dasar_title = (TextView) itemView.findViewById(R.id.dasar_title_id);
            img_dasar_thumbnail = (ImageView) itemView.findViewById(R.id.dasar_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }


    }
}
