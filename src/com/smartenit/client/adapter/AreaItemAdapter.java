package com.smartenit.client.adapter;

import com.smartenit.client.R;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AreaItemAdapter extends BaseAdapter {

	private Context mContext;  
	
	private String[] mareaNames = {
			"Default Area",
			"Room",
			"Backyard",
			"Bathroom",
			"Bedroom",
			"Bedroom",
			"Bedroom",
			"Den",
			"Dining Room",
			"Driveway",
			"Fireplace",
			"Foyer",
			"Garage",
			"Hall",
			"Kitchen",
			"Kitchen",
			"Kitchen",
			"Lawn",
			"Lawn",
			"Lawn",
			"Living Room",
			"Living Room",
			"Office",
			"Office",
			"Office",
			"Outdoor",
			"Pool",
			"Pool",
			"Recroom"
	};

	private Integer[] mimageIds = {
			R.drawable.areas_default,
			R.drawable.areas_avroom,
			R.drawable.areas_backyard,
			R.drawable.areas_bathroom,
			R.drawable.areas_bedroom2,
			R.drawable.areas_bedroom4,
			R.drawable.areas_bedroom_boy,
			R.drawable.areas_bedroom,
			R.drawable.areas_den,
			R.drawable.areas_diningroom2,
			R.drawable.areas_driveway,
			R.drawable.areas_fireplace_room_sm,
			R.drawable.areas_foyer,
			R.drawable.areas_garage,
			R.drawable.areas_hall,
			R.drawable.areas_kitchen2,
			R.drawable.areas_kitchen3,
			R.drawable.areas_kitchen,
			R.drawable.areas_lawn2,
			R.drawable.areas_lawn3,
			R.drawable.areas_lawn,
			R.drawable.areas_livingroom2,
			R.drawable.areas_livingroom,
			R.drawable.areas_office2,
			R.drawable.areas_office3,
			R.drawable.areas_office,
			R.drawable.areas_outdoor,
			R.drawable.areas_pool2,
			R.drawable.areas_pool,
			R.drawable.areas_recroom
	};
	  
	// Gets the context so it can be used later  
	public AreaItemAdapter(Context c) {  
		mContext = c; 
		//getAreasImgIDs();
	}
	  
	@Override
	public int getCount() {
		return 6;
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
	public View getView(int position, View grid, ViewGroup parent){
		ViewHolder holder;

	    if (grid == null) {
	    	LayoutInflater vi = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        	grid = vi.inflate(R.layout.item_area, null);

	        holder = new ViewHolder();
	        holder.img = (ImageView) grid.findViewById(R.id.myImageView);
	        holder.txt = (TextView) grid.findViewById(R.id.text);
	        
	        /*holder.img.setOnTouchListener(new View.OnTouchListener() {
				
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					ImageView img = (ImageView) v;
					switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
						img.setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
						break;
					case MotionEvent.ACTION_CANCEL:
					case MotionEvent.ACTION_UP:
						img.setColorFilter(null);
						break;
					default:
						break;
					}
					return true;
				}
			});*/

	        grid.setTag(holder);
	    } else {
	        holder = (ViewHolder)grid.getTag();
	    }
	    
        if(mimageIds.length>position){
        	holder.img.setImageResource(mimageIds[position]);
        }
        if(mareaNames.length>position){
        	holder.txt.setText(mareaNames[position]);
        }
        return grid;
     }
	
	public static class ViewHolder {
	    public ImageView img;
	    public TextView txt;
	}
}
