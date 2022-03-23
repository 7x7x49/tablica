package com.example.tablica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int PointsGuineas = 0;
    int PointsDogs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("PointsGuineas")
                && savedInstanceState.containsKey("PointsDogs")) {
            PointsGuineas = savedInstanceState.getInt("PointsGuineas");
            PointsDogs = savedInstanceState.getInt("PointsDogs");

        }
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.txt_view);
        textView.setText(PointsGuineas+"    :    "+PointsDogs);
    }

    public void onClickAddPointToGuineas(View view) {
        PointsGuineas++;
        TextView textView = findViewById(R.id.txt_view);
        textView.setText(PointsGuineas+"    :    "+PointsDogs);
    }

    public void onClickAddPointToDogs(View view) {
        PointsDogs++;
        TextView textView = findViewById(R.id.txt_view);
        textView.setText(PointsGuineas+"    :    "+PointsDogs);
    }

    public void onClickReset(View view){
        TextView textView = findViewById(R.id.txt_view);
        PointsGuineas = 0;
        PointsDogs = 0;
        textView.setText(PointsGuineas+"    :    "+PointsDogs);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("PointsGuineas", PointsGuineas);
        outState.putInt("PointsDogs", PointsDogs);
    }


}