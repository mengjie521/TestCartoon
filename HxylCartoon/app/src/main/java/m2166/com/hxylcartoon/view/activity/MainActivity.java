package m2166.com.hxylcartoon.view.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import m2166.com.hxylcartoon.R;
import m2166.com.hxylcartoon.view.fragment.MainListFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fl_list)
    FrameLayout flList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MainListFragment mainListFragment = new MainListFragment();
        fragmentTransaction.add(R.id.fl_list, mainListFragment);
        fragmentTransaction.commit();
    }

}
