package com.example.musicplayer.base.fragment;

import com.example.musicplayer.base.presenter.IPresenter;

/**
 * <pre>
 *     author : 黄侣琳
 *     time   : 2020/06/23
 *     desc   : Mvp模式Fragment的基类
 * </pre>
 */

public abstract class BaseMvpFragment<T extends IPresenter> extends BaseFragment {
    protected abstract T getPresenter();
    protected T mPresenter;

    @Override
    protected void initView() {
        mPresenter = getPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        if(mPresenter != null){
            mPresenter.detachView();
            mPresenter = null;
        }
        super.onDestroy();
    }
}
