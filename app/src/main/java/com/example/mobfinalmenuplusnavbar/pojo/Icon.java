package com.example.mobfinalmenuplusnavbar.pojo;

import com.example.mobfinalmenuplusnavbar.R;

import java.util.ArrayList;

public class Icon {
    private String name;
    private int id;

    public Icon(String name, int id){
        this.setName(name);
        this.setId(id);
    }

    public static ArrayList<Icon> getIcons(){
        ArrayList<Icon> icons = new ArrayList();
        icons.add(new Icon("sport_icon", R.drawable.ic_sport));
        icons.add(new Icon("travel_icon", R.drawable.ic_travel));
        icons.add(new Icon("edu_icon", R.drawable.ic_education));
        icons.add(new Icon("food_icon", R.drawable.ic_food));
        icons.add(new Icon("entertainment_icon", R.drawable.ic_entertainment));

        return icons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
