package nl.androiddev.androiddev;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    View rootView;
    public MainFragment() {


        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button btn = (Button)rootView.findViewById(R.id.srcButton);
        btn.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v){
        String url = "https://github.com/rpander/AndroidDev";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

}