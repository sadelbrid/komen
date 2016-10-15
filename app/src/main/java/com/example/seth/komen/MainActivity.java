package com.example.seth.komen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView messages = (TextView)findViewById(R.id.messagesIcon);
        TextView support = (TextView)findViewById(R.id.supportIcon);
        TextView settings = (TextView)findViewById(R.id.settingsIcon);

        messages.setTypeface(FontHelper.getTypeface(this, "fontawesome-webfont.ttf"));
        support.setTypeface(FontHelper.getTypeface(this, "fontawesome-webfont.ttf"));
        settings.setTypeface(FontHelper.getTypeface(this, "fontawesome-webfont.ttf"));


    }
}
