package com.example.sitimulacademi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class listning extends AppCompatActivity {


    Button  Courses, Listening1_1 , Listening1_2 , Listening1_3 , Listening1_4 , Listening1_5 ,
            Listening1_6 , Listening1_7 , Listening2_1 , Listening2_2 , Listening2_3 , Listening2_4 , Listening2_5 ,
            Listening2_6 , Listening2_7 , Listening2_8 ,Listening2_9 ,Listening2_10 , listening3_1 , listening3_2 , listening3_3 , listening3_4 , listening3_5 , listening3_6
            ,listening3_7 , listening3_8 , listening3_9 ,  listening4_1 , listening4_2 , listening4_3 ,listening4_4,listening4_5 , listening4_6 ,
            listening5_1 , listening5_2 , listening5_3 , listening5_4 , listening5_5 , listening5_6 , listening5_7,
            listening5_8 , listening5_9  , listening6_1, listening6_2 , listening6_3 ,listening6_4 , listening6_5 ,listening6_6 ,listening6_7
             , listening7_1 ,listening7_2 , listening7_3 , listening7_4 , listening7_5 , listening7_6,
            listening8_1 , listening8_2 , listening8_3 ,listening8_4 ,listening8_5 , listening8_6, listening9_1,listening9_2,listening9_3,
    listening9_4 ,listening9_5,listening9_6,listening9_7, listening9_8,
            listening10_1,  listening10_5,  listening10_4,  listening10_3,  listening10_2,  listening11_1,
            listening11_2, listening11_3,  listening11_4,  listening11_5,  listening11_6,
            listening12_1,  listening12_2,  listening12_3,  listening12_4,  listening12_5,
            unit1 , unit2 , unit3 , unit4 , unit5 ,unit6 , unit7 , unit8 ,unit9  , unit10 ,unit11 , unit12 ;


    boolean[] list = new boolean[]{true , true, true, true, true, true, true, true , true  , true , true , true};
    Intent intent;
    int gorunus1 =0 , exit_say =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listning);
        Intent Sintent = new Intent(listning.this  ,Sellect_random.class);
        Courses  = (Button) findViewById(R.id.lcourses);

        Listening1_1 = findViewById(R.id.l11);Listening1_2 = findViewById(R.id.l12);
        Listening1_3 = findViewById(R.id.l13);Listening1_4 = findViewById(R.id.l14);
        Listening1_5 = findViewById(R.id.l15);Listening1_6 = findViewById(R.id.l16);
        Listening1_7 = findViewById(R.id.l17);Listening2_1 = findViewById(R.id.l21);
        Listening2_2 = findViewById(R.id.l22);Listening2_3 = findViewById(R.id.l23);
        Listening2_4 = findViewById(R.id.l24);Listening2_5 = findViewById(R.id.l25);
        Listening2_6 = findViewById(R.id.l26);Listening2_7 = findViewById(R.id.l27);
        Listening2_8 = findViewById(R.id.l28);Listening2_9 = findViewById(R.id.l29);
        Listening2_10 = findViewById(R.id.l210);listening3_1 = findViewById(R.id.l31);
        listening3_2 = findViewById(R.id.l32);listening3_3 = findViewById(R.id.l33);
        listening3_4 = findViewById(R.id.l34);listening3_5 = findViewById(R.id.l35);
        listening3_6 = findViewById(R.id.l36);listening3_7 = findViewById(R.id.l37);
        listening3_8 = findViewById(R.id.l38);listening3_9 = findViewById(R.id.l39);
        listening4_1 = findViewById(R.id.l41);listening4_2 = findViewById(R.id.l42);
        listening4_3 = findViewById(R.id.l43);listening4_4 = findViewById(R.id.l44);
        listening4_5 = findViewById(R.id.l45);listening4_6 = findViewById(R.id.l46);
        listening5_1 = findViewById(R.id.l51);listening5_2 = findViewById(R.id.l52);
        listening5_3 = findViewById(R.id.l53);listening5_4 = findViewById(R.id.l54);
        listening5_5 = findViewById(R.id.l55);listening5_6 = findViewById(R.id.l56);
        listening5_7 = findViewById(R.id.l57);listening5_8 = findViewById(R.id.l58);
        listening5_9 = findViewById(R.id.l59);listening6_1 = findViewById(R.id.l61);
        listening6_2 = findViewById(R.id.l62);listening6_3 = findViewById(R.id.l63);
        listening6_4 = findViewById(R.id.l64);listening6_5 = findViewById(R.id.l65);
        listening6_6 = findViewById(R.id.l66);listening6_7 = findViewById(R.id.l67);
        listening7_1 = findViewById(R.id.l71);listening7_2 = findViewById(R.id.l72);
        listening7_3 = findViewById(R.id.l73);listening7_4 = findViewById(R.id.l74);
        listening7_5 = findViewById(R.id.l75);listening7_6 = findViewById(R.id.l76);
        listening8_1 = findViewById(R.id.l81);listening8_2 = findViewById(R.id.l82);
        listening8_3 = findViewById(R.id.l83);listening8_4 = findViewById(R.id.l84);
        listening8_5 = findViewById(R.id.l85);listening8_6 = findViewById(R.id.l86);
        listening9_1 = findViewById(R.id.l91);listening9_2 = findViewById(R.id.l92);
        listening9_3 = findViewById(R.id.l93);listening9_4 = findViewById(R.id.l94);
        listening9_5 = findViewById(R.id.l95);listening9_6 = findViewById(R.id.l96);
        listening9_7 = findViewById(R.id.l97);listening9_8 = findViewById(R.id.l98);
        listening10_1 = findViewById(R.id.l101);listening10_2 = findViewById(R.id.l102);
        listening10_3 = findViewById(R.id.l103);listening10_4 = findViewById(R.id.l104);
        listening10_5 = findViewById(R.id.l105);listening11_1 = findViewById(R.id.l111);
        listening11_2 = findViewById(R.id.l112);listening11_3 = findViewById(R.id.l113);
        listening11_4 = findViewById(R.id.l114);listening11_5 = findViewById(R.id.l115);
        listening11_6 = findViewById(R.id.l116);listening12_1 = findViewById(R.id.l121);
        listening12_2 = findViewById(R.id.l122);listening12_3 = findViewById(R.id.l123);
        listening12_4 = findViewById(R.id.l124);listening12_5 = findViewById(R.id.l125);
        unit1 = findViewById(R.id.unit1);unit2 = findViewById(R.id.unit2);
        unit3 = findViewById(R.id.unit3);unit4 = findViewById(R.id.unit4);
        unit5 = findViewById(R.id.unit5);unit6 = findViewById(R.id.unit6);
        unit7 = findViewById(R.id.unit7);unit8 = findViewById(R.id.unit8);
        unit9 = findViewById(R.id.unit9);unit10 = findViewById(R.id.unit10);
        unit11 = findViewById(R.id.unit11);unit12= findViewById(R.id.unit12);



        // acilan unit in yeniden aciq qalmasini temin edir;
        gorunus1 = getIntent().getIntExtra("gorunus1" , -1);
        if(gorunus1!=-1){

            list[gorunus1] = true;
            visible(gorunus1+1);
        }

        // clasi teyin edir
        intent = new Intent(this , Dinleme.class);


        //krus activisini acilmasini temin edir
        Courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Sintent);
            }
        });

    }

    //dinleme  activitisini acir
    public  void todinleme(View v){
        intent.putExtra("kod" , v.getId());
        intent.putExtra("gorunus1" , gorunus1);
        startActivity(intent);
    }

  //  unit on click metodu
    public  void lisning_acilis(View v){
       // Toast.makeText(getApplicationContext(), String.valueOf(v.getId()), Toast.LENGTH_LONG).show();
        if(v.getId()==unit1.getId()){
            visible(1);
           // Toast.makeText(getApplicationContext(), String.valueOf("1 girdi"), Toast.LENGTH_LONG).show();
        }
       else if(v.getId() == unit2.getId()){
          visible(2);
            //Toast.makeText(getApplicationContext(), String.valueOf("2 ye girdi"), Toast.LENGTH_LONG).show();

        }
       else if(v.getId() == unit3.getId()){
           visible(3);
           // Toast.makeText(getApplicationContext(), String.valueOf("3ye girdi"), Toast.LENGTH_LONG).show();

        }
      else  if(v.getId() == unit4.getId()){
          visible(4);

        }
        else  if(v.getId() == unit5.getId()){
            visible(5);

        }
        else  if(v.getId() == unit6.getId()){
            visible(6);

        }
        else  if(v.getId() == unit7.getId()){
            visible(7);

        }
        else  if(v.getId() == unit8.getId()){
            visible(8);

        }
        else  if(v.getId() == unit9.getId()){
            visible(9);

        }
        else  if(v.getId() == unit10.getId()){
            visible(10);

        }
        else  if(v.getId() == unit11.getId()){
            visible(11);

        }
        else  if(v.getId() == unit12.getId()){
            visible(12);

        }
    }

    // listlinglerin gorunub gorunmemsini temin edir

    public  void visible(int i){

        switch (i){
            case 1:
                if(list[0]) {
                    Listening1_1.setVisibility(View.VISIBLE);
                    Listening1_2.setVisibility(View.VISIBLE);
                    Listening1_3.setVisibility(View.VISIBLE);
                    Listening1_4.setVisibility(View.VISIBLE);
                    Listening1_5.setVisibility(View.VISIBLE);
                    Listening1_6.setVisibility(View.VISIBLE);
                    Listening1_7.setVisibility(View.VISIBLE);
                    gorunus1 = 0;
                    list[0] = false;
                }
                 else{
                    Listening1_1.setVisibility(View.GONE);
                    Listening1_2.setVisibility(View.GONE);
                    Listening1_3.setVisibility(View.GONE);
                    Listening1_4.setVisibility(View.GONE);
                    Listening1_5.setVisibility(View.GONE);
                    Listening1_6.setVisibility(View.GONE);
                    Listening1_7.setVisibility(View.GONE);
                    list[0]  = true;
                }
                break;


            case 2:
                if(list[1] ) {
                    Listening2_1.setVisibility(View.VISIBLE);
                    Listening2_2.setVisibility(View.VISIBLE);
                    Listening2_3.setVisibility(View.VISIBLE);
                    Listening2_4.setVisibility(View.VISIBLE);
                    Listening2_5.setVisibility(View.VISIBLE);
                    Listening2_6.setVisibility(View.VISIBLE);
                    Listening2_7.setVisibility(View.VISIBLE);
                    Listening2_8.setVisibility(View.VISIBLE);
                    Listening2_9.setVisibility(View.VISIBLE);
                    Listening2_10.setVisibility(View.VISIBLE);
                    gorunus1 = 1;
                    list[1] = false;

                }else{
                    Listening2_1.setVisibility(View.GONE);
                    Listening2_2.setVisibility(View.GONE);
                    Listening2_3.setVisibility(View.GONE);
                    Listening2_4.setVisibility(View.GONE);
                    Listening2_5.setVisibility(View.GONE);
                    Listening2_6.setVisibility(View.GONE);
                    Listening2_7.setVisibility(View.GONE);
                    Listening2_8.setVisibility(View.GONE);
                    Listening2_9.setVisibility(View.GONE);
                    Listening2_10.setVisibility(View.GONE);
                    list[1] =true;
                }
                break;

            case 3:

                if(list[2]) {
                    listening3_1.setVisibility(View.VISIBLE);
                    listening3_2.setVisibility(View.VISIBLE);
                    listening3_3.setVisibility(View.VISIBLE);
                    listening3_4.setVisibility(View.VISIBLE);
                    listening3_5.setVisibility(View.VISIBLE);
                    listening3_6.setVisibility(View.VISIBLE);
                    listening3_7.setVisibility(View.VISIBLE);
                    listening3_8.setVisibility(View.VISIBLE);
                    listening3_9.setVisibility(View.VISIBLE);
                    gorunus1 = 2;
                    list[2] = false;
                }else{
                    listening3_1.setVisibility(View.GONE);
                    listening3_2.setVisibility(View.GONE);
                    listening3_3.setVisibility(View.GONE);
                    listening3_4.setVisibility(View.GONE);
                    listening3_5.setVisibility(View.GONE);
                    listening3_6.setVisibility(View.GONE);
                    listening3_7.setVisibility(View.GONE);
                    listening3_8.setVisibility(View.GONE);
                    listening3_9.setVisibility(View.GONE);
                    list[2] =true;
                }
                break;

            case 4:
                if(list[3]){
                    listening4_1.setVisibility(View.VISIBLE);
                    listening4_2.setVisibility(View.VISIBLE);
                    listening4_3.setVisibility(View.VISIBLE);
                    listening4_4.setVisibility(View.VISIBLE);
                    listening4_5.setVisibility(View.VISIBLE);
                    listening4_6.setVisibility(View.VISIBLE);
                    gorunus1 = 3;
                    list[3] = false;
                }else {
                    listening4_1.setVisibility(View.GONE);
                    listening4_2.setVisibility(View.GONE);
                    listening4_3.setVisibility(View.GONE);
                    listening4_4.setVisibility(View.GONE);
                    listening4_5.setVisibility(View.GONE);
                    listening4_6.setVisibility(View.GONE);
                    list[3] = true;
                }

                break;

            case 5:
                if(list[4]){
                    listening5_1.setVisibility(View.VISIBLE);
                    listening5_2.setVisibility(View.VISIBLE);
                    listening5_3.setVisibility(View.VISIBLE);
                    listening5_4.setVisibility(View.VISIBLE);
                    listening5_5.setVisibility(View.VISIBLE);
                    listening5_6.setVisibility(View.VISIBLE);
                    listening5_7.setVisibility(View.VISIBLE);
                    listening5_8.setVisibility(View.VISIBLE);
                    listening5_9.setVisibility(View.VISIBLE);
                    gorunus1 = 4;
                    list[4] = false;
                }else{
                    listening5_1.setVisibility(View.GONE);
                    listening5_2.setVisibility(View.GONE);
                    listening5_3.setVisibility(View.GONE);
                    listening5_4.setVisibility(View.GONE);
                    listening5_5.setVisibility(View.GONE);
                    listening5_6.setVisibility(View.GONE);
                    listening5_7.setVisibility(View.GONE);
                    listening5_8.setVisibility(View.GONE);
                    listening5_9.setVisibility(View.GONE);
                    list[4] = true;
                }

                break;

            case 6:
                if(list[5]){
                    listening6_1.setVisibility(View.VISIBLE);
                    listening6_2.setVisibility(View.VISIBLE);
                    listening6_3.setVisibility(View.VISIBLE);
                    listening6_4.setVisibility(View.VISIBLE);
                    listening6_5.setVisibility(View.VISIBLE);
                    listening6_6.setVisibility(View.VISIBLE);
                    listening6_7.setVisibility(View.VISIBLE);
                    gorunus1 = 5;
                    list[5] = false;
                }else {
                    listening6_1.setVisibility(View.GONE);
                    listening6_2.setVisibility(View.GONE);
                    listening6_3.setVisibility(View.GONE);
                    listening6_4.setVisibility(View.GONE);
                    listening6_5.setVisibility(View.GONE);
                    listening6_6.setVisibility(View.GONE);
                    listening6_7.setVisibility(View.GONE);
                    list[5] = true;
                }

                break;

            case 7:
                if(list[6]){
                    listening7_1.setVisibility(View.VISIBLE);
                    listening7_2.setVisibility(View.VISIBLE);
                    listening7_3.setVisibility(View.VISIBLE);
                    listening7_4.setVisibility(View.VISIBLE);
                    listening7_5.setVisibility(View.VISIBLE);
                    listening7_6.setVisibility(View.VISIBLE);
                    gorunus1 = 6;
                    list[6] = false;
                }else {
                    listening7_1.setVisibility(View.GONE);
                    listening7_2.setVisibility(View.GONE);
                    listening7_3.setVisibility(View.GONE);
                    listening7_4.setVisibility(View.GONE);
                    listening7_5.setVisibility(View.GONE);
                    listening7_6.setVisibility(View.GONE);
                    list[6]= true;
                }

                break;

            case 8:
                if(list[7]){
                    listening8_1.setVisibility(View.VISIBLE);
                    listening8_2.setVisibility(View.VISIBLE);
                    listening8_3.setVisibility(View.VISIBLE);
                    listening8_4.setVisibility(View.VISIBLE);
                    listening8_5.setVisibility(View.VISIBLE);
                    listening8_6.setVisibility(View.VISIBLE);
                    gorunus1 = 7;
                    list[7] = false;
                }else {
                    listening8_1.setVisibility(View.GONE);
                    listening8_2.setVisibility(View.GONE);
                    listening8_3.setVisibility(View.GONE);
                    listening8_4.setVisibility(View.GONE);
                    listening8_5.setVisibility(View.GONE);
                    listening8_6.setVisibility(View.GONE);
                    list[7]= true;
                }

                break;

            case 9:
                if(list[8]){
                    listening9_1.setVisibility(View.VISIBLE);
                    listening9_2.setVisibility(View.VISIBLE);
                    listening9_3.setVisibility(View.VISIBLE);
                    listening9_4.setVisibility(View.VISIBLE);
                    listening9_5.setVisibility(View.VISIBLE);
                    listening9_6.setVisibility(View.VISIBLE);
                    listening9_7.setVisibility(View.VISIBLE);
                    listening9_8.setVisibility(View.VISIBLE);

                    gorunus1 = 8;
                    list[8] = false;
                }else{
                    listening9_1.setVisibility(View.GONE);
                    listening9_2.setVisibility(View.GONE);
                    listening9_3.setVisibility(View.GONE);
                    listening9_4.setVisibility(View.GONE);
                    listening9_5.setVisibility(View.GONE);
                    listening9_6.setVisibility(View.GONE);
                    listening9_7.setVisibility(View.GONE);
                    listening9_8.setVisibility(View.GONE);

                    list[8] = true;
                }

                break;

            case 10:
                if(list[9]){
                    listening10_1.setVisibility(View.VISIBLE);
                    listening10_2.setVisibility(View.VISIBLE);
                    listening10_3.setVisibility(View.VISIBLE);
                    listening10_4.setVisibility(View.VISIBLE);
                    listening10_5.setVisibility(View.VISIBLE);
                    gorunus1 = 9;
                    list[9] = false;
                }else{
                    listening10_1.setVisibility(View.GONE);
                    listening10_2.setVisibility(View.GONE);
                    listening10_3.setVisibility(View.GONE);
                    listening10_4.setVisibility(View.GONE);
                    listening10_5.setVisibility(View.GONE);
                    list[9] = true;
                }
                break;

            case 11:
                if(list[10]){
                    listening11_1.setVisibility(View.VISIBLE);
                    listening11_2.setVisibility(View.VISIBLE);
                    listening11_3.setVisibility(View.VISIBLE);
                    listening11_4.setVisibility(View.VISIBLE);
                    listening11_5.setVisibility(View.VISIBLE);
                    listening11_6.setVisibility(View.VISIBLE);
                    gorunus1 = 10;
                    list[10] = false;
                }else{
                    listening11_1.setVisibility(View.GONE);
                    listening11_2.setVisibility(View.GONE);
                    listening11_3.setVisibility(View.GONE);
                    listening11_4.setVisibility(View.GONE);
                    listening11_5.setVisibility(View.GONE);
                    listening11_6.setVisibility(View.GONE);
                    list[10] = true;
                }
                break;

            case 12:
                if(list[11]){
                    listening12_1.setVisibility(View.VISIBLE);
                    listening12_2.setVisibility(View.VISIBLE);
                    listening12_3.setVisibility(View.VISIBLE);
                    listening12_4.setVisibility(View.VISIBLE);
                    listening12_5.setVisibility(View.VISIBLE);

                    gorunus1 = 11;
                    list[11] = false;
                }else{
                    listening12_1.setVisibility(View.GONE);
                    listening12_2.setVisibility(View.GONE);
                    listening12_3.setVisibility(View.GONE);
                    listening12_4.setVisibility(View.GONE);
                    listening12_5.setVisibility(View.GONE);

                    list[11] = true;
                }
                break;
        }
    }

    // ortada mesaj gosterici metod
    public  void normalAlertDialog(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Stimull Academy");
        alert.setMessage("Are you sure you want to exit the app?");
        alert.setCancelable(false);
        alert.setIcon(R.drawable.rejected);
        alert.setPositiveButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        alert.setNegativeButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cikis_yap();
            }
        }); alert.show();
    }

    //programdan cixis eden metod
    private  void cikis_yap(){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }


    // geri duyemsi metodu
    @Override
    public void onBackPressed() {

        if(exit_say==0){
            normalAlertDialog(listening3_1);

        }else {
            Toast.makeText(getApplicationContext(), "Cikmak icin geriye 2 defa dokunun", Toast.LENGTH_LONG).show();
            exit_say--;
        }
    }
}