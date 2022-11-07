package com.example.areasvolumenesypyf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerMAreasAdapter extends RecyclerView.Adapter<RecyclerMAreasAdapter.ViewHolderAreas> implements View.OnClickListener
{
    ArrayList<ImgAreas> listAreas;
    private View.OnClickListener listener;


    public RecyclerMAreasAdapter(ArrayList<ImgAreas> listAreas)
    {
        this.listAreas = listAreas;
    }

    @Override public ViewHolderAreas onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menuareas, null, false);

        view.setOnClickListener(this);

        return new ViewHolderAreas(view);
    }

    @Override public void onBindViewHolder(ViewHolderAreas holder, int position)
    {
        holder.numeroActivity.setText(listAreas.get(position).getnActivity());
        holder.nombreFigura.setText(listAreas.get(position).getNombreFigura());
        holder.imgAreas.setImageResource(listAreas.get(position).getImgArea());
    }

    @Override public int getItemCount(){ return listAreas.size();}

    public void setOnClickListener(View.OnClickListener listener)
    {
        this.listener = listener;
    }
    @Override public void onClick(View view)
    {
        if (listener != null)
        {
            listener.onClick(view);
        }
    }


    public class ViewHolderAreas extends RecyclerView.ViewHolder
    {
        TextView numeroActivity;
        TextView nombreFigura;
        ImageView imgAreas;


        public ViewHolderAreas(View itemView)
        {
            super(itemView);
            numeroActivity = (TextView) itemView.findViewById(R.id.nActivity);
            nombreFigura = (TextView) itemView.findViewById(R.id.nombreFigura);
            imgAreas = (ImageView) itemView.findViewById(R.id.imgAreas);
        }
    }
}
