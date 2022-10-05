package com.example.btcrelease.Interfaces;

import com.example.btcrelease.Frames.ModelNews;

import java.util.ArrayList;

public interface FirebaseNewsCallback {
    void onDBCallback(ArrayList<ModelNews> val);
}
