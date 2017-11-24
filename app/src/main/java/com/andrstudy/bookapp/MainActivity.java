package com.andrstudy.bookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Date date;
    TextView year,monthDay,week,putTitle,putContents;
    ImageButton kid, saddle, blue, fantasy, man;
    ImageView imageView;
    String kidTitle, saddleTitle, blueTitle, fantasyTitle, manTitle;
    String kidStory, saddleStory, blueStory, fanstasyStory, manStory;

    long now                        = System.currentTimeMillis();
    SimpleDateFormat yFormat        = new SimpleDateFormat("yyyy");
    SimpleDateFormat mFormat        = new SimpleDateFormat("MM");
    SimpleDateFormat dayFormat      = new SimpleDateFormat("dd");
    SimpleDateFormat weekFormat     = new SimpleDateFormat("EEEE", Locale.getDefault());

    Calendar cal                    = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //<---------------------------날짜----------------------->
        date = new Date(now);

        year            = (TextView)findViewById(R.id.year);
        monthDay        = (TextView)findViewById(R.id.monthDay);
        week            = (TextView)findViewById(R.id.week);
        putTitle        = (TextView)findViewById(R.id.putTextView);
        putContents     = (TextView)findViewById(R.id.putCountents);
        //<-------------------------------------------------------->
        year.setText(yFormat.format(date) + "년");
        monthDay.setText(mFormat.format(date) + "월" + dayFormat.format(date) + "일");
        week.setText(weekFormat.format(cal.getTime()));
        //<---------------------------날짜 끝 ---------------------------------------->
        //<-------------------------이미지 버튼---------------------------------------->
        kid         = (ImageButton)findViewById(R.id.kid);
        saddle      = (ImageButton)findViewById(R.id.saddle);
        blue        = (ImageButton)findViewById(R.id.blue);
        fantasy     = (ImageButton)findViewById(R.id.fantasy);
        man         = (ImageButton)findViewById(R.id.man);
        //<--------------------------------------------------------------------------->
        imageView  = (ImageView)findViewById(R.id.putImage);
        //<-------------------------OnClick Listener---------------------------------->
        kid.setOnClickListener(this);
        saddle.setOnClickListener(this);
        blue.setOnClickListener(this);
        fantasy.setOnClickListener(this);
        man.setOnClickListener(this);
        //<--------------------------------------------------------------------------->
        kidTitle        = "세상의\n어린이들";
        saddleTitle     = "자전거\n안장이 왜 ?";
        blueTitle       = "여자\n바다에 누워";
        fantasyTitle    = "인터스텔라\n장면인듯";
        manTitle        = "남자랑여자랑\n둘이 뭐했어";
        //<---------------------------------------------------------------------------->
        kidStory            = "Sampler Lee,2017,샘플출판사\n\n작가가 6개월간 배낭 여행을 다니며 찍은\n세계 각국의 어린이 사진들.";
        saddleStory         = "자전거와 함께,1753,우리학교\n\n작가가 왜 찍었는지도 모르는\n자신도 모르는 사진 이야기.";
        blueStory           = "저 바다에 누워,1985,높은 음자리\n\n왜 누워 있는지 누워도 왜 바다에 누웠는지\n아무도 모르는 사실";
        fanstasyStory       = "인터스텔러,2011,딱봐다 망작\n\n왜 가지 못하고 여기에 있는지 모르는 사람\n나 돌아갈래...";
        manStory            = "남자와여자,2033,둘이 뭐했어\n\n왜 여기서 우리가 앞을 보는가\n그리고 왜 하필 옆에서 찍은 것인가.";
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.kid:
                imageView.setImageResource(R.drawable.kid);
                putTitle.setText(kidTitle);
                putContents.setText(kidStory);
                break;
            case R.id.saddle:
                imageView.setImageResource(R.drawable.saddle);
                putTitle.setText(saddleTitle);
                putContents.setText(saddleStory);
                break;
            case R.id.blue:
                imageView.setImageResource(R.drawable.blue);
                putTitle.setText(blueTitle);
                putContents.setText(blueStory);
                break;
            case R.id.fantasy:
                imageView.setImageResource(R.drawable.fantasy);
                putTitle.setText(fantasyTitle);
                putContents.setText(fanstasyStory);
                break;
            case R.id.man:
                imageView.setImageResource(R.drawable.man);
                putTitle.setText(manTitle);
                putContents.setText(manStory);
                break;
        }
    }
}
