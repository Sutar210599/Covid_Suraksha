package com.example.covid_suraksha;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class covid_sat extends AppCompatActivity {

    RadioGroup rg1,rg2,rg3,rg4,rg5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.covid_sat);
        getSupportActionBar().setTitle("COVID SAT Qs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.drop_down,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"You are already on this page",Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item2:
                Intent intent=new Intent(covid_sat.this,About.class);
                startActivity(intent);
                return true;
            default:return super.onOptionsItemSelected(item);
        }

    }
    public void predstart(View view)
    {
        //Toast.makeText(this,"Item 2 selected",Toast.LENGTH_LONG).show();
        //high=2,mild=1,no=0
        int count=0;
        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);
        rg4=findViewById(R.id.rg4);
        rg5=findViewById(R.id.rg5);
        if(rg1.getCheckedRadioButtonId()==R.id.rg1_high)
            count+=2;
        if (rg1.getCheckedRadioButtonId()==R.id.rg1_mild)
            count+=1;
        if(rg1.getCheckedRadioButtonId()==R.id.rg1_no)
            count+=0;
        if (rg2.getCheckedRadioButtonId()==R.id.rg2_high)
            count+=2;
        if (rg2.getCheckedRadioButtonId()==R.id.rg2_mild)
            count+=1;
        if (rg2.getCheckedRadioButtonId()==R.id.rg2_no)
            count+=0;
        if (rg3.getCheckedRadioButtonId()==R.id.rg3_high)
            count+=2;
        if (rg3.getCheckedRadioButtonId()==R.id.rg3_mild)
            count+=1;
        if (rg3.getCheckedRadioButtonId()==R.id.rg3_no)
            count+=0;
        if (rg4.getCheckedRadioButtonId()==R.id.rg4_high)
            count+=2;
        if (rg4.getCheckedRadioButtonId()==R.id.rg4_mild)
            count+=1;
        if (rg4.getCheckedRadioButtonId()==R.id.rg4_no)
            count+=0;
        if (rg5.getCheckedRadioButtonId()==R.id.rg5_high)
            count+=2;
        if (rg5.getCheckedRadioButtonId()==R.id.rg5_mild)
            count+=1;
        if (rg5.getCheckedRadioButtonId()==R.id.rg5_no)
            count+=0;
        if(count<=3 && count >=2)
            Toast.makeText(this,"You need to visit a doctor asap",Toast.LENGTH_LONG).show();
        else if(count<2)
            Toast.makeText(this,"Take rest and be in quarantine",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"You are a potential COVID victim",Toast.LENGTH_LONG).show();




    }
}
