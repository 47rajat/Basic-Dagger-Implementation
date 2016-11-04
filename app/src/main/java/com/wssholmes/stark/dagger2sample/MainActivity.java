package com.wssholmes.stark.dagger2sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getComponent().inject(this);

        boolean injected = networkApi != null;

        TextView userAvailable = (TextView) findViewById(R.id.text_view);
        userAvailable.setText(getString(R.string.dependency_message) + String.valueOf(injected));

    }
}
