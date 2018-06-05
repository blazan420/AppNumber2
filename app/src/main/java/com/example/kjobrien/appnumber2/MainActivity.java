package com.example.kjobrien.appnumber2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Creating my objects 123

        TextView txt1 = (TextView)findViewById(R.id.txt1);
        TextView txt2 = (TextView)findViewById(R.id.txt2);
        TextView txt3 = (TextView)findViewById(R.id.txt3);

       /* txt1.setText("My Own Text");

        String str1 = "some Value";

        StringTokenizer strObject1 = new StringTokenizer(str1);

        txt2.setText(strObject1.nextToken());
        txt1.setText(strObject1.nextToken());*/

       String str2 = "This is another text@this is your text@this is my text";



       // Constructors creates a new instance of a class.
       StringTokenizer strObject2 = new StringTokenizer(str2, "@"); //

        txt1.setText(strObject2.nextToken());

        txt2.setText(strObject2.nextToken());

        txt3.setText(strObject2.nextToken() + " -Fine-" );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
