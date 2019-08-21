package in.anees.key;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // We can get these constant values inside code aswell.
    private final String facebookApiKey = BuildConfig.FacebookDebugApiKey;
    private final String twitterApiKey = BuildConfig.TwitterDebugApiKey;
    private final String fabricApiKey = BuildConfig.FabricDebugApiKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
