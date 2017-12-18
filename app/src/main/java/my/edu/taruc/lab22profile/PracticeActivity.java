package my.edu.taruc.lab22profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PracticeActivity extends AppCompatActivity {

    private static final int REQUEST_MAIN_MENU = 1;

    public TextView textViewNum;
    public  TextView textViewQuestion;
    public Button buttonA;
    public int countNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        textViewNum = (TextView)findViewById(R.id.textViewNum);
        textViewQuestion = (TextView)findViewById(R.id.textViewQuestion);
        buttonA = (Button)findViewById(R.id.buttonA);
        CreateQuestion();
        textViewNum.setText(""+countNum);
    }


    void CreateQuestion(){
        int min = 1;
        int max = 30;
        int ans;

        Random r = new Random();
        int num1 = r.nextInt(max - min + 1) + min;

        int num2 = r.nextInt(max - min + 1) + min;
        textViewQuestion.setText(num1 + "+" + num2 + " = ?");
        ans = num1 + num2;
        buttonA.setText("A. "+ans);

    }

    public void buttonAans(View view){
        if(countNum<12){
            countNum++;
            textViewNum.setText(""+countNum);
            CreateQuestion();
        }
        else if(countNum >= 12){
            Intent intent = new Intent(this,MainActivity.class);
            startActivityForResult(intent, REQUEST_MAIN_MENU);
        }

    }

}
