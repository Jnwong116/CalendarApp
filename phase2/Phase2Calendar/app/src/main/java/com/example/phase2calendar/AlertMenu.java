package com.example.phase2calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.phase2calendar.logic.User;

public class AlertMenu extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_menu);

        Intent intent = getIntent();
        this.user = (User) intent.getSerializableExtra("currentUser");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent back = new Intent(this, MainMenuActivity.class);
        back.putExtra("currentUser", user);
        startActivity(back);
        return true;
    }

    public void newAlert(View view)
    {
        Intent newAlert = new Intent(this, )
    }
}
