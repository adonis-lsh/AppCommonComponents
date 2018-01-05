package com.lsh.toolcomponentslibrary;

import android.app.Activity;
import android.content.Intent;

import com.umeng.socialize.UMShareAPI;

/**
 * Created by adonis_lsh on 2018/1/5
 */

public class ToolComponentsUtils {
    private static final ToolComponentsUtils utilsInstance = new ToolComponentsUtils();

    public static ToolComponentsUtils getInstance() {
        return utilsInstance;
    }

    private ToolComponentsUtils() {
    }

    public void authorizationAndShareActivityResult(Activity activity,int requestCode, int resultCode, Intent data) {
        UMShareAPI.get(activity).onActivityResult(requestCode, resultCode, data);
    }
}
