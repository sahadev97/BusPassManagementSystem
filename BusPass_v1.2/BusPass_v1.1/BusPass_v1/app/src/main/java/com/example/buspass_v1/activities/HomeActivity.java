package com.example.buspass_v1.activities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.buspass_v1.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_showPass:
                Intent showPassIntent = new Intent(this, ShowPassActivity.class);
                startActivity(showPassIntent);
            case R.id.menu_profile:
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.menu_about_us:
                Intent aboutUsIntent = new Intent(this, AboutUsActivity.class);
                startActivity(aboutUsIntent);
                return true;
            case R.id.menu_faq:
                Intent faqIntent = new Intent(this, FAQActivity.class);
                startActivity(faqIntent);
                return true;
            case R.id.menu_logout:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void NewPassBtn(View view) {
        startActivity(new Intent(this, NewPassActivity.class));
    }

    public void RenewPassBtn(View view) {
        startActivity(new Intent(this, RenewPassActivity.class));
    }

    public void CancelPassBtn(View view) {
        startActivity(new Intent(this, CancelPassActivity.class));
    }

    public void PassHistoryBtn(View view) {
        startActivity(new Intent(this, PassHistoryActivity.class));
    }


}