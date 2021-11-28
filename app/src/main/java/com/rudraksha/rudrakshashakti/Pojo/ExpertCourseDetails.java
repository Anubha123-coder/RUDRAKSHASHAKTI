package com.rudraksha.rudrakshashakti.Pojo;

import java.util.List;

public class ExpertCourseDetails {

    List<String>courses;
    String availableForCourses,DurationOfCourse,courseMode,sessions,BasicCoursePrice,AdvanceCoursePrice,expertNote,ProfilePic,name,experience;




    public ExpertCourseDetails(){

    }

    public ExpertCourseDetails(List<String> courses, String availableForCourses, String courseMode, String DurationOfCourse, String sessions, String BasicCoursePrice, String AdvanceCoursePrice, String expertNote,String ProfilePic,String name,String experience){
        this.courses = courses;
        this.availableForCourses = availableForCourses;
        this.DurationOfCourse = DurationOfCourse;
        this.courseMode = courseMode;
        this.sessions = sessions;
        this.BasicCoursePrice = BasicCoursePrice;
        this.AdvanceCoursePrice = AdvanceCoursePrice;
        this.expertNote = expertNote;
        this.ProfilePic = ProfilePic;
        this.name = name;
        this.experience = experience;


    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getavailableForCourses() {
        return availableForCourses;
    }

    public void setavailableForCourses(String availableForCourses) {
        this.availableForCourses = availableForCourses;
    }

    public String getCourseMode() {
        return courseMode;
    }

    public void setCourseMode(String courseMode) {
        this.courseMode = courseMode;
    }
    public String getDurationOfCourse() {
        return DurationOfCourse;
    }

    public void setDurationOfCourse(String DurationOfCourse) {
        this.DurationOfCourse = DurationOfCourse;
    }

    public String getsessions() {
        return sessions;
    }

    public void setsessions(String sessions) {
        this.sessions = sessions;
    }

    public String getBasicCourcePrice() {
        return BasicCoursePrice;
    }

    public void setBasicCoursePrice(String coursePrice) {
        this.BasicCoursePrice = coursePrice;
    }

    public String getAdvanceCoursePrice() {
        return AdvanceCoursePrice;
    }

    public void setAdvanceCoursePrice(String AdvanceCoursePrice) {
        this.AdvanceCoursePrice = AdvanceCoursePrice;
    }

    public String getexpertNote() {
        return expertNote;
    }

    public void setexpertNote(String expertNote) {
        this.expertNote = expertNote;
    }

    public String getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(String ProfilePic) {
        this.ProfilePic = ProfilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}