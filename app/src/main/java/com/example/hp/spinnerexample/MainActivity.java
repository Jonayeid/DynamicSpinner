package com.example.hp.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner divisionSP,upozellaSP,serviceSP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        divisionSP = findViewById(R.id.divisionSP);
        upozellaSP = findViewById(R.id.upozellaSP);
        serviceSP = findViewById(R.id.serviceSP);

        final String divisions[] =  {
                "---Select Division---",
                "Dhaka",
                "Kishoreganj",
                "Chittagong",
                "Shylet"
        };
        final String Shylet[] ={
                "Shylet1",
                "Shylet2",
                "Shylet3",
                "Shylet4"
        };
        final String Chittagong[] ={
                "Chittagong1",
                "Chittagong2",
                "Chittagong3",
                "Chittagong4"
        };
        final String sub_divisions[] =  {
                "---Select Division---",
                "Dhaka1",
                "Kishoreganj1",
                "Chittagong1",
                "Shylet1"
        };

        final String select[] = {"---select upozella --"};
        final String select1[] = {"---select service --"};

        final String upozella[] ={
                "--Select Upozella--",
                "Lalbag",
                "Islambag",
                "Chawkbazar",
                "Shahbag",
                "New Market"
        };

        final String services[] ={
                "--Select Service--",
                "service1",
                "service2",
                "service3",
                "service4",
                "service5",
                "service6",

        };

        final ArrayAdapter<String> adapter;
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,divisions);

        divisionSP.setAdapter(adapter);

        divisionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedDivision = divisions[i];
                if(i==0){
                    final ArrayAdapter<String> adapter4;
                    adapter4= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,select);
                    upozellaSP.setAdapter(adapter4);
                }
                if(i==1){
                    final ArrayAdapter<String> adapter4;
                    adapter4= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,sub_divisions);
                    upozellaSP.setAdapter(adapter4);
                    upozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String upozalla = sub_divisions[i];
                            if(i==0){
                                ArrayAdapter<String> adapter2;
                                adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,select1);
                                serviceSP.setAdapter(adapter2);
                            }
                            if(i==1){
//
                                ArrayAdapter<String> adapter2;
                                adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,services);
                                serviceSP.setAdapter(adapter2);
                                serviceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String service = services[i];
                                        Toast.makeText(MainActivity.this, ""+service, Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                            }
                            if(i==2){
                                ArrayAdapter<String> adapter2;
                                adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,Shylet);
                                serviceSP.setAdapter(adapter2);
                                serviceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String service = Shylet[i];
                                        Toast.makeText(MainActivity.this, ""+service, Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            Toast.makeText(MainActivity.this, ""+upozalla, Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(i==2){
                    final ArrayAdapter<String> adapter5;
                    adapter5= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,upozella);
                    upozellaSP.setAdapter(adapter5);
                    upozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String upozalla = upozella[i];
                            if(i==0){

                            }if(i==1){
                                Toast.makeText(MainActivity.this, ""+upozalla, Toast.LENGTH_SHORT).show();

                            }                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(i==3){
                    final ArrayAdapter<String> adapter5;
                    adapter5= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,Chittagong);
                    upozellaSP.setAdapter(adapter5);
                    upozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String upozalla = Chittagong[i];
                            if(i==0){

                            }if(i==1){
                                Toast.makeText(MainActivity.this, ""+upozalla, Toast.LENGTH_SHORT).show();

                            }                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }if(i==4){
                    final ArrayAdapter<String> adapter5;
                    adapter5= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,Shylet);
                    upozellaSP.setAdapter(adapter5);
                    upozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String upozalla = Shylet[i];
                            if(i==0){

                            }else{
                                Toast.makeText(MainActivity.this, ""+upozalla, Toast.LENGTH_SHORT).show();

                            }                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

                Toast.makeText(MainActivity.this, ""+selectedDivision, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//        Toast.makeText(AddPeopleWithService.this, "Division Name :"+selectedDivision, Toast.LENGTH_SHORT).show();


//        if (selectedDivision.equals("Dhaka")){




//        ArrayAdapter<String> adapter1;
//        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,upozella);
//
//        upozellaSP.setAdapter(adapter1);
//



    }
}
