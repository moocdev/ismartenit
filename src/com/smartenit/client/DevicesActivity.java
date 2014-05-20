package com.smartenit.client;

import com.smartenit.client.adapter.AreaItemAdapter;
import com.smartenit.client.adapter.DeviceItemAdapter;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.os.Build;

public class DevicesActivity extends Activity {

	private ActionBar actionBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_devices);
		
		// Change activity title font
		Intent intent = getIntent();
	    Bundle extras = intent.getExtras();
	    String title = (String) extras.getSerializable("title");
	    
		SpannableString s = new SpannableString(title);
		s.setSpan(new TypefaceSpan(this, "Roboto-Thin.ttf"), 0, s.length(),
		        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		actionBar = getActionBar();
		actionBar.setTitle(s);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.devices, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Context context = this.getApplicationContext();
			Intent intent = new Intent(context, SettingsActivity.class);
			startActivity(intent);
			return true;
		}else if(id == android.R.id.home) {
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_devices,
					container, false);
			
			Context context = getActivity().getApplicationContext();
			DeviceItemAdapter adapter = new DeviceItemAdapter(context);
	        ListView listview = (ListView) rootView.findViewById(R.id.listview);
	        listview.setAdapter(adapter);
	        /*listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Context context = getApplicationContext();
					Intent intent = new Intent(context, DeviceDetailActivity.class);
					startActivity(intent);
				}
			});*/
	        
			return rootView;
		}
	}

}
