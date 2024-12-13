package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvCatalog);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.image1); // Ganti dengan gambar Anda
        imageList.add(R.drawable.image2);
        imageList.add(R.drawable.image3);

        CatalogAdapter adapter = new CatalogAdapter(imageList);
        recyclerView.setAdapter(adapter);
    }
}
