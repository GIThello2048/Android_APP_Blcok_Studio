package com.javavar.myapplication.Log;

public class Log {
    public void i(String TAG,String msg){
        android.util.Log.i(TAG, msg);
        System.gc();
    }
    public void d(String TAG,String msg){
        android.util.Log.d(TAG,msg);
        System.gc();
    }
    public void w(String TAG,String msg){
        android.util.Log.w(TAG,msg);
        System.gc();
    }
    public void e(String TAG,String msg){
        android.util.Log.e(TAG,msg);
        System.gc();
    }
    public void v(String TAG,String msg){
        android.util.Log.v(TAG,msg);
        System.gc();
    }
}
