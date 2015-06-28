package com.app.swgluten.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.app.swgluten.R;
import com.app.swgluten.model.Business;
import com.app.swgluten.model.Comment;

import java.util.ArrayList;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class SimpleBussinesAdapter extends BaseAdapter {
    private ArrayList<Business> bussiness_list;
    private Context context;

    public SimpleBussinesAdapter(Context context, ArrayList<Business> blist) {
        this.context = context;
        this.bussiness_list = blist;
    }

    @Override
    public int getCount() {
        return bussiness_list.size();
    }

    @Override
    public Object getItem(int position) {
        return bussiness_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Business business = bussiness_list.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.bussiness_item_list_view, null);

        return layout;
    }
}
