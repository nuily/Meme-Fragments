package nyc.c4q.huilin.a10_05_fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by huilin on 10/5/16.
 */

public class FindingNemo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentmeme, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState); // but i didn't use this before & it still works so..???
        ImageView imageView = (ImageView) view.findViewById(R.id.meme_img_view);
        TextView textView = (TextView) view.findViewById(R.id.meme_caption);

        imageView.setImageResource(R.drawable.younofishie);
        textView.setText(R.string.meme2);
    }
}
