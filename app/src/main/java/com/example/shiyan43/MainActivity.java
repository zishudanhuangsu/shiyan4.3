package com.example.shiyan43;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.memu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView tv=(TextView)this.findViewById(R.id.text);
        int id = item.getItemId();
        if (id == R.id.sub_1_1) {
            //Toast.makeText(MainActivity.this, "Toast222", Toast.LENGTH_SHORT).show();
            tv.setTextSize(10);
            return true;
        }
        if (id == R.id.sub_1_2) {
            //Toast.makeText(MainActivity.this, "Toast222", Toast.LENGTH_SHORT).show();
            tv.setTextSize(16);
            return true;
        }
        if (id == R.id.sub_1_3) {
            //Toast.makeText(MainActivity.this, "Toast222", Toast.LENGTH_SHORT).show();
            tv.setTextSize(20);
            return true;
        }
        //通过ID来响应菜单项

        if (id == R.id.menuItem_2) {
            Toast.makeText(MainActivity.this, "Toast2", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.sub_2_1) {
            //Toast.makeText(MainActivity.this, "Toast222", Toast.LENGTH_SHORT).show();
            tv.setTextColor(Color.RED);
            return true;
        }
        if (id == R.id.sub_2_2) {
            //Toast.makeText(MainActivity.this, "Toast222", Toast.LENGTH_SHORT).show();
            tv.setTextColor(Color.BLACK);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
