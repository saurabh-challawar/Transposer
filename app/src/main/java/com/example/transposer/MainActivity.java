package com.example.transposer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    final String[] keys=new String[] {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};

    CheckBox cCheck,dCheck,eCheck,fCheck,gCheck,aCheck,bCheck,csCheck,dsCheck,fsCheck,gsCheck,asCheck;
    TextView cText,dText,eText,fText,gText,aText,bText,csText,dsText,fsText,gsText,asText,transpose;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cCheck=(CheckBox)findViewById(R.id.c);
        csCheck=(CheckBox)findViewById(R.id.cs);
        dCheck=(CheckBox)findViewById(R.id.d);
        dsCheck=(CheckBox)findViewById(R.id.ds);
        eCheck=(CheckBox)findViewById(R.id.e);
        fCheck=(CheckBox)findViewById(R.id.f);
        fsCheck=(CheckBox)findViewById(R.id.fs);
        gCheck=(CheckBox)findViewById(R.id.g);
        gsCheck=(CheckBox)findViewById(R.id.gs);
        aCheck=(CheckBox)findViewById(R.id.a);
        asCheck=(CheckBox)findViewById(R.id.as);
        bCheck=(CheckBox)findViewById(R.id.b);

        cText=(TextView)findViewById(R.id.cView);
        csText=(TextView)findViewById(R.id.csView);
        dText=(TextView)findViewById(R.id.dView);
        dsText=(TextView)findViewById(R.id.dsView);
        eText=(TextView)findViewById(R.id.eView);
        fText=(TextView)findViewById(R.id.fView);
        fsText=(TextView)findViewById(R.id.fsView);
        gText=(TextView)findViewById(R.id.gView);
        gsText=(TextView)findViewById(R.id.gsView);
        aText=(TextView)findViewById(R.id.aView);
        asText=(TextView)findViewById(R.id.asView);
        bText=(TextView)findViewById(R.id.bView);
        transpose=(TextView)findViewById(R.id.transposeBy);


        seekBar=(SeekBar)findViewById(R.id.seekBar);



        cCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(cCheck.isChecked())
                {
                    String k=transpose(0,progressValue-7,keys);
                    cText.setText(k);
                }
                if(cCheck.isChecked()==false)
                {
                    cText.setText("");
                }
            }
        });

        csCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(csCheck.isChecked())
                {
                    String k=transpose(1,progressValue-7,keys);
                    csText.setText(k);
                }
                if(csCheck.isChecked()==false)
                {
                    csText.setText("");
                }
            }
        });

        dCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(dCheck.isChecked())
                {
                    String k=transpose(2,progressValue-7,keys);
                    dText.setText(k);
                }
                if(dCheck.isChecked()==false)
                {
                    dText.setText("");
                }
            }
        });

        dsCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(dsCheck.isChecked())
                {
                    String k=transpose(3,progressValue-7,keys);
                    dsText.setText(k);
                }
                if(dsCheck.isChecked()==false)
                {
                    dsText.setText("");
                }
            }
        });

        eCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(eCheck.isChecked())
                {
                    String k=transpose(4,progressValue-7,keys);
                    eText.setText(k);
                }
                if(eCheck.isChecked()==false)
                {
                    eText.setText("");
                }
            }
        });

        fCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(fCheck.isChecked())
                {
                    String k=transpose(5,progressValue-7,keys);
                    fText.setText(k);
                }
                if(fCheck.isChecked()==false)
                {
                    fText.setText("");
                }
            }
        });

        fsCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(fsCheck.isChecked())
                {
                    String k=transpose(6,progressValue-7,keys);
                    fsText.setText(k);
                }
                if(fsCheck.isChecked()==false)
                {
                    fsText.setText("");
                }
            }
        });

        gCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(gCheck.isChecked())
                {
                    String k=transpose(7,progressValue-7,keys);
                    gText.setText(k);
                }
                if(gCheck.isChecked()==false)
                {
                    gText.setText("");
                }
            }
        });

        gsCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(gsCheck.isChecked())
                {
                    String k=transpose(8,progressValue-7,keys);
                    gsText.setText(k);
                }
                if(gsCheck.isChecked()==false)
                {
                    gsText.setText("");
                }
            }
        });

        aCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(aCheck.isChecked())
                {
                    String k=transpose(9,progressValue-7,keys);
                    aText.setText(k);
                }
                if(aCheck.isChecked()==false)
                {
                    aText.setText("");
                }
            }
        });

        asCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(asCheck.isChecked())
                {
                    String k=transpose(10,progressValue-7,keys);
                    asText.setText(k);
                }
                if(asCheck.isChecked()==false)
                {
                    asText.setText("");
                }
            }
        });

        bCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progressValue=seekBar.getProgress();

                if(bCheck.isChecked())
                {
                    String k=transpose(11,progressValue-7,keys);
                    bText.setText(k);
                }
                if(bCheck.isChecked()==false)
                {
                    bText.setText("");
                }
            }
        });




        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int progressValue=progress-7;

                if(cCheck.isChecked())
                {
                    String k=transpose(0,progress-7,keys);
                    cText.setText(k);
                }
                if(csCheck.isChecked())
                {
                    String k=transpose(1,progress-7,keys);
                    csText.setText(k);
                }
                if(dCheck.isChecked())
                {
                    String k=transpose(2,progress-7,keys);
                    dText.setText(k);
                }
                if(dsCheck.isChecked())
                {
                    String k=transpose(3,progress-7,keys);
                    dsText.setText(k);
                }
                if(eCheck.isChecked())
                {
                    String k=transpose(4,progress-7,keys);
                    eText.setText(k);
                }
                if(fCheck.isChecked())
                {
                    String k=transpose(5,progress-7,keys);
                    fText.setText(k);
                }
                if(fsCheck.isChecked())
                {
                    String k=transpose(6,progress-7,keys);
                    fsText.setText(k);
                }
                if(gCheck.isChecked())
                {
                    String k=transpose(7,progress-7,keys);
                    gText.setText(k);
                }
                if(gsCheck.isChecked())
                {
                    String k=transpose(8,progress-7,keys);
                    gsText.setText(k);
                }
                if(aCheck.isChecked())
                {
                    String k=transpose(9,progress-7,keys);
                    aText.setText(k);
                }
                if(asCheck.isChecked())
                {
                    String k=transpose(10,progress-7,keys);
                    asText.setText(k);
                }
                if(bCheck.isChecked())
                {
                    String k=transpose(11,progress-7,keys);
                    bText.setText(k);
                }
                transpose.setText("Transpose: "+progressValue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private static String transpose(int keyValue,int transposeBy,String[] keys)
    {
        int summand,i,count=0;
        if(transposeBy>=0)
        {
            summand=transposeBy;
        }
        else
        {
            summand=transposeBy+12;
        }
        for(i=keyValue;count!=summand;i++)
        {
            if(i==11)
            {
                i=-1;
            }
            count+=1;
        }
        return(keys[i]);

    }
}