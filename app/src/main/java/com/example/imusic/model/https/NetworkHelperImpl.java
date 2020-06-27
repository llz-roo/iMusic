package com.example.imusic.model.https;

import com.example.musicplayer.entiy.Album;
import com.example.musicplayer.entiy.AlbumSong;
import com.example.musicplayer.entiy.OnlineSongLrc;
import com.example.musicplayer.entiy.SearchSong;
import com.example.musicplayer.entiy.SingerImg;
import com.example.musicplayer.entiy.SongLrc;
import com.example.musicplayer.entiy.SongUrl;
import com.example.musicplayer.model.https.api.RetrofitService;

import io.reactivex.Observable;

public class NetworkHelperImpl implements NetworkHelper {
    private RetrofitService mRetrofitService;

    public NetworkHelperImpl(RetrofitService retrofitService){
        mRetrofitService = retrofitService;
    }

    @Override
    public Observable<AlbumSong> getAlbumSong(String id) {
        return mRetrofitService.getAlbumSong(id);
    }

    @Override
    public Observable<SearchSong> search(String seek, int offset) {
        return mRetrofitService.search(seek, offset);
    }

    @Override
    public Observable<Album> searchAlbum(String seek, int offset) {
        return mRetrofitService.searchAlbum(seek, offset);
    }

    @Override
    public Observable<SongLrc> getLrc(String seek) {
        return mRetrofitService.getLrc(seek);
    }

    @Override
    public Observable<OnlineSongLrc> getOnlineSongLrc(String songId) {
        return mRetrofitService.getOnlineSongLrc(songId);
    }

    @Override
    public Observable<SingerImg> getSingerImg(String singer) {
        return mRetrofitService.getSingerImg(singer);
    }

    @Override
    public Observable<SongUrl> getSongUrl(String data) {
        return mRetrofitService.getSongUrl(data);
    }
}
