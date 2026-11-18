package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the detail activity layout
        setContentView(R.layout.activity_detail);

        // 1. Get the topic ID from MainActivity
        int topicId = getIntent().getIntExtra(
                MainActivity.EXTRA_TOPIC_ID, 0);

        // 2. Retrieve the three string arrays
        String[] titles = getResources().getStringArray(
                R.array.string_array_titles);

        String[] contents = getResources().getStringArray(
                R.array.string_array_content);

        String[] images = getResources().getStringArray(
                R.array.string_array_images);

        // 3. Define the category names
        String[] categories = {
                "Facilities",
                "Events",
                "Clubs",
                "Support"
        };

        // 4. Dynamically retrieve the drawable resource ID
        int imageResourceId = getResources().getIdentifier(
                images[topicId].trim(),
                "drawable",
                getPackageName()
        );

        // 5. Connect Java variables with XML views
        ImageView detailIcon = findViewById(R.id.detailIcon);

        TextView detailCategory = findViewById(R.id.detailCategory);

        TextView detailTitle = findViewById(R.id.detailTitle);

        TextView detailContent = findViewById(R.id.detailContent);

        // 6. Update the UI using the selected array elements
        detailIcon.setImageResource(imageResourceId);

        detailCategory.setText(categories[topicId]);

        detailTitle.setText(titles[topicId]);

        detailContent.setText(contents[topicId]);
    }
}
