package com.typelit.safetyprotectiondemo;

import android.util.Log;

import com.safetyprotection.App;
import com.safetyprotection.AppFlyer.AppsFlyerCallBase;
import com.safetyprotection.SafetyProtectionManageD.Bean.SafetyProtectionBean;
import com.safetyprotection.SafetyProtectionManageD.SafetyProtectionManage;

/**
 * @类描述: Application
 * @项目名称: SafetyProtection
 * @包名称: com.typelit.safetyprotectiondemo
 * ==================================================
 * @创建人: 雾都雄狮
 * @创建时间: 2024/1/4 13:55
 * @version: V1.0
 * ==================================================
 */
public class APPDemo extends App {
    private static final String LOG_TAG = "APPDemo";
    @Override
    public void onCreate() {
        super.onCreate();
        SafetyProtectionManage.getInstance()
                .setAF_DEV_KEY("65KGjam4H3ZB5GVdDEmpp6") // 动态设置AppFlyer 的 AF_DEV_KEY
                .initAppsflyer(this, new AppsFlyerCallBase() {
                    @Override
                    public void OnCallBack(SafetyProtectionBean mSafetyProtectionBean) {
                        Log.d(LOG_TAG, "safetyProtectionData: " + mSafetyProtectionBean.toString());
                    }
                }) // 初始化归因Appsflyer,并且可拿到整理好的安防数据
                .IslocationTaskEnabled(true); // 是否开启地理围栏 如开启地理围栏Activity需基础BaseActivity类，以获取定位权限
    }
}
