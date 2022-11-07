package com.example.areasvolumenesypyf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerMVolumenesAdapter extends RecyclerView.Adapter<RecyclerMVolumenesAdapter.ViewHolderVolumenes> implements View.OnClickListener
{
    private ArrayList<ImgVolumenes> listVolumenes;
    private View.OnClickListener listener;

    public RecyclerMVolumenesAdapter(ArrayList<ImgVolumenes> listVolumenes)
    {
        this.listVolumenes = listVolumenes;
    }

    @Override public ViewHolderVolumenes onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menuvolumenes, null, false);

        view.setOnClickListener(this);

        return new ViewHolderVolumenes(view);
    }

    @Override public void onBindViewHolder(ViewHolderVolumenes holder, int position)
    {
        holder.numeroActivity.setText(listVolumenes.get(position).getnActivity());
        holder.nombrePoliedro.setText(listVolumenes.get(position).getNombrePoliedro());
        holder.imgVolumenes.setImageResource(listVolumenes.get(position).getImgVolumen());
    }

    @Override public int getItemCount(){ return listVolumenes.size();}

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

    public class ViewHolderVolumenes extends RecyclerView.ViewHolder
    {
        TextView numeroActivity;
        TextView nombrePoliedro;
        ImageView imgVolumenes;

        public ViewHolderVolumenes(View itemView)
        {
            super(itemView);

            numeroActivity = (TextView) itemView.findViewById(R.id.nActivity);
            nombrePoliedro = (TextView) itemView.findViewById(R.id.nombrePoliedro);
            imgVolumenes = (ImageView) itemView.findViewById(R.id.imgVolumenes);
        }
    }
}
