package com.example.mujahid.gsondemo;

import android.os.Bundle;
import android.support.constraint.solver.Goal;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // deSerilizeSimpleUser();
        serializeSimpleUser();
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


     //resturant data serilize
        UserAddress ad = new UserAddress("K to S","456HB","Khulna","BD");
        Resturant.ResturantOwner resturantOwner = new Resturant.ResturantOwner("Mujahid",ad);
        Resturant.ResturantStaff cook = new Resturant.ResturantStaff(12,"SOhel",1400);
        Resturant.ResturantStaff waiter = new Resturant.ResturantStaff(18,"Sumon",1800);
        List<Resturant.ResturantMenuItem> items = new ArrayList<>();
        items.add(new Resturant.ResturantMenuItem("Berini",12f,true));
        items.add(new Resturant.ResturantMenuItem("Chap",14f,true));
        items.add(new Resturant.ResturantMenuItem("Kabab",18f,true));
        items.add(new Resturant.ResturantMenuItem("Tandur",2f,true));
        items.add(new Resturant.ResturantMenuItem("Borhani",2f,false));
        Resturant resturant = new Resturant("Mujahid",resturantOwner,cook,waiter,items);

        Gson a = new Gson();
        String json = a.toJson(resturant);
        Log.d("josn",json);

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

        //restaurant json data deserilize

        String jsonData = "\n" +
                "{'name':'Dynamic Ins', 'owner':{'name':'Mujahid khan', 'address':{'city':'khulna','country':'Bangladesh','houseNumber':'4325HB','street':'Khulna to Satkhira'}},'cook':{'age':12,'name':'sohel','salary':1500},'waiter':{'age':19,'name':'sumon','salary':1000}}";
        Gson gson = new Gson();

        Resturant resturant = gson.fromJson(jsonData, Resturant.class);




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
