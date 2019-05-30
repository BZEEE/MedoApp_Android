package com.example.medoapp_android.ui.workspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.medoapp_android.R;
import com.example.medoapp_android.ui.viewscan.ViewscanActivity;

public class WorkspaceActivity extends AppCompatActivity {

    private LinearLayout patient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workspace);

        this.patient = findViewById(R.id.patient1);
        this.patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewScans();
            }
        });
    }

    private void openViewScans() {
        Intent intent = new Intent(this, ViewscanActivity.class);
        startActivity(intent);
    }
}
