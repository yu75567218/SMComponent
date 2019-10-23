package com.hy.smcomponent;

import android.app.Application;
import android.util.Log;

import com.hy.librarycommon.init.ModuleLifecycleConfig;

/**
 * @ClassName: AppApplication
 * @Description: java类作用描述
 * @Author: yu.haung1
 * @CreateDate: 2019/10/23 17:13
 */
public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        Log.e("tag", "主模块初始化");
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
