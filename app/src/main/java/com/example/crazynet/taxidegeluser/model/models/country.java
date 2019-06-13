package com.example.crazynet.taxidegeluser.model.models;

/**
 * Created by Medhat on 12/10/2018.
 */

public class country {

    private int flag ;
    private int code;

    public country() {
    }

    public country(int flag, int code) {

        this.flag = flag;
        this.code = code;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
