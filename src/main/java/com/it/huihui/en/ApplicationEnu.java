package com.it.huihui.en;

public enum ApplicationEnu {

    APP_ID(1001,"应用ID"),
    APP_NAME(1002,"应用名称");

    private int appId;

    private String appMsg;

    public int getAppId() {
        return appId;
    }

    public String getAppMsg() {
        return appMsg;
    }

    ApplicationEnu(int appId,String appMsg){
        this.appId = appId;
        this.appMsg = appMsg;
    }
}
