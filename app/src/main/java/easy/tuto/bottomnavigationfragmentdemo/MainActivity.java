package easy.tuto.bottomnavigationfragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    BerechnungFragment berechnungFragment = new BerechnungFragment();
    Verlaufragment verlaufragment = new Verlaufragment();
    HandbuchFragment handbuchFragment = new HandbuchFragment();
    ErgebnisFragment ergebnisFragment = new ErgebnisFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView  = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, berechnungFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.berechnung:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, berechnungFragment).commit();
                        return true;
                    case R.id.ergebnis:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, ergebnisFragment).commit();
                        return true;
                    case R.id.handbuch:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, handbuchFragment).commit();
                        return true;
                    case R.id.verlauf:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, verlaufragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}