package com.app.swgluten.ui.activities;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.app.swgluten.R;
import com.app.swgluten.model.Business;
import com.app.swgluten.model.Comment;
import com.app.swgluten.ui.adapters.SimpleBussinesAdapter;
import com.app.swgluten.utils.ParseGlobals;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import bolts.Continuation;
import bolts.Task;


public class FirstPageActivity extends Activity{
    private ArrayList<Business> businessess;

    private ListView bussiness_list;
    private ImageButton btn_filter_no_gluten;
    private ImageButton btn_filter_no_lactose;
    private ImageButton btn_filter_no_gluten_lactose;
    private ImageButton btn_order_by_price;
    private ImageButton btn_order_by_avaliation;
    private ImageButton btn_order_by_distance;
    private Button btn_suggest;
    private ImageButton btn_read_hint;
    private ImageButton btn_promotion;
    private ImageButton btn_favorite;
    private ImageButton btn_my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        initializeComponents();
    }

    private void initializeComponents() {
        bussiness_list = (ListView) findViewById(R.id.bussiness_list);
        bussiness_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        btn_filter_no_gluten = (ImageButton) findViewById(R.id.filter_no_gluten);

        btn_filter_no_lactose = (ImageButton) findViewById(R.id.filter_no_lactose);

        btn_filter_no_gluten_lactose = (ImageButton) findViewById(R.id.filter_no_gluten_lactose);

        btn_order_by_price = (ImageButton) findViewById(R.id.order_by_price);

        btn_order_by_avaliation = (ImageButton) findViewById(R.id.order_by_avaliation);

        btn_order_by_distance = (ImageButton) findViewById(R.id.order_by_distance);

        btn_suggest = (Button) findViewById(R.id.btn_suggest);

        btn_read_hint = (ImageButton) findViewById(R.id.btn_read_hint);

        btn_promotion = (ImageButton) findViewById(R.id.btn_promotion);

        btn_favorite = (ImageButton) findViewById(R.id.btn_favorites);

        btn_my_profile = (ImageButton) findViewById(R.id.btn_my_profile);

        bussiness_list.setAdapter(new SimpleBussinesAdapter(this, businessess));
    }

    private void loadBusiness() {
        businessess = new ArrayList<Business>();
        ParseQuery<ParseObject> query = ParseQuery.getQuery(ParseGlobals.BUSINESS_CLASS);
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> parseObjects, ParseException e) {
                for(ParseObject parseObject: parseObjects) {
                    Business b = new Business(parseObject.getString(ParseGlobals.BUSINESS_NAME),
                                                  parseObject.getString(ParseGlobals.BUSINESS_SITE),
                                                  parseObject.getString(ParseGlobals.BUSINESS_TELEPHONE),
                                                  parseObject.getParseGeoPoint(ParseGlobals.BUSINESS_LOCATION));

                    //Comment comment =
                    //parseObject.get(ParseGlobals.BUSINESS_HORARIOFUNC)

                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
