package com.geekholt.android_aop;

import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geekholt.aspectj.annotation.BehaviorTrace;

/**
 * @author 吴灏腾
 * @date 2018/1/10
 * @describe TODO
 */

public class SecondActivity extends AppCompatActivity {

    @BehaviorTrace("加载第二个界面")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
