package com.rudraksha.rudrakshashakti.Pojo;

import java.util.List;

public class ExpertCourseDetails {

    List<String>courses;
    String courseUnderReview,DurationOfCourse,courseMode,sessions,BasicCoursePrice,AdvanceCoursePrice,expertNote,ProfilePic,name,experience,whatsappNo;




    public ExpertCourseDetails(){

    }

    public ExpertCourseDetails(List<String> courses, String courseUnderReview, String courseMode, String DurationOfCourse, String sessions, String BasicCoursePrice, String AdvanceCoursePrice, String expertNote,String ProfilePic,String name,String experience,String whatsappNo){
        this.courses = courses;
        this.courseUnderReview = courseUnderReview;
        this.DurationOfCourse = DurationOfCourse;
        this.courseMode = courseMode;
        this.sessions = sessions;
        this.BasicCoursePrice = BasicCoursePrice;
        this.AdvanceCoursePrice = AdvanceCoursePrice;
        this.expertNote = expertNote;
        this.ProfilePic = ProfilePic;
        this.name = name;
        this.experience = experience;
        this.whatsappNo = whatsappNo;


    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getCourseUnderReview() {
        return courseUnderReview;
    }

    public void setCourseUnderReview(String courseUnderReview) {
        this.courseUnderReview = courseUnderReview;
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

    public String getBasicCoursePrice() {
        return BasicCoursePrice;
    }

    public void setBasicCoursePrice(String BasicCoursePrice) {
        this.BasicCoursePrice = BasicCoursePrice;
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

    public String getWhatsappNo() {
        return whatsappNo;
    }

    public void setWhatsappNo(String whatsappNo) {
        this.whatsappNo = whatsappNo;
    }
}