package com.example.corona;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {
Button b1;
String s1="Welcome to my app";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b1=findViewById(R.id.button1);

               b1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent myIntent=new Intent(MainActivity.this,Main2Activity.class);
                               startActivity(myIntent);
                       Toast.makeText(MainActivity.this,s1,Toast.LENGTH_SHORT).show();
                   }
               });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder allertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        allertDialogBuilder.setMessage(R.string.messege);
        allertDialogBuilder.setCancelable(false);
        allertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        allertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog allertDialog=allertDialogBuilder.create();
        allertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        ,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
