package com.app.swgluten.ui.adapters;

import android.content.Context;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.app.swgluten.R;
import com.app.swgluten.model.Business;
import com.app.swgluten.model.Comment;

import java.util.ArrayList;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class SimpleBussinesAdapter extends BaseAdapter {
    private ArrayList<Business> bussiness_list = new ArrayList<>();
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
        float avaliation = 0;
        Business business = bussiness_list.get(position);
        ArrayList<Comment> comments = business.getComments();

        for(Comment comment : comments) {
            avaliation += comment.getAvaliation();
        }
        avaliation /= comments.size();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.bussiness_item_list_view, null);

        TextView tv_establishment_name = (TextView) layout.findViewById(R.id.tv_establishment_name);
        TextView tv_establishment_avaliation = (TextView) layout.findViewById(R.id.tv_establishment_avaliation);
        TextView tv_comments = (TextView) layout.findViewById(R.id.tv_comments);
        RatingBar ratingBar = (RatingBar) layout.findViewById(R.id.ratingBar);

        tv_establishment_name.setText(business.getName());
        tv_comments.setText(new Integer(business.getComments().size()).toString() + " comentarios");
        tv_establishment_avaliation.setText(new Float(avaliation).toString());

        ratingBar.setRating(avaliation);
        return layout;
    }
}
