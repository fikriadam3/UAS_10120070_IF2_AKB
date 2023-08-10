/**
 * NIM : 10120070
 * NAMA : Fikri Adam Pratama Sutanto
 * KELAS : IF-2
 */
package com.uas.notes;

public class Config {

    public static String DB_URL = "https://uas-akb-10120070-default-rtdb.firebaseio.com/";
    public static String FCM_SERVER_KEY = "AAAAPRjuMgY:APA91bEV82gv1jmWMc4rF50ra-60vMzvAXi_amIq_FDyHyPwlb16sjjotSrHkFSit_hc1o4uuBcpp-WobW0ddPQck2uWcLDnbahfvt_5ycCq48rfhR49FGXaYWnfsMOjZyx_yz0HwmBu";

    public static String getDB_URL() {
        return DB_URL;
    }

    public static String getFCM_SERVER_KEY() {
        return FCM_SERVER_KEY;
    }
}
