package my.edu.taruc.lab22profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PracticeActivity extends AppCompatActivity {

    public TextView textViewNum;
    public  TextView textViewQuestion;
    public Button buttonA;
    public int countNum = 0;

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

    public void buttonAans(){
        //countnum++;
        //textViewNum.setText(""+countnum);
        //CreateQuestion();
    }

}
