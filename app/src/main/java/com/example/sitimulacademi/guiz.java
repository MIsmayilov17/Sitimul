package com.example.sitimulacademi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class guiz<guiz_true1> extends AppCompatActivity {


    Handler handler;
    Runnable runnable;
    // sozun ingils ve ya az dilinde olmasi
    Boolean Az = false;
    sozler sozler = new sozler();
    Random r = new Random();
    int can = 3  , exit_say =1 , sehv_cavab = 0;
    double saniye = 100;


    int son =0, baslangiz = 0 , dogru =0;
    int secilmis;
    int location = 0;
   int araliq , min =0, max=0;

    // 4 dene cavabin sozlerini qey edir , her dongude sifirlanir
    ArrayList<Integer> local_random = new ArrayList<>();
    // secilen sozleri tutur
    ArrayList<Integer> arrayList = new ArrayList<>();

    ArrayList<Button> buttonArrayList = new ArrayList<>();

    RadioButton English , Azerbaijan;
    Boolean All = false;
    TextView guiz_sayac , true_text , false_text;
    ProgressBar guiz_bar;
    Button guiz_true4 , guiz_exit , guiz_soru , guiz_true1 , guiz_true2 ,guiz_true3;
 ImageView hearth , false_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiz);


        true_text = findViewById(R.id.true_text);
        guiz_exit =  findViewById(R.id.guiz_exit);
        guiz_soru =  findViewById(R.id.guiz_soru);
         guiz_true1 =  findViewById(R.id.guiz_true1);
       guiz_true2 =  findViewById(R.id.guiz_true2);
      guiz_true3 = findViewById(R.id.guiz_true3);
        guiz_true4 =  findViewById(R.id.guiz_true4);
         guiz_bar = findViewById(R.id.guiz_Bar);
         guiz_sayac =  findViewById(R.id.guiz_sayac);
         English  = findViewById(R.id.English);
         Azerbaijan = findViewById(R.id.Azerbaijan);
         hearth = findViewById(R.id.hearth);
         false_icon = findViewById(R.id.false_icon);
         false_text = findViewById(R.id.false_text);
        buttonArrayList.add(guiz_true1);
        buttonArrayList.add(guiz_true2);
        buttonArrayList.add(guiz_true3);
        buttonArrayList.add(guiz_true4);
        All = getIntent().hasExtra("All");


        // All tru olarsa guzin zaman esasli omasini temin edir
        if(All){
            max = sozler.ingilis.length;
            min = 1;
            araliq = sozler.ingilis.length -1;
            hearth.setVisibility(View.VISIBLE);
            guiz_bar.setMax(100);
            random_sozler();
            random_yer();
            false_text.setVisibility(View.GONE);
            false_icon.setVisibility(View.GONE);

            // sekbar geri sayim yenileme
            handler = new Handler();
            runnable = new Runnable() {
                @Override
                public void run() {
                    guiz_bar.setProgress((int) saniye   );

                    saniye-=1;
                    if(saniye==0 & can>0){
                        saniye=100;
                        // zaman bitdikde random yalnis metodu
                        btnClick(guiz_exit);
                        random_sozler();
                        random_yer();
                    }
                    handler.postDelayed(this , 100);
                }
            };
            handler.post(runnable);
        }

        // All false oolarsa quizin normal islemesini temin edir
        else
        {
            araliq = getIntent().getIntExtra("max", 8) - getIntent().getIntExtra("min", 1);
            min = getIntent().getIntExtra("min", 50);
            max = getIntent().getIntExtra("max", 5);
            guiz_bar.setMax(araliq);

            random_sozler();
            random_yer();
        }// Toast.makeText(getApplicationContext(), String.valueOf("girdi tebrik"), Toast.LENGTH_LONG).show();



        // ingilis dilinde olmasini temin edir
       English.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if(b){
                   Az = false;
               }

           }
       });

        // azerbaycan dilinde olmasini temin edir
       Azerbaijan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if(b){
                   Az = true;
               }
           }
       });

        // guizden cixmAQ UCUN ISTIFADE EDILIR
        guiz_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(guiz.this, Sellect_random.class);
                startActivity(intent);
            }
        });

    }


   // dogru cavabin yerini belirleyir
    public void  random_yer(){
        try {
            location = r.nextInt(4);
             guiz_bar.setProgress(dogru);
             if(All){
                 guiz_sayac.setText(String.valueOf(can));
             }else {
                 guiz_sayac.setText(String.valueOf(dogru) + "/" + String.valueOf(araliq));
             }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), " random yerde hata bas verdi",Toast.LENGTH_LONG).show();
        }
       for(int i =0 ; i<4 ; i++){
            if(i==location){
                 if(Az){
                buttonArrayList.get(i).setText(sozler.ingilis[secilmis]);
                 }else {buttonArrayList.get(i).setText(sozler.az[secilmis]);}

            }else{

                if(Az){
                buttonArrayList.get(i).setText(sozler.ingilis[bosluq_doldurma()]);
                }
                else{ buttonArrayList.get(i).setText(sozler.az[bosluq_doldurma()]);
                }

            }
       }

       local_random.clear();
    }

    // vwerilen araliqdan random soz secir
    public void random_sozler(){
        try {
            do {
                secilmis = r.nextInt(araliq)+min;

            } while (arrayList.contains(secilmis));
            arrayList.add(secilmis);
            if(Az) {
                guiz_soru.setText(sozler.az[secilmis]);
            }
            else{
               guiz_soru.setText(sozler.ingilis[secilmis]);
            }

            local_random.add(secilmis);


        }catch (Exception e){
            Toast.makeText(getApplicationContext(), " random sozlerde hata bas verdi",Toast.LENGTH_LONG).show();
        }
    }


    //duymelere seh cavablar erlesdirir
    public int bosluq_doldurma(){
        int atama=0;
      do{
          atama = r.nextInt(araliq)+min;
      }while (local_random.contains(atama));
       local_random.add(atama);
      return atama;
    }


    // button on click metodu
    public void btnClick (View v){
        if(location ==2 & v.getId()==guiz_true3.getId()) {
            random_sozler();
            random_yer();
            saniye =100;
            dogru++;
            true_text.setText(String.valueOf(dogru));
        }
        else if(location ==1 & v.getId()==guiz_true2.getId()) {
            random_sozler();
            random_yer();
            saniye = 100;
            dogru++;
            true_text.setText(String.valueOf(dogru));
        }
        else if(location ==0 & v.getId()==guiz_true1.getId()) {
            saniye = 100;
            random_sozler();
            random_yer();
            dogru++;
            true_text.setText(String.valueOf(dogru));

        }
        else if(location ==3 & v.getId()==guiz_true4.getId()) {
            saniye = 100;
            random_sozler();
            random_yer();
            dogru++;
            true_text.setText(String.valueOf(dogru));
        }

        else {

                Toast.makeText(getApplicationContext(), "yalnis cavab",Toast.LENGTH_LONG).show();
                if(All) {
                    can--;
                    guiz_sayac.setText(String.valueOf(can));
                }

                if(arrayList.contains(secilmis)==true){
                    arrayList.remove(arrayList.size()-1);
                    Toast.makeText(getApplicationContext(), "if ee girdi",Toast.LENGTH_LONG).show();
                    sehv_cavab++;
                    false_text.setText(String.valueOf(sehv_cavab));
            }



        }

        if(dogru==araliq ||can==0){
            guiz_true1.setClickable(false);
            guiz_true2.setClickable(false);
            guiz_true3.setClickable(false);
            guiz_true4.setClickable(false);
            if(can==0){

                Toast.makeText(getApplicationContext(), "can bitdi",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplicationContext(), "soru bitdi", Toast.LENGTH_LONG).show();
            }
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
            normalAlertDialog(guiz_true1);

        }else {
            Toast.makeText(getApplicationContext(), "Cikmak icin yeniden dokunun", Toast.LENGTH_LONG).show();
            exit_say--;
        }
    }
}