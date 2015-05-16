package com.rwsshin.richard.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String>mForecastAdapter = null;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<String>alFakeData = new ArrayList<String>();

        String stringFakeDataEntry = "";

        stringFakeDataEntry = "Today - Sunny - 88/63";
        alFakeData.add(stringFakeDataEntry);

        stringFakeDataEntry = "Tomorrow - Foggy - 70/46";
        alFakeData.add(stringFakeDataEntry);

        stringFakeDataEntry = "Weds - Cloudy - 72/63";
        alFakeData.add(stringFakeDataEntry);

        stringFakeDataEntry = "Thurs - Rainy - 64/51";
        alFakeData.add(stringFakeDataEntry);

        stringFakeDataEntry = "Fri - Foggy - 70/46";
        alFakeData.add(stringFakeDataEntry);

        stringFakeDataEntry = "Sat - Sunny - 76/68";
        alFakeData.add(stringFakeDataEntry);

        stringFakeDataEntry = "Sun - Sunny - 80/68";
        alFakeData.add(stringFakeDataEntry);

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                alFakeData

        );

        View myFragmentView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView lvForecast = (ListView)myFragmentView.findViewById(R.id.list_view_forecast);
        lvForecast.setAdapter(mForecastAdapter);

        return myFragmentView;
    }
}
