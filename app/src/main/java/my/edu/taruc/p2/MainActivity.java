package my.edu.taruc.p2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE ="my.edu.taruc.p2" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        EditText weight;
        EditText height;
        weight = findViewById(R.id.editWeight);
        height = findViewById(R.id.editHeight);
        Double doubleWeight = Double.parseDouble(weight.getText().toString());
        Double doubleHeight = Double.parseDouble(height.getText().toString());
        Double BMI;
        BMI=doubleWeight/(doubleHeight*doubleHeight);
        Intent intent;
        intent = new Intent(this,Result.class);
        intent.putExtra(TAG_MESSAGE, BMI);
        startActivity(intent);

    }
}
