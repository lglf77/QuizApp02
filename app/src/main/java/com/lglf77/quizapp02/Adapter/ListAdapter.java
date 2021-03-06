package com.lglf77.quizapp02.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.lglf77.quizapp02.Model.ListModel;
import com.lglf77.quizapp02.R;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<ListModel> {

    private final ArrayList<ListModel> objects;

    public ListAdapter(Context context, int textViewResourceId, ArrayList<ListModel> qUESTIONS) {
        super(context, textViewResourceId, qUESTIONS);
        objects = qUESTIONS;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @SuppressLint({"SetTextI18n", "ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_row, null);

            TextView txtqstn = (TextView) v.findViewById(R.id.txtQSTN);
            TextView txtselectedANS = (TextView) v.findViewById(R.id.txtSelectedANS);
            TextView txtactualANS = (TextView) v.findViewById(R.id.txtActualANS);

            txtqstn.setText("Question: " + objects.get(position).getQuestion());
            txtselectedANS.setText("Selected Answer : " + objects.get(position).getSelectedAnswer());
            txtactualANS.setText("Right Answer : " + objects.get(position).getActualAnswer());

        return v;
    }

}
