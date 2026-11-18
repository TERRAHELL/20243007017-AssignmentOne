
package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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
        btnFacilities.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Facilities clicked",
                        Toast.LENGTH_SHORT).show()
        );

        // Events click event
        btnEvents.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Events clicked",
                        Toast.LENGTH_SHORT).show()
        );

        // Clubs click event
        btnClubs.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Clubs clicked",
                        Toast.LENGTH_SHORT).show()
        );

        // Support click event
        btnSupport.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Support clicked",
                        Toast.LENGTH_SHORT).show()
        );
    }
}
