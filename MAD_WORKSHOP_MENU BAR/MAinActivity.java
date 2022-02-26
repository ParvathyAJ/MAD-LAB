package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      }
      public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menures,menu);
        return true;

      }
      public boolean onOptionsItemSelected(MenuItem item){
          Toast.makeText(this,"Selected Item:" +item.getTitle(),Toast.LENGTH_SHORT).show();
          switch(item.getItemId()){
              case R.id.search_item:
                  //code
                  return true;
                  case R.id.upload_item:
                  //code
                  return true;
              case R.id.copy_item:
                  //code
                  return true;
              case R.id.print_item:
                  //code
                  return true;
              case R.id.share_item:
                  //code
                  return true;
              case R.id.mark_item:
                  //code
                  return true;
              default:return super.onOptionsItemSelected((item));
          }
      }
}