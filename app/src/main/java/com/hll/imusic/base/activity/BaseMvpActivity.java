package com.example.musicplayer.base.activity;

import com.example.musicplayer.base.presenter.IPresenter;

/**
 * <pre>
 *     author : 黄侣琳
 *     time   : 2020/06/22
 *     desc   :泛型继承
 * </pre>
 */

public abstract class BaseMvpActivity<T extends IPresenter> extends BaseActivity{
    protected abstract T getPresenter();
    protected T mPresenter;

    @Override
    protected void initView() {
        mPresenter = getPresenter();
        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter != null){
            mPresenter.detachView();
            mPresenter = null;
        }
    }
}
