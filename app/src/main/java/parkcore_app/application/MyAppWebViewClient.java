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
            System.out.println("Fkoff");
            return false;
        }
        System.out.println("dont fkoff");
        /*Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        System.out.println("Dont fk off");
        */
        return true;
    }
}

