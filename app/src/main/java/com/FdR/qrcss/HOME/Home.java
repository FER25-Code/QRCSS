package com.FdR.qrcss.HOME;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.FdR.qrcss.COMMAND.CommandActivity;
import com.FdR.qrcss.OPTION.OptionActivity;
import com.FdR.qrcss.R;
import com.FdR.qrcss.STOCK.StockActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        Button bt1_Op = findViewById(R.id.id_Op);
        Button bt2_Co = findViewById(R.id.id_Co);
        Button bt3_St = findViewById(R.id.id_St);

        bt1_Op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, OptionActivity.class);
                startActivity(intent);
            }
        });
        bt2_Co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, CommandActivity.class);
                startActivity(intent);
            }
        });
        bt3_St.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Home.this, StockActivity.class);
               startActivity(intent);
            }
        });
    }
}