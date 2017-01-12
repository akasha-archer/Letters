package nyc.c4q.akashaarcher.majorkeys;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            KeyFragment homeFragment = new KeyFragment();
            FragmentTransaction mainFragTransaction = getSupportFragmentManager().beginTransaction();
            mainFragTransaction.add(R.id.main_container, homeFragment);
            mainFragTransaction.commit();

        }
    }
}
