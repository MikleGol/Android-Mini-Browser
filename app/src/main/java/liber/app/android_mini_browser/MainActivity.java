package liber.app.android_mini_browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextUrl = findViewById(R.id.editTextUrl);

        final LinearLayout instagramBtn = findViewById(R.id.instagramBtn);
        final LinearLayout facebookBtn = findViewById(R.id.facebookBtn);
        final LinearLayout linkedinBtn = findViewById(R.id.linkedinBtn);
        final LinearLayout pinterestBtn = findViewById(R.id.pinterestBtn);
        final LinearLayout xBtn = findViewById(R.id.xBtn);
        final LinearLayout youtubeBtn = findViewById(R.id.youtubeBtn);

        editTextUrl.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                if(i == EditorInfo.IME_ACTION_SEARCH){
                    final String textUrl = editTextUrl.getText().toString();

                    if(!textUrl.isEmpty()){
                        editTextUrl.setText("");

                        Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                        intent.putExtra("url", textUrl);
                        startActivity(intent);
                    }
                }
                return false;
            }
        });

        instagramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra("url", "www.instagram.com");
                startActivity(intent);
            }
        });

        facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra("url", "www.facebook.com");
                startActivity(intent);
            }
        });

        linkedinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra("url", "www.linkedin.com");
                startActivity(intent);
            }
        });

        pinterestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra("url", "www.pinterest.com");
                startActivity(intent);
            }
        });

        xBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra("url", "www.x.com");
                startActivity(intent);
            }
        });

        youtubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra("url", "www.youtube.com");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
    }
}