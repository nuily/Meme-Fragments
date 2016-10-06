package nyc.c4q.huilin.a10_05_fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hostFragment(new ChooserFragment());

       /* getFragmentManager().beginTransaction()
                .add(R.id.main_container, new ChooserFragment(), "Chooser Fragment")
                .commit();
*/
    }

    @Override
    public void onBackPressed() {
        hostFragment(new ChooserFragment());
    }

    public void hostFragment(Fragment fragment) {
        getFragmentManager().beginTransaction()
                .replace(R.id.main_container, fragment).commit();
    }
}
