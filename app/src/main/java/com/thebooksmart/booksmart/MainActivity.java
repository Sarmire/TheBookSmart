package com.thebooksmart.booksmart;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        Button b1;

        //private static final String TAG = "MainActivity";
        //private FragmentPagerAdapter mSection;
        //private ViewPager mViewPager;

    private static final String URL_DATA = "https://simplifiedcoding.net/demos/marvel/";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            recyclerView = (RecyclerView) findViewById(R.id.listBiz);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            listItems = new ArrayList<>();

            loadRecyclerViewData();
        }

        private void loadRecyclerViewData(){

            //this one is deprecated..i don't want to use toast either
            //progress bar is seemingly unknown on how to use
           /* ProgressDialog progressDialog  = new ProgressDialog(this);
            progressDialog.setMessage("Loading Business...");
            progressDialog.show();*/

            //this is use volley
           // StringRequest stringRequest = new StringRequest(Request.Method.GET,
                    //URL_DATA,
                    //new Response.Listener<String>() {
                       // @Override
                        //public void onResponse(String s) {
                        /*try{
                            JSONObject jsonObject = new JSONObject(s);
                            JSONArray array = jsonObject.getJSONArray("heroes");

                            for(int i = 0; i<array.length();i++){
                                JSONObject o = array.getJSONObject(i);
                                ListItem item = new ListItem(
                                        o.getString("name");
                                        o.getString("about"),
                                        o.getString("image");
                                );
                                listItems.add()
                            }
                        }
                        catch (JSONArray e){
                            e.printStackTrace();
                        }
                        }*/
                   /* },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });

            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        }*/
//}


            //this one is inaccurate..maybe logic error
           /* listItems = new ArrayList<>();

                for(int i=0;i<10;i++){
                    ListItem listItem = new ListItem(
                            "bizimg" + (i+1),
                            "availbiz" + (i+1),
                            "availBizDetail" + (i+1),
                            "viewPackage" + (i+1)
                    );

                    listItems.add(listItem);
                }

                adapter = new listAdapter(listItems, this);

                recyclerView.setAdapter(adapter);
            }
*/


           // b1 = (Button)findViewById(R.id.button);
            //b1.setOnClickListener(new View.OnClickListener() {
                //@Override
                //public void onClick(View v) {
                //    addNotification();
                //}
            //});

            //mSection = new FragmentPagerAdapter(getSupportFragmentManager());

            //this part is used for tab navigation

            //mViewPager = (ViewPager) findViewById(R.id.tabs);
            //tablayout.setupWithViewPager(mViewPager);

            //tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
            //tabLayout.getTabAt(1).setIcon(R.drawable.ic_explore);
            //tabLayout.getTabAt(2).setIcon(R.drawable.ic_email);
            //tabLayout.getTabAt(3).setIcon(R.drawable.ic_account);

            //BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById (R.id.bottomNavView_bar);
           //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

           //bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           // @Override
           // public boolean onNavigationItemSelected(@NonNull MenuItem item) {
           // return false
           // }
           // });
           // }
           //
           //private void setupViewPager(ViewPager viewpager){
           //   SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager())l
           //   adapter.addFragment(new Tab1Fragment());
            //  adapter.addFragment(new Tab2Fragment());
            //  adapter.addFragment(new Tab3Fragment());
            //  viewPager.setAdapter(adapter);
            //THIS IS HAVE TO BE FIXED ON ACTIVITY_MAIN.XML ON BOTTOM NAVIGATIONVIEW


        //}

       /* private void addNotification(){
            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.ic_stat_name)
                            .setContentTitle("Notifications Example")
                            .setContentText("This is a test notification");

            Intent notificationIntent = new Intent(this, MainActivity.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                    PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(contentIntent);

            // Add as notification
            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, builder.build());
        }*/

        //add alarm service when check in is coming
       // AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
       // Calendar calendar = Calendar.getInstance();
        //calendar.add(Calendar.SECOND,5);
       // Intent intent = new Intent("")
       // PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, Intent(""), PendingIntent.FLAG_UPDATE_CURRENT);
        //alarmManager.setExact(AlarmManager.RTC_MAKEUP, calendar.getInTimeInMillis(),);
    //}}