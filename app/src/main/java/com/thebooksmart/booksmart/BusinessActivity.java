package com.thebooksmart.booksmart;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BusinessActivity extends AppCompatActivity {

    EditText name, editDetails, editKeyword, editProduct;
    Spinner spinnerCat;
    Button listBiz_button;
    //FirebaseDatabase database;
    //DatabaseReference ref;
    //Requestqueue
    BizList bizList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        //list out category class
        /*spinnerCat = (Spinner)findViewById(R.id.spinnerCat);

        spinnerCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Popupmenu popupmenu = new PopupMenu(MainActivity.this, spinnerCat);
                ((PopupMenu) popupmenu).getMenuInflater().inflate(R.menu.popup_menu,((PopupMenu) popupmenu).getMenu());

                ((PopupMenu) popupmenu).setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this,""+ item.getTitle(),Toast.LENGTH_SHORT.show());
                        return true;
                    }
                });
            }
        });*/
        name = (EditText)findViewById(R.id.Name);
        editDetails = (EditText)findViewById(R.id.editDetails);
        editProduct = (EditText)findViewById(R.id.editProduct);
        editKeyword = (EditText)findViewById(R.id.editKeyword);
        listBiz_button = (Button)findViewById(R.id.listBiz_button);
       // database = FirebaseDatabase.getInstance();
        //ref = database.getReference("BizList");
        bizList = new BizList();

    }
    //this one obtain from bizlist java class
    private void getValues(){
        bizList.setName(name.getText().toString());
        bizList.setDetails(editDetails.getText().toString());
        bizList.setProducts(editProduct.getText().toString());
        bizList.setKeyword(editKeyword.getText().toString());

    }

    /*public void formInsert(View view){
    ref.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            ref.child("Biz01").setValue(bizList);
            //this is thrown away if it is not working
           // Toast.makeText(MainActivity.this, "Your Business Has Been Revised. This could take a while",Toast.LENGTH_LONG);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    }*/
}
