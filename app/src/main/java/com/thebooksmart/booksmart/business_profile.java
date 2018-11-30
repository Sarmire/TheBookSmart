package com.thebooksmart.booksmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.RelativeLayout;

import java.util.List;

public class business_profile extends AppCompatActivity {

    private static final String URL_PRODUCTS = "http://192.168.10.1/thebooksmart/profile.php";

    //a list to store all items in the profile
    List<ListItem> businessdataList;

    //cardview object
    private RelativeLayout cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_profile);

        cardview = (RelativeLayout) findViewById(R.id.profileBiz);

    }
}
