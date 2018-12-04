package my.edu.taruc.p2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Double doubleBMI=0.0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textViewMsg;
        textViewMsg = findViewById(R.id.showBMI);
        Intent intent;
        intent=getIntent();
        if(intent.hasExtra(MainActivity.TAG_MESSAGE))
        {
            doubleBMI = intent.getDoubleExtra(MainActivity.TAG_MESSAGE,0.0);


        }
        ImageView image;
        image = findViewById(R.id.image);
        if(doubleBMI<=18.5)
        {
            image.setImageResource(R.drawable.under);
            textViewMsg.setText("BMI = "+doubleBMI.toString()+ " UnderWeight ");
        }
        else if(doubleBMI>=18.5&&doubleBMI<=24.9)
        {
            image.setImageResource(R.drawable.normal);
            textViewMsg.setText("BMI = "+doubleBMI.toString()+ " Normal ");
        }
        else if(doubleBMI>=25)
        {
            image.setImageResource(R.drawable.over);
            textViewMsg.setText("BMI = "+doubleBMI.toString()+ " OverWeight ");
        }
        else
        {
            image.setImageResource(R.drawable.empty);
        }
    }
}
