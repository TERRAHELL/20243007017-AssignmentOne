package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private static final String EXTRA_TOPIC_ID = "topic_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 1. Get the topic ID from MainActivity
        // 从 MainActivity 获取传递过来的主题编号
        int topicId = getIntent().getIntExtra(EXTRA_TOPIC_ID, 0);

        // 2. Retrieve the three arrays from arrays.xml
        // 从 arrays.xml 中读取三个字符串数组
        String[] titles = getResources().getStringArray(
                R.array.string_array_titles);

        String[] contents = getResources().getStringArray(
                R.array.string_array_content);

        String[] images = getResources().getStringArray(
                R.array.string_array_images);

        // 3. Define the category names
        // 定义四个主题的分类名称
        String[] categories = {
                "Facilities",
                "Events",
                "Clubs",
                "Support"
        };

        // 4. Get the corresponding image resource ID
        // 根据图片名称动态获取 drawable 资源 ID
        int imageResourceId = getResources().getIdentifier(
                images[topicId].trim(),
                "drawable",
                getPackageName()
        );

        // 5. Connect Java variables with XML views
        // 将 Java 变量与 XML 控件关联
        ImageView detailIcon = findViewById(R.id.detailIcon);

        TextView detailCategory = findViewById(R.id.detailCategory);

        TextView detailTitle = findViewById(R.id.detailTitle);

        TextView detailContent = findViewById(R.id.detailContent);

        // 6. Update the UI using the selected array elements
        // 根据主题编号更新界面
        detailIcon.setImageResource(imageResourceId);

        detailCategory.setText(categories[topicId]);

        detailTitle.setText(titles[topicId]);

        detailContent.setText(contents[topicId]);
    }
}
