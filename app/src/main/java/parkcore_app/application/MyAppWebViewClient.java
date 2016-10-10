package parkcore_app.application;

/**
 * Created by Akshay on 10/9/16.
 */

import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.indexOf(".") > -1){
            return false;
        }
        return true;
    }
}

