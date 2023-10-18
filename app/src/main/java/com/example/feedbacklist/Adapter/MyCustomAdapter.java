package com.example.feedbacklist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.feedbacklist.Model.Milkshakes;
import com.example.feedbacklist.R;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Milkshakes> {

    ArrayList<Milkshakes> milkshakes;
    Context context;

    public MyCustomAdapter(Context context, ArrayList<Milkshakes> milkshakes) {
        super(context, R.layout.mylistitem2, milkshakes);
        this.milkshakes = milkshakes;
        this.context = context;
    }

    private static class MyViewHolder {

        TextView Name, Price, Description;
        ImageView imageView;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Milkshakes milkshake = getItem(position);

        MyViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.mylistitem2, parent, false);

            viewHolder.Name = convertView.findViewById(R.id.Name);
            viewHolder.Price = convertView.findViewById(R.id.Price);
            viewHolder.Description = convertView.findViewById(R.id.Description);
            viewHolder.imageView = convertView.findViewById(R.id.imageview);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MyViewHolder) convertView.getTag();
        }

        viewHolder.Name.setText(milkshake.getName());
        viewHolder.Price.setText(milkshake.getPrice());
        viewHolder.Description.setText(milkshake.getDescription());
        viewHolder.imageView.setImageResource(milkshake.getImage());

        return convertView;
    }
}