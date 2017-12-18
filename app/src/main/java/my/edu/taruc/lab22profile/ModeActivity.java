package my.edu.taruc.lab22profile;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModeActivity extends AppCompatActivity {

    private static final int REQUEST_PRACTICE_MODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_mode);
    }

    public void Practicemode(View view){
        Intent intent = new Intent(this,PracticeActivity.class);
        startActivityForResult(intent, REQUEST_PRACTICE_MODE);
    }

}
