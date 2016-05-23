package com.example.wim.android_butterknife;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.title) TextView txtTitle;
    @BindView(R.id.imageView) ImageView img;
    @BindView(R.id.button) Button btn;

    @BindDrawable(R.drawable.gambar) Drawable gambar;
    @BindString(R.string.title) String title;
    @BindColor(R.color.colorPrimary) int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        txtTitle.setText(title);
        img.setImageDrawable(gambar);
        btn.setBackgroundColor(color);
    }

    @OnClick(R.id.button)
    void buttonClick(){
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
    }
}
