package com.example.mujahid.gsondemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        deSerilizeSimpleUser();
        //serializeSimpleUser();
    }



    private void serializeSimpleUser(){
        /* //this are for simple serilize
        SimpleUser user = new SimpleUser("Mujahid","mkhan9047@gmail.com",21,true);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        Log.d("json",gson.toJson(user));
        */

        //this are for nested object serilize
     /*
        UserAddress userAddress = new UserAddress(
                "Khulna to Satkhira",
                "34LT5",
                "Khulna",
                "Bangladesh"
        );
        SimpleUser user = new SimpleUser(
                "Mujahid",
                "mkhan9047@gmail.com",
                21,
                true,
                 userAddress
                );


        Gson gson = new Gson();
       String json =  gson.toJson(user);
       Log.d("json",json);
*/

    }


    private void deSerilizeSimpleUser(){
        

          /* //this are for simple deserilize
        String usrjson = "{'name':'Mujahid', 'email':'mkhan9047@gmail.com', 'age': 21, 'isDeveloper':true}";
        Gson gson = new Gson();
        SimpleUser simpleUser = gson.fromJson(usrjson, SimpleUser.class);
*/

        //this are for nested deserilize

        /*
        String json = "{'address':{'city':'Khulna','country':'Bangladesh','houseNumber':'34LT5','street':'Khulna to Satkhira'},'age':21,'email':'mkhan9047@gmail.com','isDeveloper':true,'name':'Mujahid'}";
        Gson gson = new Gson();
        SimpleUser user = gson.fromJson(json,SimpleUser.class);
        //you can see the user objects property in dubgger mode eaisly
        Log.d("address",user.getAddress().getCity()+" "+user.getAddress().getCountry()+" "
        + user.getAddress().getHouseNumber()
        );
*/


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
