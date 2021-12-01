package com.rudraksha.rudrakshashakti.Pojo;

public class Courses {
    String userProfilePic,userName,sessions,course,courseDate,courseDuration,userId,upcomingCourse;

    public Courses(String userProfilePic, String userName, String sessions, String course, String courseDate, String courseDuration, String userId, String upcomingCourse) {
        this.userProfilePic = userProfilePic;
        this.userName = userName;
        this.sessions = sessions;
        this.course = course;
        this.courseDate = courseDate;
        this.courseDuration = courseDuration;
        this.userId = userId;
        this.upcomingCourse = upcomingCourse;
    }

    public Courses(){}

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public String getUserName() {
        return userName;
    }

    public String getSessions() {
        return sessions;
    }

    public String getCourse() {
        return course;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public String getUpcomingCourse() {
        return upcomingCourse;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSessions(String sessions) {
        this.sessions = sessions;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUpcomingCourse(String upcomingCourse) {
        this.upcomingCourse = upcomingCourse;
    }
}
