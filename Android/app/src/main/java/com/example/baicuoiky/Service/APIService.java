package com.example.baicuoiky.Service;

public class APIService {
private static String base_url = "http://192.168.75.239/Server/";

public static Dataservice getService(){
    return APIRetrofitClient.getCliet(base_url).create(Dataservice.class);
}
}
