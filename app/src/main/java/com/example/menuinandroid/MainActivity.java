package com.example.menuinandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idd = item.getItemId();
        TextView mytext = findViewById(R.id.textview);
        switch (idd) {
            case R.id.add: {
                mytext.setText("item add selected");
                break;
            }
            case R.id.left: {
                mytext.setText("item goback selected");
                break;
            }
            case R.id.file: {
                mytext.setText("item file selected");
                break;
            }
            case R.id.saveas: {
                mytext.setText("item save as selected");
                break;
            }
            case R.id.load: {
                mytext.setText("item load selected");
                break;
            }
            case R.id.exit: {
                mytext.setText("item exit selected");
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}
