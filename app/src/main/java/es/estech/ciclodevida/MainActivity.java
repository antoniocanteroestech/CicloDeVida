package es.estech.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "CICLO DE VIDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");
    }

    @Override protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override protected void onPause() {
        super.onPause();
    }

    @Override protected void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }
}
