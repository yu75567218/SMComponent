package com.hy.modulelogin;

import android.app.Application;
import android.util.Log;

import com.hy.librarycommon.init.IModuleInit;

/**
 * @ClassName: ModuleInit
 * @Description: 初始化
 * @Author: yu.haung1
 * @CreateDate: 2019/10/23 17:23
 */
public class ModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        Log.e("tag", "登录模块初始化 --- 前");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        Log.e("tag", "登录模块初始化 --- 后");
        return false;
    }
}
