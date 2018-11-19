package com.thebooksmart.booksmart;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


//this is adapter for recycler view which is for business listed
public class listAdapter extends RecyclerView.Adapter<listAdapter.ViewHolder>{


    public listAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    private List<ListItem> listItems;
    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);  //supposed to be parent..but i don't know for version 3.0 android studio
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        ListItem listItem = listItems.get(position);

        //it's not appear from listItem.xml
        //bugs need to fix

        //viewHolder.bizImg.setTooltipText(listItems.ge);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView bizImg;
        public TextView availBiz;
        public TextView availBizDetail;
        public Button viewPackage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bizImg = (ImageView)itemView.findViewById(R.id.bizImg);
            availBiz = (TextView)itemView.findViewById(R.id.availBiz);
            availBizDetail = (TextView)itemView.findViewById(R.id.availBizDetail);
            viewPackage = (Button)itemView.findViewById(R.id.viewPackage);
        }
    }

}
