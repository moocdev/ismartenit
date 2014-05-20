package com.smartenit.client;

import com.smartenit.client.adapter.AreaItemAdapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
 
public class AreasFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	Context context = getActivity().getApplicationContext();
        View rootView = inflater.inflate(R.layout.fragment_areas, container, false);
        
        AreaItemAdapter adapter = new AreaItemAdapter(context);
        GridView gridview = (GridView) rootView.findViewById(R.id.gridview);
        gridview.setAdapter(adapter);
        
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Context context = getActivity().getApplicationContext();
				Intent intent = new Intent(context, DevicesActivity.class);
				AreaItemAdapter.ViewHolder holder = (AreaItemAdapter.ViewHolder)view.getTag();
				intent.putExtra("title", holder.txt.getText());
				startActivity(intent);
			}
		});
                 
        return rootView;
    }
}
