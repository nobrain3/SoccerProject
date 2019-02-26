package kr.co.kjworld.soccerproject.login.kakao;

import android.content.Context;
import android.support.annotation.Nullable;

import com.kakao.auth.ApprovalType;
import com.kakao.auth.AuthType;
import com.kakao.auth.IApplicationConfig;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.KakaoAdapter;

import kr.co.kjworld.soccerproject.MainActivity;
import kr.co.kjworld.soccerproject.common.SoccerApplication;

public class KakaoSDKAdapter extends KakaoAdapter {
    @Override
    public IApplicationConfig getApplicationConfig() {
        IApplicationConfig newIAppLicationConfig = new IApplicationConfig() {
            @Override
            public Context getApplicationContext() {
                return SoccerApplication.getSoccerApplicationContext();
            }
        };
        return newIAppLicationConfig;
    }


    @Override
    public ISessionConfig getSessionConfig() {
        ISessionConfig newSessionConfig = new ISessionConfig() {
            @Override
            public AuthType[] getAuthTypes() {
                return new AuthType[] {AuthType.KAKAO_LOGIN_ALL};
            }

            @Override
            public boolean isUsingWebviewTimer() {
                return false;
            }

            @Override
            public boolean isSecureMode() {
                return false;
            }

            @Nullable
            @Override
            public ApprovalType getApprovalType() {
                return ApprovalType.INDIVIDUAL;
            }

            @Override
            public boolean isSaveFormData() {
                return false;
            }
        };
        return newSessionConfig;
    }
}
