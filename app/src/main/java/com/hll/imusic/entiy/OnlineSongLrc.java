package com.example.musicplayer.entiy;

/**
 * <pre>
 *     author : 黄侣琳
 *     time   : 2020/06/24
 *     desc   : qq音乐平台的网络歌词
 * </pre>
 */

public class OnlineSongLrc {
    private int code;
    private String lyric;

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getLyric() {
        return lyric;
    }
}
