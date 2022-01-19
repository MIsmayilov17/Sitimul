package com.example.sitimulacademi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class Dinleme extends AppCompatActivity {
        SeekBar sekbar;
        Button playpause , speet , exit_dinleme;
        Runnable runnable;
        Handler handler;
        int kod;
        TextView name;
        boolean basla = true;
        float nowspeet=1f;

        int gorunsu1 =0 ,exit_say=1;
    Intent intent;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinleme);

        intent = new Intent(this , listning.class);

        exit_dinleme = findViewById(R.id.dinleme_exit);
        playpause = findViewById(R.id.Playpause);
        speet = findViewById(R.id.Speet);
        name  = findViewById(R.id.name);
        sekbar = findViewById(R.id.seekBar);
        gorunsu1 = getIntent().getIntExtra("gorunus1" , 0);
        kod = getIntent().getIntExtra("kod", 12);
        Toast.makeText(getApplicationContext(), String.valueOf(kod), Toast.LENGTH_LONG).show();
        namesecim(String.valueOf(kod));







           // cixisi temin edir ve listningli daynadirir
        exit_dinleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                intent.putExtra("gorunus1" ,gorunsu1);
               startActivity(intent);


            }
        });

        handler = new Handler();
       runnable = new Runnable() {
            @Override
            public void run() {
              sekbar.setProgress((int) mediaPlayer.getCurrentPosition());
              handler.postDelayed(this , 500);
            }
        };
        handler.post(runnable);

        //sek bar konum berirleme
       sekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b){
                    if(mediaPlayer.isPlaying()){
                        mediaPlayer.pause();
                        mediaPlayer.seekTo(i);
                        mediaPlayer.start();
                    }else {mediaPlayer.seekTo(i);}
                }
            }@Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }@Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



       //medianplayerspeed temin edir
        speet.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(nowspeet==1){
                    nowspeet= 1.5F;
                    speet.setText("1.5X");
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(1.5f));

                }
               else if(nowspeet==1.5){
                    nowspeet= 2F;
                    speet.setText("2X");
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(2));
                }
                else if(nowspeet==0.5){
                    nowspeet= 0.75F;
                    speet.setText("0.75X");
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(0.75f));
                }
                else if(nowspeet==0.75){
                    nowspeet= 1F;
                    speet.setText("1X");
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(1));
                }

                else if(nowspeet==2){
                    nowspeet= 0.5F;
                    speet.setText("0.5X");
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(0.5f));
                }
            }
        });

        // play pause edir
        playpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(basla){
                  mediaPlayer.start();
                  basla= false;
                  sekbar.setMax(mediaPlayer.getDuration());
                  mediaPlayer.setVolume(100,100);
              }
              else if(basla==false){
                  mediaPlayer.pause();
                  basla=true;
              }
            }
        });

    }

    //musiqi secimini edir
    public  void namesecim(String kode){

        if(kode.equals("2131230983")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio1);name.setText("Unit 1 Recording 1");
        }
        else if(kode.equals("2131230990")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio2);name.setText("Unit 1 Recording 2");
        }
        else if(kode.equals("2131230996")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio3);name.setText("Unit 1 Recording 3");
        }
        else if(kode.equals("2131230997")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4);name.setText("Unit 1 Recording 4");
        }
        else if(kode.equals("2131230998")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5);name.setText("Unit 1 Recording 5");
        }
        else if(kode.equals("2131230999")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6);name.setText("Unit 1 Recording 6");
        }
        else if(kode.equals("2131231000")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7);name.setText("Unit 1 Recording 7");
        }
        else if(kode.equals("2131231001")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_1);name.setText("Unit 2 Recording 1");
        }
        else if(kode.equals("2131231003")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_2);name.setText("Unit 2 Recording 2");
        }
        else if(kode.equals("2131231004")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_3);name.setText("Unit 2 Recording 3");
        }
        else if(kode.equals("2131231005")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_4);name.setText("Unit 2 Recording 4");
        }
        else if(kode.equals("2131231006")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_5);name.setText("Unit 2 Recording 5");
        }
        else if(kode.equals("2131231007")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_6);name.setText("Unit 2 Recording 6");
        }
        else if(kode.equals("2131231008")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_7);name.setText("Unit 2 Recording 7");
        }
        else if(kode.equals("2131231009")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_8);name.setText("Unit 2 Recording 8");
        }
        else if(kode.equals("2131231010")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_9);name.setText("Unit 2 Recording 9");
        }
        else if(kode.equals("2131231002")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio2_10);name.setText("Unit 2 Recording 10");
        }
        else if(kode.equals("2131231011")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_1);name.setText("Unit 3 Recording 1");
        }
        else if(kode.equals("2131231012"))
        {
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_2);name.setText("Unit 3 Recording 2");
        }
        else if(kode.equals("2131231013")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_3);name.setText("Unit 3 Recording 3");
        }
        else if(kode.equals("2131231014")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_4);name.setText("Unit 3 Recording 4");
        }
        else if(kode.equals("2131231015")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_5);name.setText("Unit 3 Recording 5");
        }
        else if(kode.equals("2131231016")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_6);name.setText("Unit 3 Recording 6");
        }
        else if(kode.equals("2131231017")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_7);name.setText("Unit 3 Recording 7");
        }
        else if(kode.equals("2131231018")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_8);name.setText("Unit 3 Recording 8");
        }
        else if(kode.equals("2131231019")){
            mediaPlayer = MediaPlayer.create(this,R.raw.aaudio3_9);name.setText("Unit 3 Recording 9");
        }
        else if(kode.equals("2131231020")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4_1);name.setText("Unit 4 Recording 1");
        }
        else if(kode.equals("2131231021")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4_2); name.setText("Unit 4 Recording 2");
        }
        else if(kode.equals("2131231022")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4_3); name.setText("Unit 4 Recording 3");
        }
        else if(kode.equals("2131231023")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4_4); name.setText("Unit 4 Recording 4");
        }
        else if(kode.equals("2131231024")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4_5); name.setText("Unit 4 Recording 5");
        }
        else if(kode.equals("2131231025")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio4_6); name.setText("Unit 4 Recording 6");
        }
        else if(kode.equals("2131231026")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_1); name.setText("Unit 5 Recording 1");
        }
        else if(kode.equals("2131231027")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_2); name.setText("Unit 5 Recording 2");
        }
        else if(kode.equals("2131231028")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_3); name.setText("Unit 5 Recording 3");
        }
        else if(kode.equals("2131231029")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_4); name.setText("Unit 5 Recording 4");
        }
        else if(kode.equals("2131231030")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_5); name.setText("Unit 5 Recording 5");
        }
        else if(kode.equals("2131231031")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_6); name.setText("Unit 5 Recording 6");
        }
        else if(kode.equals("2131231032")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_7); name.setText("Unit 5 Recording 7");
        }
        else if(kode.equals("2131231033")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_8); name.setText("Unit 5 Recording 8");
        }
        else if(kode.equals("2131231034")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio5_9); name.setText("Unit 5 Recording 9");
        }
        else if(kode.equals("2131231035")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_1); name.setText("Unit 6 Recording 1");
        }

        else if(kode.equals("2131231036")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_2); name.setText("Unit 6 Recording 2");
        }
        else if(kode.equals("2131231037")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_3); name.setText("Unit 6 Recording 3");
        }
        else if(kode.equals("2131231038")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_4); name.setText("Unit 6 Recording 4");
        }
        else if(kode.equals("2131231039")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_5); name.setText("Unit 6 Recording 5");
        }
        else if(kode.equals("2131231040")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_6); name.setText("Unit 6 Recording 6");
        }
        else if(kode.equals("2131231041")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio6_7); name.setText("Unit 6 Recording 7");
        }
        else if(kode.equals("2131231042")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7_1); name.setText("Unit 7 Recording 1");
        }

        else if(kode.equals("2131231043")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7_2); name.setText("Unit 7 Recording 2");
        }
        else if(kode.equals("2131231044")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7_3); name.setText("Unit 7 Recording 3");
        }
        else if(kode.equals("2131231045")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7_4); name.setText("Unit 7 Recording 4");
        }
        else if(kode.equals("2131231046")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7_5); name.setText("Unit 7 Recording 5");
        }
        else if(kode.equals("2131231047")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio7_6); name.setText("Unit 7 Recording 6");
        }
        else if(kode.equals("2131231048")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio8_1); name.setText("Unit 8 Recording 1");
        }

        else if(kode.equals("2131231049")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio8_2); name.setText("Unit 8 Recording 2");
        }
        else if(kode.equals("2131231050")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio8_3); name.setText("Unit 8 Recording 3");
        }
        else if(kode.equals("2131231051")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio8_4); name.setText("Unit 8 Recording 4");
        }
        else if(kode.equals("2131231052")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio8_5); name.setText("Unit 8 Recording 5");
        }
        else if(kode.equals("2131231053")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio8_6); name.setText("Unit 8 Recording 6");
        }
        else if(kode.equals("2131231054")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_1); name.setText("Unit 9 Recording 1");
        }
        else if(kode.equals("2131231055")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_2); name.setText("Unit 9 Recording 2");
        }
        else if(kode.equals("2131231056")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_3); name.setText("Unit 9 Recording 3");
        }
        else if(kode.equals("2131231057")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_4); name.setText("Unit 9 Recording 4");
        }
        else if(kode.equals("2131231058")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_5); name.setText("Unit 9 Recording 5");
        }
        else if(kode.equals("2131231059")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_6); name.setText("Unit 9 Recording 6");
        }
        else if(kode.equals("2131231060")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_7); name.setText("Unit 9 Recording 7");
        }
        else if(kode.equals("2131231061")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio9_8); name.setText("Unit 9 Recording 8");
        }
        else if(kode.equals("2131230978")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio10_1); name.setText("Unit 10 Recording 1");
        }
        else if(kode.equals("2131230979")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio10_2); name.setText("Unit 10 Recording 2");
        }
        else if(kode.equals("2131230980")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio10_3); name.setText("Unit 10 Recording 3");
        }
        else if(kode.equals("2131230981")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio10_4); name.setText("Unit 10 Recording 4");
        }
        else if(kode.equals("2131230982")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio10_5); name.setText("Unit 10 Recording 5");
        }
        else if(kode.equals("2131230984")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio11_1); name.setText("Unit 11 Recording 1");
        }
        else if(kode.equals("2131230985")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio11_2); name.setText("Unit 11 Recording 2");
        }
        else if(kode.equals("2131230986")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio11_3); name.setText("Unit 11 Recording 3");
        }
        else if(kode.equals("2131230987")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio11_4); name.setText("Unit 11 Recording 4");
        }
        else if(kode.equals("2131230988")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio11_5); name.setText("Unit 11 Recording 5");
        }
        else if(kode.equals("2131230989")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio11_6); name.setText("Unit 11 Recording 6");
        }
        else if(kode.equals("2131230991")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio12_1); name.setText("Unit 12 Recording 1");
        }
        else if(kode.equals("2131230992")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio12_2); name.setText("Unit 12 Recording 2");
        }
        else if(kode.equals("2131230993")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio12_3); name.setText("Unit 12 Recording 3");
        }
        else if(kode.equals("2131230994")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio12_4); name.setText("Unit 12 Recording 4");
        }
        else if(kode.equals("2131230995")){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio12_5); name.setText("Unit 12 Recording 5");
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
                mediaPlayer.pause();
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
            normalAlertDialog(exit_dinleme);

        }else {
            Toast.makeText(getApplicationContext(), "Cikmak icin geriye 2 defa dokunun", Toast.LENGTH_LONG).show();
            exit_say--;
        }
    }

}