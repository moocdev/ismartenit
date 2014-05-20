package com.smartenit.client.adapter;

import com.smartenit.client.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DeviceItemAdapter extends BaseAdapter {

	private Context mContext;  
	
	// Gets the context so it can be used later  
	public DeviceItemAdapter(Context c) {  
		mContext = c; 
	}
		
	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		ViewHolder holder;

	    if (view == null) {
	    	LayoutInflater vi = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    	view = vi.inflate(R.layout.item_device, null);

	        holder = new ViewHolder();
	        holder.txt = (TextView) view.findViewById(R.id.text);

	        view.setTag(holder);
	    } else {
	        holder = (ViewHolder)view.getTag();
	    }
	    
        return view;
	}
	
	private static class ViewHolder {
	    public TextView txt;
	}

}
