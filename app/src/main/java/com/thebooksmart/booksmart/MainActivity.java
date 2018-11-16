package com.thebooksmart.booksmart;

import android.app.AlarmManager;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

        Button b1;

        //private static final String TAG = "MainActivity";
        //private FragmentPagerAdapter mSection;
        //private ViewPager mViewPager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            b1 = (Button)findViewById(R.id.button);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addNotification();
                }
            });

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


        }

        private void addNotification() {
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
        }

        //add alarm service when check in is coming
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Calendar calendar = Calendar.getInstance();
        //calendar.add(Calendar.SECOND,5);
        Intent intent = new Intent("")
       // PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, Intent(""), PendingIntent.FLAG_UPDATE_CURRENT);
        //alarmManager.setExact(AlarmManager.RTC_MAKEUP, calendar.getInTimeInMillis(),);
    }

