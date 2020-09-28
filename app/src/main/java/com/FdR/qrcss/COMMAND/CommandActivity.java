package com.FdR.qrcss.COMMAND;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.FdR.qrcss.QRCODE.ScanActivity;
import com.FdR.qrcss.R;
import com.google.zxing.integration.android.IntentIntegrator;

public class CommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        Button bt1_Sc = findViewById(R.id.id_scan);
        bt1_Sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            new IntentIntegrator(CommandActivity.this).setCaptureActivity(ScanActivity.class).initiateScan();

            }
        });
    }
}