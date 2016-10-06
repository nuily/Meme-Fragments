package nyc.c4q.huilin.a10_05_fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by huilin on 10/5/16.
 */

public class ChooserFragment extends Fragment {

    private Button aznDadButton, findNemoButton, buzzLyButton, dwightButton;

    public static String TAG = "ChooseMemes";

    public ChooserFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chooser, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        aznDadButton = (Button) view.findViewById(R.id.asiandad);
        findNemoButton = (Button) view.findViewById(R.id.yunofishie);
        buzzLyButton = (Button) view.findViewById(R.id.buzzlightyear);
        dwightButton = (Button) view.findViewById(R.id.dwight);

        aznDadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_container, new AsianDad())/*.addToBackStack(null)*/.commit();
            }
        });

        buzzLyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_container, new BuzzLightyear())/*.addToBackStack(null)*/.commit();

            }
        });

        findNemoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_container, new FindingNemo())/*.addToBackStack(null)*/.commit();

            }
        });

        dwightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_container, new DwightSchrute())/*.addToBackStack(null)*/.commit();
            }
        });
    }
}
