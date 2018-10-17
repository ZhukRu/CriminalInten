package by.bsuir.zhuk.ruslan.criminalinten.conroller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import by.bsuir.zhuk.ruslan.criminalinten.R;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();

        Fragment mFragment = fm.findFragmentById(R.id.fragment_container);

        if(mFragment == null) {
            mFragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, mFragment)
                    .commit();
        }
    }
}
