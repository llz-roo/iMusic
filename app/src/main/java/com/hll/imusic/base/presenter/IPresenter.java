package com.example.musicplayer.base.presenter;

import com.example.musicplayer.base.view.BaseView;

import io.reactivex.disposables.Disposable;

/**
 * <pre>
 *     author : 黄侣琳
 *     time   : 2020/06/22
 *     desc   : 抽象Presenter
 * </pre>
 */

public interface IPresenter<T extends BaseView> {
    void attachView(T view); //注入View
    boolean isAttachView(); //判断是否注入View
    void detachView(); //解除View
    void addRxSubscribe(Disposable disposable);//添加订阅者
}
