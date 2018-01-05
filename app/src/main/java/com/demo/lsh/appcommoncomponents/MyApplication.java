package com.demo.lsh.appcommoncomponents;

import android.app.Application;

import com.lsh.toolcomponentslibrary.PlatformId;
import com.lsh.toolcomponentslibrary.ToolComponentsApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adonis_lsh on 2018/1/5
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        Map<PlatformId, Map<String, String>> configMaps = new HashMap<>();
        Map<String, String> qqMap = new HashMap<>();
        qqMap.put("", "");
        configMaps.put(PlatformId.QQ,qqMap);
        ToolComponentsApplication
                .getInstance()
                .initToolComponents(this,"",configMaps);
        super.onCreate();
    }
}
