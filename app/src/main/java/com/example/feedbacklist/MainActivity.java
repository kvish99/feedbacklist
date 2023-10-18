package com.example.feedbacklist;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.feedbacklist.Adapter.MyCustomAdapter;
import com.example.feedbacklist.Model.Milkshakes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Milkshakes> milkshakesArrayList;

     MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listview);


        milkshakesArrayList = new ArrayList<>();

        Milkshakes milkshake1 = new Milkshakes("Chocolate Milkshake",   "Price:110/-",  "Ingredients:Chocochips,    Chocolate icecream,Cold milk", R.drawable.chocolate1);
        Milkshakes milkshake2 = new Milkshakes("Butterscotch Milkshake","Price:110/-",  "Ingredients:Butterscotch  icecream,Cold milk", R.drawable.butterscotch);
        Milkshakes milkshake3 = new Milkshakes("Strawberry Milkshake",  "Price:110/-",  "Ingredients:Strawberrys,  icecream,cold milk", R.drawable.strawberry);
        Milkshakes milkshake4 = new Milkshakes("Banana Milkshake",      "Price:110/-",  "Ingredients:  Banana,     icecream,cold milk", R.drawable.banana);
        Milkshakes milkshake5 = new Milkshakes("Mango Milkshake",       "Price:110/-",  "Ingredients:  Mango,      icecream,cold milk", R.drawable.mango);
        Milkshakes milkshake6 = new Milkshakes("Vanilla Milkshake",     "Price:110/-",   "Ingredients:  Vanilla syrup,    Icecream,Cold milk", R.drawable.vanilla1);
        milkshakesArrayList.add(milkshake1);
        milkshakesArrayList.add(milkshake2);
        milkshakesArrayList.add(milkshake3);
        milkshakesArrayList.add(milkshake4);
        milkshakesArrayList.add(milkshake5);
        milkshakesArrayList.add(milkshake6);

        adapter = new MyCustomAdapter(getApplicationContext(), milkshakesArrayList);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "" + adapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}