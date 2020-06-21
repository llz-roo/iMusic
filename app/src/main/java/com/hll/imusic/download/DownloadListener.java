package com.example.musicplayer.download;

import com.example.musicplayer.entiy.DownloadInfo;

/**
 * <pre>
 *     author : 黄侣琳
 *     time   : 2020/06/21
 *     desc   : 监听下载过程中的各种状态
 * </pre>
 */

public interface DownloadListener {
    void onProgress(DownloadInfo downloadInfo); //进度
    void onSuccess(); //成功
    void onDownloaded();//已经下载过的歌曲
    void onFailed(); //失败
    void onPaused();  //暂停
    void onCanceled(); //取消
}
