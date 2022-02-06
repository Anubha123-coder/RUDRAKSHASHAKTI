package com.rudraksha.rudrakshashakti.Adapters;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rudraksha.rudrakshashakti.Pojo.UpcommingCalls;
import com.rudraksha.rudrakshashakti.R;
import com.rudraksha.rudrakshashakti.Utilities.Animations;
import com.sinaseyfi.advancedcardview.AdvancedCardView;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class UpcomingCallsAdapter extends RecyclerView.Adapter<UpcomingCallsAdapter.UpcomingCallsViewHolder>{

    Context context;
    ArrayList<UpcommingCalls> upcommingCalls;
    Boolean isOpen = true;

    public UpcomingCallsAdapter(Context context, ArrayList<UpcommingCalls> upcommingCalls){
        this.context = context;
        this.upcommingCalls= upcommingCalls;
    }

    @NotNull
    @Override
    public UpcomingCallsAdapter.UpcomingCallsViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcomming_calls_card, parent, false);
        return new UpcomingCallsAdapter.UpcomingCallsViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull @NotNull UpcomingCallsAdapter.UpcomingCallsViewHolder holder, int position) {
        final UpcommingCalls upcommingCallsModel = upcommingCalls.get(position);
        String Service_ = upcommingCallsModel.getService();
        holder.expertName.setText(upcommingCallsModel.getUserName());
        holder.upcomingCallTime.setText(upcommingCallsModel.getCallTime());
        holder.service.setText("Service:  "+upcommingCallsModel.getService());
        holder.callTime.setText("Time:  "+ upcommingCallsModel.getCallTime());
        holder.callDuration.setText("Duration:  "+ upcommingCallsModel.getCallDuration()+" min");
        holder.callDate.setText("Date:  "+ upcommingCallsModel.getCallDate());

        holder.VastuDetails.setVisibility(View.GONE);
        holder.Area.setVisibility(View.GONE);
        holder.Type.setVisibility(View.GONE);
        holder.Floor.setVisibility(View.GONE);
        holder.Bedroom.setVisibility(View.GONE);
        holder.Washroom.setVisibility(View.GONE);
        holder.Storeroom.setVisibility(View.GONE);
        holder.Others.setVisibility(View.GONE);
        holder.naksha.setVisibility(View.GONE);

        String Imageurl = upcommingCallsModel.getimgurl();
        String UserName = upcommingCallsModel.getUserName();

        holder.naksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadFile(holder.naksha.getContext(),UserName,".jpeg",DIRECTORY_DOWNLOADS,Imageurl);
            }
        });


        if(Service_.equals("Vastu Shastra")){
            holder.VastuDetails.setVisibility(View.VISIBLE);
            holder.Area.setVisibility(View.VISIBLE);
            holder.Type.setVisibility(View.VISIBLE);
            holder.Floor.setVisibility(View.VISIBLE);
            holder.Bedroom.setVisibility(View.VISIBLE);
            holder.Washroom.setVisibility(View.VISIBLE);
            holder.Storeroom.setVisibility(View.VISIBLE);
            holder.Others.setVisibility(View.VISIBLE);
            holder.naksha.setVisibility(View.VISIBLE);

            holder.Type.setText("Type Of Property: "+upcommingCallsModel.getPropType());
            holder.Area.setText("Area: "+upcommingCallsModel.getArea()+" sqft");
            holder.Floor.setText("Floor(s): "+upcommingCallsModel.getFloor());
            holder.Bedroom.setText("Bedrooms: "+upcommingCallsModel.getBedroom());
            holder.Storeroom.setText("Storerooms: "+upcommingCallsModel.getStoreroom());
            holder.Washroom.setText("Washrooms: "+upcommingCallsModel.getWashroom());


            String showkitchen, showdinning, showdrawing, showstudy, showstairs, showterrace;
            if((upcommingCallsModel.getkitchen()).equals("null")){
                showkitchen = "no";
            }else {
                showkitchen = "yes";
            }
            if((upcommingCallsModel.getdinning()).equals("null")){
                showdinning = "no";
            }else {
                showdinning = "yes";
            }
            if((upcommingCallsModel.getdrawing()).equals("null")){
                showdrawing = "no";
            }else {
                showdrawing = "yes";
            }
            if((upcommingCallsModel.getstudy()).equals("null")){
                showstudy = "no";
            }else {
                showstudy = "yes";
            }
            if((upcommingCallsModel.getstairs()).equals("null")){
                showstairs = "no";
            }else {
                showstairs = "yes";
            }
            if((upcommingCallsModel.getterrace()).equals("null")){
                showterrace = "no";
            }else {
                showterrace = "yes";
            }
            holder.Others.setText("kitchen : "+showkitchen+" || dinning : " +showdinning+" || drawing : "+showdrawing+" || study : "+ showstudy+" || staris : "+showstairs+" || terrace : "+showterrace);
        }
        Picasso.with(context)
                .load(upcommingCallsModel.getUserProfilePic())
                .into(holder.expertProfilePic);


        holder.dropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDropdown(holder);
            }
        });

        holder.upComingCallsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDropdown(holder);
            }
        });
    }

    public void downloadFile(Context context,String fileName,String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadmanager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadmanager.enqueue(request);
    }

    /**
     * It will open more details about the expert*/
    private void openDropdown(UpcomingCallsAdapter.UpcomingCallsViewHolder holder) {
        if(isOpen){
            Animations.expand(holder.detailsDropdown);
            holder.dropdown.setBackgroundResource(R.drawable.ic_baseline_expand_less_24);
            isOpen=false;
        }else {
            Animations.collapse(holder.detailsDropdown);
            holder.dropdown.setBackgroundResource(R.drawable.ic_baseline_expand_more_24);
            isOpen=true;
        }
    }

    @Override
    public int getItemCount() {
        return upcommingCalls.size();
    }

    public static class UpcomingCallsViewHolder extends RecyclerView.ViewHolder {
        TextView expertName,callTime,service,callDate,callDuration,upcomingCallTime,Area,Type,Floor,Bedroom,Washroom,Storeroom,Others,VastuDetails;
        ImageView expertProfilePic;
        ImageButton dropdown;
        Button naksha;
        LinearLayout detailsDropdown;
        AdvancedCardView upComingCallsCard;


        public UpcomingCallsViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            expertName = (TextView) itemView.findViewById(R.id.expertName);
            upcomingCallTime = (TextView) itemView.findViewById(R.id.upcomingCallTime);
            expertProfilePic = (ImageView) itemView.findViewById(R.id.expertProfilePic);
            service = (TextView) itemView.findViewById(R.id.service);
            callDate= (TextView) itemView.findViewById(R.id.date);
            callTime = (TextView) itemView.findViewById(R.id.time);
            callDuration = (TextView) itemView.findViewById(R.id.duration);
            VastuDetails = (TextView) itemView.findViewById(R.id.VastuDetails);
            Area = (TextView) itemView.findViewById(R.id.Area);
            Type = (TextView) itemView.findViewById(R.id.Type);
            Floor = (TextView) itemView.findViewById(R.id.Floor);
            Bedroom = (TextView) itemView.findViewById(R.id.Bedrooms);
            Washroom = (TextView) itemView.findViewById(R.id.Washrooms);
            Storeroom = (TextView) itemView.findViewById(R.id.Storerooms);
            Others = (TextView) itemView.findViewById(R.id.Others);
            dropdown = (ImageButton) itemView.findViewById(R.id.dropdown_menu);
            detailsDropdown = (LinearLayout) itemView.findViewById(R.id.detailsCallDropdown);
            upComingCallsCard = (AdvancedCardView) itemView.findViewById(R.id.upcomingCallsCard);
            naksha = (Button) itemView.findViewById(R.id.naksha);

        }
    }
}
