package com.example.musicplayer.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.musicplayer.base.view.BaseView;
import com.example.musicplayer.util.CommonUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * <pre>
 *     author : 黄侣琳
 *     time   : 2020/06/22
 *     desc   : 所有活动的基类
 * </pre>
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView {
        /*1.抽象类不能有对象，（不能用new此关键字来创建抽象类的对象）；
        2.有抽象方法的类一定是抽象类，但是抽象类中不一定有抽象方法；
        3.抽象类中的抽象方法必须在子类中被重写。*/
    private Unbinder mBinder;

    protected abstract int getLayoutId(); //获取布局id
    protected abstract void initView(); //初始化布局
    protected abstract void initData(); //初始化数据
    protected abstract void onClick();//点击事件

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView();
        initData();
        onClick();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mBinder != null && mBinder != mBinder.EMPTY){
            mBinder.unbind();
            mBinder = null;
        }
    }

    @Override
    public void showToast(String message) {
        CommonUtil.showToast(this,message);
    }

    @Override
    public void showNormalView() {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void reload() {

    }
}
