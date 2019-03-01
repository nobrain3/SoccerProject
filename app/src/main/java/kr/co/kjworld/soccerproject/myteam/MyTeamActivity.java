package kr.co.kjworld.soccerproject.myteam;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import kr.co.kjworld.soccerproject.R;

public class MyTeamActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myteam_main);

        FragmentManager fragmentManager = getFragmentManager();

    }
}
