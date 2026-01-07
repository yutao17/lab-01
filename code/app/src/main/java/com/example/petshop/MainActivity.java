package com.example.petshop;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");

        Scorpion scorpion = new Scorpion("Scorponok");
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);
        //pettablePets.add(scorpion);     //this should produce an error

        Mood mood1 = new Happy();
        Mood mood2 = new Sad(new Date());

        //Logcat
        Log.d("PetShop", "m1 mood=" + mood1.getMoodString() + ", date=" + mood1.getDate());
        Log.d("PetShop", "m2 mood=" + mood2.getMoodString() + ", date=" + mood2.getDate());


    }
}