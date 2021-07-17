package com.example.quizgameapp.LevelsofQuestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.quizgameapp.DashboardClass;
import com.example.quizgameapp.R;

public class LevelOneActivity extends AppCompatActivity {

    EditText AnsOne,Anstwo,Ansthree,AnsFour,AnsFive,AnsSix,AnsSeven,AnsEight,AnsNine,AnsTen;
    String stAnsOne,stAnstwo,stAnsthree,stAnsFour,stAnsFive,stAnsSix,stAnsSeven,stAnsEight,stAnsNine,stAnsTen;
    TextView StatusOne,Statustwo,Statusthree,StatusFour,StatusFive,StatusSix,StatusSeven,StatusEight,StatusNine,StatusTen;
    MediaPlayer mp = new MediaPlayer();
    MediaPlayer mp1 = new MediaPlayer();
    MediaPlayer warn = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
        AnsOne=findViewById(R.id.AnsOneId);
        Anstwo=findViewById(R.id.AnstwoId);
        Ansthree=findViewById(R.id.AnsthreeId);
        AnsFour=findViewById(R.id.AnsFourId);
        AnsFive=findViewById(R.id.AnsFiveId);
        AnsSix=findViewById(R.id.AnsSixId);
        AnsSeven=findViewById(R.id.AnsSevenId);
        AnsEight=findViewById(R.id.AnsEightId);
        AnsNine=findViewById(R.id.AnsNinetId);
        AnsTen=findViewById(R.id.AnsTenId);

        mp= MediaPlayer.create(this,R.raw.succ);

        mp1= MediaPlayer.create(this,R.raw.bckm);
        warn= MediaPlayer.create(this,R.raw.warn);

        mp1.start();






//        ////////////////
        StatusOne=findViewById(R.id.questOneStatus);
        Statustwo=findViewById(R.id.questtwoStatus);
        Statusthree=findViewById(R.id.questthreeStatus);
        StatusFour=findViewById(R.id.questFourStatus);
        StatusFive=findViewById(R.id.questFiveStatus);
        StatusSix=findViewById(R.id.questSixStatus);
        StatusSeven=findViewById(R.id.questSevenStatus);
        StatusEight=findViewById(R.id.questEightStatus);
        StatusNine=findViewById(R.id.questNineStatus);
        StatusTen=findViewById(R.id.questTenStatus);

    }

    public void QuestionOne(View view) {
        stAnsOne=AnsOne.getText().toString();
        if (stAnsOne.equals("c")||stAnsOne.equals("C")||stAnsOne.equals("Duck")||stAnsOne.equals("duck"))
        {
            StatusOne.setText("Correct");
            mp.start();
        }
        else
        {
            StatusOne.setText("Wrong Answer");
            warn.start();
        }


    }

    public void QuestionTwo(View view) {
        stAnstwo=Anstwo.getText().toString();
        if (stAnstwo.equals("a")||stAnstwo.equals("A")||stAnstwo.equals("Ox")||stAnstwo.equals("ox"))
        {
            Statustwo.setText("Correct");
            mp.start();
        }
        else
        {
            Statustwo.setText("Wrong Answer");
            warn.start();
        }

    }

    public void QuestionTHree(View view) {
        stAnsthree=Ansthree.getText().toString();
        if (stAnsthree.equals("b")||stAnsthree.equals("B")||stAnsthree.equals("Water")||stAnsthree.equals("water"))
        {
            Statusthree.setText("Correct");
            mp.start();
        }
        else
        {
            Statusthree.setText("Wrong Answer");
            warn.start();
        }
    }

    public void QuestionFour(View view) {
        stAnsFour=AnsFour.getText().toString();
        if (stAnsFour.equals("c")||stAnsFour.equals("C")||stAnsFour.equals("Tortise")||stAnsFour.equals("tortise"))
        {
            StatusFour.setText("Correct");
            mp.start();
        }
        else
        {
            StatusFour.setText("Wrong Answer");
            warn.start();
        }
    }

    public void QuestionFive(View view) {
        stAnsFive=AnsFive.getText().toString();
        if (stAnsFive.equals("d")||stAnsFive.equals("D")||stAnsFive.equals("Moon")||stAnsFive.equals("moon"))
        {
            StatusFive.setText("Correct");
            mp.start();
        }
        else
        {
            StatusFive.setText("Wrong Answer");
            warn.start();
        }

    }

    public void QuestionSix(View view) {
        stAnsSix=AnsSix.getText().toString();
        if (stAnsSix.equals("c")||stAnsSix.equals("C")||stAnsSix.equals("Leaves")||stAnsSix.equals("leaves"))
        {
            StatusSix.setText("Correct");
            mp.start();
        }
        else
        {
            StatusSix.setText("Wrong Answer");
            warn.start();
        }
    }

    public void QuestionSeven(View view) {
        stAnsSeven=AnsSeven.getText().toString();
        if (stAnsSeven.equals("d")||stAnsSeven.equals("D")||stAnsSeven.equals("Muscles")||stAnsSeven.equals("muscles"))
        {
            StatusSeven.setText("Correct");
            mp.start();
        }
        else
        {
            StatusSeven.setText("Wrong Answer");
            warn.start();
        }
    }

    public void QuestionEight(View view) {
        stAnsEight=AnsEight.getText().toString();
        if (stAnsEight.equals("a")||stAnsEight.equals("A")||stAnsEight.equals("Eyelids")||stAnsEight.equals("eyelids"))
        {
            StatusEight.setText("Correct");
            mp.start();
        }
        else
        {
            StatusEight.setText("Wrong Answer");
            warn.start();
        }
    }

    public void QuestionNine(View view) {
        stAnsNine=AnsNine.getText().toString();
        if (stAnsNine.equals("d")||stAnsNine.equals("D")||stAnsNine.equals("Sun")||stAnsNine.equals("sun"))
        {
            StatusNine.setText("Correct");
            mp.start();
        }
        else
        {
            StatusNine.setText("Wrong Answer");
            warn.start();
        }
    }

    public void QuestionTen(View view) {
        stAnsTen=AnsTen.getText().toString();
        if (stAnsTen.equals("c")||stAnsTen.equals("C")||stAnsTen.equals("Hands")||stAnsTen.equals("hands"))
        {
            StatusTen.setText("Correct");
            mp.start();
        }
        else
        {
            StatusTen.setText("Wrong Answer");
            warn.start();
        }
    }

    public void Submit(View view) {
        startActivity(new Intent(this, DashboardClass.class));
    }
}