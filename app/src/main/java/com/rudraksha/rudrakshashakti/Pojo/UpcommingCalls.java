package com.rudraksha.rudrakshashakti.Pojo;

public class UpcommingCalls {
    String userProfilePic,userName,callTime,service,callDate,callDuration,Area,floor,PropType,Bedroom,Storeroom,Washroom,kitchen,dinning,drawing,study,stairs,terrace,imgurl ;

    public UpcommingCalls(String userProfilePic, String userName, String callTime, String service, String callDate, String callDuration, String Area,String floor,String PropType,String Bedroom,String Storeroom,String Washroom,String kitchen,String dinning ,String drawing,String study,String stairs,String terrace, String imgurl) {
        this.userProfilePic = userProfilePic;
        this.userName = userName;
        this.callTime = callTime;
        this.service = service;
        this.callDate = callDate;
        this.callDuration = callDuration;
        this.Area = Area;
        this.floor = floor;
        this.PropType = PropType;
        this. Bedroom= Bedroom;
        this.Storeroom =Storeroom ;
        this.Washroom = Washroom;
        this.kitchen =kitchen ;
        this.dinning = dinning;
        this.drawing = drawing;
        this. study= study;
        this. stairs= stairs;
        this. terrace=terrace ;
        this.imgurl = imgurl;
    }

    public UpcommingCalls(){}


    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCallDate() {
        return callDate;
    }

    public void setCallDate(String callDate) {
        this.callDate = callDate;
    }

    public String getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(String callDuration) {
        this.callDuration = callDuration;
    }

    public String getPropType() { return PropType; }

    public void setPropType(String PropType) { this.PropType = PropType; }

    public String getArea() { return Area; }

    public void setArea(String Area) { this.Area = Area; }

    public String getBedroom() { return Bedroom; }

    public void setBedroom(String Bedroom) { this.Bedroom = Bedroom; }

    public String getStoreroom() { return Storeroom; }

    public void setStoreroom(String Storeroom) { this.Storeroom = Storeroom; }

    public String getWashroom() { return Washroom; }

    public void setWashroom(String Washroom) { this.Washroom = Washroom; }

    public String getkitchen() { return kitchen; }

    public void setkitchen(String kitchen) { this.kitchen = kitchen; }

    public String getdinning() { return dinning; }

    public void setdinning(String dinning) { this.dinning = dinning; }

    public String getdrawing() { return drawing; }

    public void setdrawing(String drawing) { this.drawing = drawing; }

    public String getstudy() { return study; }

    public void setstudy(String study) { this.study = study; }

    public String getstairs() { return stairs; }

    public void setstairs(String stairs) { this.stairs = stairs; }

    public String getterrace() { return terrace; }

    public void setterrace(String terrace) { this.terrace = terrace; }

    public String getFloor() { return floor; }

    public void setFloor(String floor) { this.floor = floor; }

    public String getimgurl() { return imgurl; }

    public void setimgurl(String imgurl) { this.imgurl = imgurl; }

}
