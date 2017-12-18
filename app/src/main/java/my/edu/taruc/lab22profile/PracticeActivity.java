package my.edu.taruc.lab22profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class PracticeActivity extends AppCompatActivity {

    public TextView textViewNum;
    public  TextView textViewQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        textViewNum = (TextView)findViewById(R.id.textViewNum);
        textViewQuestion = (TextView)findViewById(R.id.textViewQuestion);
        CreateQuestion();
        //textViewQuestion.setText("LOL");
    }


    void CreateQuestion(){
        int min = 1;
        int max = 30;

        Random r = new Random();
        int num1 = r.nextInt(max - min + 1) + min;

        int num2 = r.nextInt(max - min + 1) + min;
        textViewQuestion.setText(num1 + "+" + num2 + " = ?");
    }
}
