package com.oliveira.stenio.bancostenio;

/**
 * Created by Stenio on 08/11/2016.
 */

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.Toast;

public class ListUsersActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list_users);

        BD bd = new BD(this);

        List<Usuario> list = bd.buscar();
        setListAdapter(new UsuarioAdapter(this, list));
    }
}
