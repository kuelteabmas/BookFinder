package com.devapp.dev_05.bookfinder.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.devapp.dev_05.bookfinder.R;

public class MainActivity extends AppCompatActivity {

    // BaSE URL for parsing
    //     private static final String BASE_URL_STRING = "https://www.googleapis.com/books/v1/volumes";



    // Declare variables
    LinearLayout linearLayout1, linearLayout2;
    Button searchButton;
    Animation topToBottom, bottomToTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeScreenAnimation();

        // Display search results when search button is clicked
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Open Booklisting Activity
                booklistingActivity();
            }

        });

    }

    /**
     * Welcome Screen Animation
     */
    private void welcomeScreenAnimation() {
        searchButton = findViewById(R.id.search_button);
        linearLayout1 = findViewById(R.id.linearLayout1);
        linearLayout2 = findViewById(R.id.linearLayout2);

        // Top to Bottom Animation
        topToBottom = AnimationUtils.loadAnimation(this,R.anim.top_to_bottom);
        linearLayout1.setAnimation(topToBottom);

        // Bottom to Top Animation
        bottomToTop = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
        linearLayout2.setAnimation(bottomToTop);
    }

    /**
     * Intent Class for opening the Booklisting Activity
     */
    public void booklistingActivity() {
        Intent intent = new Intent(this, BooklistingActivity.class);
        startActivity(intent);

    }
}
