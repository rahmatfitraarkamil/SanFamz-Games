package com.example.sanfamzgames15.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanfamzgames15.R;
//import com.example.sanfamzgames15.adapters.RecyclerViewAdapter;
import com.example.sanfamzgames15.adapters.RecycleViewAdapter;
//import com.example.sanfamzgames15.model.Game;
import com.example.sanfamzgames15.rest.RestClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

   private ProgressDialog progressDialog;




    @BindView(R.id.rvListGame)
    RecyclerView rvListGame;

    private List<ItemResults> listItem;
    public RecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RestClient.getService().getList().enqueue(new Callback<GameListModel>() {
            @Override
            public void onResponse(Call<GameListModel> call, Response<GameListModel> response) {
                if (response.isSuccessful()){
                    listItem = response.body().getResults();

                    adapter = new RecycleViewAdapter(listItem, MainActivity.this);
                    rvListGame.setLayoutManager(new LinearLayoutManager(getApplicationContext()));;
                    rvListGame.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<GameListModel> call, Throwable t) {

            }
        });

        FloatingActionButton floatingActionButton = findViewById(R.id.main_info_fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SanFamz Games provides a list of the most popular games in the world!", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0 , 0);
                toast.show();
            }
        });

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading games. This may take a minute...");
        progressDialog.show();

}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_platform:

                Intent intent = new Intent(this,PlatformsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}



