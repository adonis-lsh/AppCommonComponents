package com.lsh.toolcomponentslibrary;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.Map;

/**
 * Created by adonis_lsh on 2018/1/5
 */

public class ToolComponentsApplication {
    private static final ToolComponentsApplication ourInstance = new ToolComponentsApplication();
    private String mUmeng_appkey;

    public static ToolComponentsApplication getInstance() {
        return ourInstance;
    }

    private ToolComponentsApplication() {
    }


    /**
     * 对库内的组件进行初始化
     * @param application
     */
    public  void initToolComponents(Application application, String umeng_appkey,Map<PlatformId,Map<String,String>> paramsMap) {
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = application.getPackageManager().getApplicationInfo(application.getPackageName(), PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if(applicationInfo == null){
            throw new IllegalArgumentException(" get application info = null, has no meta data! ");
        }
        applicationInfo.metaData.putString("UMENG_APPKEY",umeng_appkey);
        mUmeng_appkey = umeng_appkey;
    }
}
