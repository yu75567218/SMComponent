package com.hy.librarycommon.init;

import android.app.Application;

/**
 * @ClassName: IModuleInit
 * @Description: 定义一个 IModuleInit 接口，动态配置Application，需要初始化的组件实现该接口，统一在宿主app的Application中初始化
 * @Author: yu.haung1
 * @CreateDate: 2019/10/23 17:11
 */
public interface IModuleInit {
    //初始化优先的
    boolean onInitAhead(Application application);

    //初始化靠后的
    boolean onInitLow(Application application);
}
