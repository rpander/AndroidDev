package nl.androiddev.androiddev;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebViewFragment extends Fragment implements View.OnClickListener {

    View rootView;
    public WebViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.web_view_fragment, container, false);

        WebView myWebView = (WebView) v.findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.androiddev.nl/layouts/");

        Button btn = (Button)rootView.findViewById(R.id.srcButton);
        btn.setOnClickListener(this);

        return v;

    }

    @Override
    public void onClick(View v) {
        String url = "https://github.com/rpander/AndroidDev";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
