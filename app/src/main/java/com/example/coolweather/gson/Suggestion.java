package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/19.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public Carwash carwash;

    public Sport sport;

    public class Comfort{
        @SerializedName("text")
        public String info;
    }
    public class Carwash{
        @SerializedName("text")
        public String info;
    }
    public class Sport{
        @SerializedName("text")
        public String info;
    }
}
