package com.rudraksha.rudrakshashakti.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rudraksha.rudrakshashakti.Pojo.Courses;
import com.rudraksha.rudrakshashakti.Pojo.PreviousCalls;
import com.rudraksha.rudrakshashakti.R;
import com.rudraksha.rudrakshashakti.Utilities.Animations;
import com.sinaseyfi.advancedcardview.AdvancedCardView;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>{
    Context context;
    ArrayList<Courses> courses;
    Boolean isOpen = true;

    public CoursesAdapter(Context context, ArrayList<Courses> courses){
        this.context = context;
        this.courses= courses;
    }

    @NonNull
    @Override
    public CoursesAdapter.CoursesViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.expert_course_cards, parent, false);
        return new CoursesAdapter.CoursesViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull CoursesAdapter.CoursesViewHolder holder, int position) {
        final Courses coursesModel = courses.get(position);
        holder.userName.setText(coursesModel.getUserName());
        holder.upcomingCourse.setText(coursesModel.getUpcomingCourse());
        holder.course.setText("Course:  "+ coursesModel.getCourse());
        holder.sessions.setText("Sessions:  "+ coursesModel.getSessions());
        holder.courseDuration.setText("Duration:  "+ coursesModel.getCourseDuration()+" months");
        holder.courseDate.setText("Date:  "+ coursesModel.getCourseDate());
        Picasso.with(context)
                .load(coursesModel.getUserProfilePic())
                .into(holder.userProfilePic);


        holder.dropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDropdown(holder);
            }
        });

        holder.courseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDropdown(holder);
            }
        });
    }

    private void openDropdown(CoursesAdapter.CoursesViewHolder holder) {
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
        return courses.size();
    }

    public static class CoursesViewHolder extends RecyclerView.ViewHolder {
        TextView userName,sessions,course,courseDate,courseDuration,upcomingCourse;
        ImageView userProfilePic;
        ImageButton dropdown;
        LinearLayout detailsDropdown;
        AdvancedCardView courseCard;


        public CoursesViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            userName = (TextView) itemView.findViewById(R.id.userNameCourse);
            sessions = (TextView) itemView.findViewById(R.id.sessions);
            userProfilePic = (ImageView) itemView.findViewById(R.id.userProfilePicCourse);
            course = (TextView) itemView.findViewById(R.id.course);
            courseDate= (TextView) itemView.findViewById(R.id.courseDate);
            upcomingCourse = (TextView) itemView.findViewById(R.id.upcomingCourse);
            courseDuration = (TextView) itemView.findViewById(R.id.courseDuration);
            dropdown = (ImageButton) itemView.findViewById(R.id.dropdown_menu_courses);
            detailsDropdown = (LinearLayout) itemView.findViewById(R.id.detailsCourseDropdown);
            courseCard = (AdvancedCardView) itemView.findViewById(R.id.courseCard);

        }
    }
}
