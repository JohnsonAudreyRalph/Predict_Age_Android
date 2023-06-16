package com.example.predict_age;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int selectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        final LinearLayout homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout cameraLayout = findViewById(R.id.cameraLayout);
        final LinearLayout imageLayout = findViewById(R.id.imageLayout);
        final LinearLayout infoLayout = findViewById(R.id.infoLayout);

        final ImageView homeImage = findViewById(R.id.homeImage);
        final ImageView cameraImage = findViewById(R.id.cameraImage);
        final ImageView imageImage = findViewById(R.id.imageImage);
        final ImageView infoImage = findViewById(R.id.infoImage);

        final TextView homeText = findViewById(R.id.homeText);
        final TextView cameraText = findViewById(R.id.cameraText);
        final TextView imageText = findViewById(R.id.imageText);
        final TextView infoText = findViewById(R.id.infoText);

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container, HomeFragment.class, null)
                .commit();

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab != 1) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container, HomeFragment.class, null)
                            .commit();
//                    Intent intent = new Intent(MainActivity.this, Home_Activity.class);
//                    startActivity(intent);
                    cameraText.setVisibility(View.GONE);
                    imageText.setVisibility(View.GONE);
                    infoText.setVisibility(View.GONE);

                    cameraImage.setImageResource(R.drawable.icon_camera);
                    imageImage.setImageResource(R.drawable.icon_image);
                    infoImage.setImageResource(R.drawable.icon_info);

                    cameraLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    imageLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    infoLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    homeText.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.icon_select_home);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);
                    selectedTab = 1;
                }
            }
        });

        cameraLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab != 2) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container, CameraFragment.class, null)
                            .commit();
                    homeText.setVisibility(View.GONE);
                    imageText.setVisibility(View.GONE);
                    infoText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.icon_home);
                    imageImage.setImageResource(R.drawable.icon_image);
                    infoImage.setImageResource(R.drawable.icon_info);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    imageLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    infoLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    cameraText.setVisibility(View.VISIBLE);
                    cameraImage.setImageResource(R.drawable.icon_select_camera);
                    cameraLayout.setBackgroundResource(R.drawable.round_back_camera_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    cameraLayout.startAnimation(scaleAnimation);
                    selectedTab = 2;
                }
            }
        });

        imageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab != 3) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container, ImageFragment.class, null)
                            .commit();
                    homeText.setVisibility(View.GONE);
                    cameraText.setVisibility(View.GONE);
                    infoText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.icon_home);
                    cameraImage.setImageResource(R.drawable.icon_camera);
                    infoImage.setImageResource(R.drawable.icon_info);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    cameraLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    infoLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    imageText.setVisibility(View.VISIBLE);
                    imageImage.setImageResource(R.drawable.icon_select_image);
                    imageLayout.setBackgroundResource(R.drawable.round_back_image_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    imageLayout.startAnimation(scaleAnimation);
                    selectedTab = 3;
                }
            }
        });

        infoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab != 4) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container, InfoFragment.class, null)
                            .commit();
                    homeText.setVisibility(View.GONE);
                    cameraText.setVisibility(View.GONE);
                    imageText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.icon_home);
                    cameraImage.setImageResource(R.drawable.icon_camera);
                    imageImage.setImageResource(R.drawable.icon_image);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    cameraLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    imageLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    infoText.setVisibility(View.VISIBLE);
                    infoImage.setImageResource(R.drawable.icon_select_info);
                    infoLayout.setBackgroundResource(R.drawable.round_back_info_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    infoLayout.startAnimation(scaleAnimation);
                    selectedTab = 4;
                }
            }
        });
    }
}
