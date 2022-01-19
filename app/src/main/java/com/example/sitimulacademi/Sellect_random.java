package com.example.sitimulacademi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sellect_random extends AppCompatActivity {

    int exit_say = 1;

    Button All , greetings , useful , jobs , family , life, parts , clothers , colors , describing , health,
    home , fruit , communicat , culture , contrisite , crime , media , wealther , global ,moving,
    transport , talking , problems , wordsand , places , uniiversty  , time , adjective ,
            confused , prefixes  , irregulars , newen , listening  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellect_random);

         All = findViewById(R.id.All);greetings = (Button) findViewById(R.id.greetings);
         useful = (Button) findViewById(R.id.useful);jobs = (Button) findViewById(R.id.jobs);
        family = (Button) findViewById(R.id.family);life = (Button) findViewById(R.id.life);
         parts = (Button) findViewById(R.id.parts);clothers = (Button) findViewById(R.id.clothers);
         colors = (Button) findViewById(R.id.colors);describing = (Button) findViewById(R.id.describing);
         health = (Button) findViewById(R.id.health);fruit = (Button) findViewById(R.id.fruit);
         home = (Button) findViewById(R.id.home);communicat = (Button) findViewById(R.id.communicat);
         transport = (Button) findViewById(R.id.transport);contrisite = (Button) findViewById(R.id.contrisite);
         culture = (Button) findViewById(R.id.culture);crime = (Button) findViewById(R.id.crime);
         media = (Button) findViewById(R.id.media);problems = (Button) findViewById(R.id.problems);
         wealther = (Button) findViewById(R.id.wealtther);global = (Button) findViewById(R.id.global);
         talking = (Button) findViewById(R.id.talking);moving = (Button) findViewById(R.id.moving);
         time = (Button) findViewById(R.id.time);places = (Button) findViewById(R.id.places);
         adjective = (Button) findViewById(R.id.adjective);wordsand = (Button) findViewById(R.id.wordsand);
         prefixes = (Button) findViewById(R.id.prefixes);confused = (Button) findViewById(R.id.confused);
         uniiversty = (Button) findViewById(R.id.university);listening = (Button)findViewById(R.id.slistening);
         irregulars = findViewById(R.id.irregulars);newen = findViewById(R.id.newen);

        Intent intent = new Intent(Sellect_random.this, guiz.class);
        Intent lintent = new Intent(Sellect_random.this,listning.class);

        All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("All" , true);
                startActivity(intent);
            }
        });


        listening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(lintent);
            }
        });
        greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 57);
                intent.putExtra("min" , 1);
                startActivity(intent);
            }
        });
        useful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 77);
                intent.putExtra("min" , 55);
                startActivity(intent);
            }
        });
        jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 145);
                intent.putExtra("min" , 111);
                startActivity(intent);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 172);
                intent.putExtra("min" , 144);
                startActivity(intent);
            }
        });
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 209);
                intent.putExtra("min" , 171);
                startActivity(intent);
            }
        });
        parts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 262);
                intent.putExtra("min" , 208);
                startActivity(intent);
            }
        });
        clothers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 320);
                intent.putExtra("min" , 261);
                startActivity(intent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 343);
                intent.putExtra("min" , 319);
                startActivity(intent);
            }
        });
        describing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 394);
                intent.putExtra("min" , 342);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 423);
                intent.putExtra("min" , 393);
                startActivity(intent);
            }
        });
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 951);
                intent.putExtra("min" , 904);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1049);
                intent.putExtra("min" , 950);
                startActivity(intent);
            }
        });
        uniiversty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1089);
                intent.putExtra("min" , 1048);
                startActivity(intent);
                startActivity(intent);
            }
        });
        communicat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1117);
                intent.putExtra("min" , 1088);
                startActivity(intent);
            }
        });


        irregulars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 512);
                intent.putExtra("min" , 421);
                startActivity(intent);
            }
        });
        newen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 905);
                intent.putExtra("min" , 512);
                startActivity(intent);
            }
        });



        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1313);
                intent.putExtra("min" , 1238);
                startActivity(intent);
            }
        });
        contrisite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1331);
                intent.putExtra("min" , 1312);
                startActivity(intent);
            }
        });
        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1363);
                intent.putExtra("min" , 1330);
                startActivity(intent);
            }
        });
        crime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1399);
                intent.putExtra("min" , 1362);
                startActivity(intent);
            }
        });
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1418);
                intent.putExtra("min" , 1398);
                startActivity(intent);
            }
        });
        problems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1434);
                intent.putExtra("min" , 1417);
                startActivity(intent);
            }
        });
        wealther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1239);
                intent.putExtra("min" , 1209);
                startActivity(intent);
            }
        });
        global.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1463);
                intent.putExtra("min" , 1433);
                startActivity(intent);
            }
        });
        talking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1474);
                intent.putExtra("min" , 1462);
                startActivity(intent);
            }
        });
        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1488);
                intent.putExtra("min" , 1473);
                startActivity(intent);
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1535);
                intent.putExtra("min" , 1487);
                startActivity(intent);
            }
        });

      /*  places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });*/
        adjective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1554);
                intent.putExtra("min" , 1534);
                startActivity(intent);
            }
        });
        wordsand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1577);
                intent.putExtra("min" , 1553);
                startActivity(intent);
            }
        });
        prefixes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" ,1599 );
                intent.putExtra("min" , 1576);
                startActivity(intent);
            }
        });
        confused.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("max" , 1612);
                intent.putExtra("min" , 1588);
                startActivity(intent);
            }
        });


    }

    public  void normalAlertDialog(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Stimull Academy");
        alert.setMessage("Are you sure you want to exit the app?");
        alert.setCancelable(false);
        alert.setIcon(R.drawable.rejected);
        alert.setPositiveButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                exit_say = 1;
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

    private  void cikis_yap(){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    @Override
    public void onBackPressed() {

        if(exit_say==0){
            normalAlertDialog(home);

        }else {
            Toast.makeText(getApplicationContext(), "Cikmak icin geriye 2 defa dokunun", Toast.LENGTH_LONG).show();
            exit_say--;
        }
    }
}