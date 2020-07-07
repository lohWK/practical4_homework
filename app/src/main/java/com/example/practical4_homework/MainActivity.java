package com.example.practical4_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String toppings = "toppings";

    boolean Syrup = false;
    boolean Sprinkles = false;
    boolean Nuts = false;
    boolean Cherries = false;
    boolean OrioCookie = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cbChocoSyrup:
                if (checked)
                    Syrup = true;
                else
                    Syrup = false;
                break;
            case R.id.cbSprinkles:
                if (checked)
                    Sprinkles = true;
                else
                    Sprinkles = false;
                break;
            case R.id.cbNut:
                if (checked)
                    Nuts = true;
                else
                    Nuts = false;
                break;
            case R.id.cbCherries:
                if (checked)
                    Cherries = true;
                else
                    Cherries = false;
                break;
            case R.id.cbCookie:
                if (checked)
                    OrioCookie = true;
                else
                    OrioCookie = false;
                break;
        }
    }
    public void showToast (String toppings){
        String none = "";

        if (Syrup) {
            toppings = toppings + " Chocolate syrup";
        }
        if (Sprinkles) {
            toppings = toppings + " Sprinkles";
        }
        if (Nuts) {
            toppings = toppings + " Crushed nuts";
        }
        if (Cherries) {
            toppings = toppings + " Cherries";
        }
        if (OrioCookie) {
            toppings = toppings + " Orio cookie crumbles";
        }

        Toast toast = Toast.makeText(getApplicationContext(), toppings + " " + none, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showMsg (View view){
        showToast(toppings);
    }
}