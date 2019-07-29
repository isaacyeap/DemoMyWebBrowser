package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnURL;
    WebView wvMyWebPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wvMyWebPage = findViewById(R.id.webViewMyPage);
        wvMyWebPage.setWebViewClient(new WebViewClient());
        btnURL = findViewById(R.id.buttonLoadURL);

        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.grab.com/sg/";
                wvMyWebPage.loadUrl(url);
            }
        });

    }
}