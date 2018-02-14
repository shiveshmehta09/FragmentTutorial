package mehta.shivesh.com.fragmenttutorial.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import mehta.shivesh.com.fragmenttutorial.R;
import mehta.shivesh.com.fragmenttutorial.data.ImageAssests;

/**
 * Created by Babu on 15-02-2018.
 */

public class MasterListFragment extends Fragment {

    public MasterListFragment() {
    }

    // Inflates the GridView of all AndroidMe images
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // Get a reference to the GridView in the fragment_master_list xml layout file
        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        // Create the adapter
        // This adapter takes in the context and an ArrayList of ALL the image resources to display
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), ImageAssests.getAll());

        // Set the adapter on the GridView
        gridView.setAdapter(mAdapter);

        // Return the root view
        return rootView;
    }
}
