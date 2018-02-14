package mehta.shivesh.com.fragmenttutorial;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mehta.shivesh.com.fragmenttutorial.data.ImageAssests;

public class AndroidMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_main);


        if (savedInstanceState == null) {
            BodyPartFragment headFragment = new BodyPartFragment();

            headFragment.setmImageIds(ImageAssests.getHeads());
            headFragment.setmListIndex(1);

            // Add the fragment to its container using a FragmentManager and a Transaction
            FragmentManager fragmentManager = getSupportFragmentManager();

            fragmentManager.beginTransaction()
                    .add(R.id.head_container, headFragment)
                    .commit();

            // Create and display the body and leg BodyPartFragments

            BodyPartFragment bodyFragment = new BodyPartFragment();
            bodyFragment.setmImageIds(ImageAssests.getBodies());
            fragmentManager.beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();

            BodyPartFragment legFragment = new BodyPartFragment();
            legFragment.setmImageIds(ImageAssests.getLegs());
            fragmentManager.beginTransaction()
                    .add(R.id.leg_container, legFragment)
                    .commit();

        }
    }
}
