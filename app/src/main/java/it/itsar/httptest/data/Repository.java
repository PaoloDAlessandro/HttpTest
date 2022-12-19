package it.itsar.httptest.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;

import it.itsar.httptest.controller.AppController;

public class Repository {
    String urlPost = "https://jsonplaceholder.typicode.com/posts";

    public void getPosts() {
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, urlPost, null, response -> {
            Log.d("risposta", response.toString());
        },
        error -> {
            Log.d("errore", error.toString());
        });

        AppController.getInstance().addRequestQueue(request);
    }
}
