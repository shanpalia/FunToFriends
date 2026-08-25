package in.callbomberz.safe;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private static final String HOME_URL = "https://www.callbomberz.in/";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);
        webView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();

                if (url.startsWith("https://www.callbomberz.in/") ||
                    url.startsWith("https://callbomberz.in/")) {

                    String lower = url.toLowerCase();

                    if (lower.contains("call-bomber") ||
                        lower.contains("callbomber") ||
                        lower.contains("sms-bomber") ||
                        lower.contains("smsbomber") ||
                        lower.contains("unlimited-sms")) {
                        return true;
                    }

                    view.loadUrl(url);
                }

                return true;
            }
        });

        setContentView(webView);
        webView.loadUrl(HOME_URL);
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        if (webView != null) {
            webView.destroy();
            webView = null;
        }
        super.onDestroy();
    }
}
