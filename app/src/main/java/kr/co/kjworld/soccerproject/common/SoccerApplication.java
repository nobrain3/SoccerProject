package kr.co.kjworld.soccerproject.common;

import android.app.Application;

import com.kakao.auth.KakaoSDK;

import kr.co.kjworld.soccerproject.login.kakao.KakaoSDKAdapter;

public class SoccerApplication extends Application {
    private static volatile SoccerApplication instance = null;

    /**
     * singleton 애플리케이션 객체를 얻는다.
     * @return singleton 애플리케이션 객체
     */
    public static SoccerApplication getSoccerApplicationContext() {
        if(instance == null)
            throw new IllegalStateException("this application does not inherit com.kakao.GlobalApplication");
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        KakaoSDK.init(new KakaoSDKAdapter());
    }
}
