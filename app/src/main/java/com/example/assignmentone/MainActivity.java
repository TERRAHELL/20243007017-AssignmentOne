
package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Unique identifier for DetailActivity
    public static final String EXTRA_TOPIC_ID = "topic_id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the activity layout
        setContentView(R.layout.activity_main);

        // Find the four buttons
        ImageButton btnFacilities = findViewById(R.id.btnFacilities);
        ImageButton btnEvents = findViewById(R.id.btnEvents);
        ImageButton btnClubs = findViewById(R.id.btnClubs);
        ImageButton btnSupport = findViewById(R.id.btnSupport);

        // Facilities click event
        btnFacilities.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(EXTRA_TOPIC_ID, 0);
            startActivity(intent);
        });

        // Events click event
        btnEvents.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(EXTRA_TOPIC_ID, 1);
            startActivity(intent);
        });

        // Clubs click event
        btnClubs.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(EXTRA_TOPIC_ID, 2);
            startActivity(intent);
        });

        // Support click event
        btnSupport.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(EXTRA_TOPIC_ID, 3);
            startActivity(intent);
        });
    }
}
