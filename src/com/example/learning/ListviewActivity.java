package com.example.learning;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * With ListView need declare 3 component.
 * 
 * 1. ListView; 2. ArrayList; 3.ArrayAdapter
 *
 */
public class ListviewActivity extends Activity {

	/**
	 * dung de link den layout
	 */
	private ListView list;
	/**
	 * dung de luu du lieu can hien thi tren listview
	 */
	private ArrayList<String> array;
	/**
	 * bo chuyen doi du lieu de hien thi tren listview
	 */
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);

		playWithListView();
	}

	public void playWithListView() {

		loadData();

		adapter = new ArrayAdapter<String>(ListviewActivity.this,
				android.R.layout.simple_list_item_1, array);

		list = (ListView) findViewById(R.id.listView);
		list.setAdapter(adapter);

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String str = array.get(position).toString();
				ShowToastShort(getApplicationContext(), str);

				str = (String) parent.getItemAtPosition(position);
				Log.d("debug", str);
			}
		});
	}

	public void ShowToastShort(Context mContext, String Message) {
		Toast.makeText(mContext, Message, Toast.LENGTH_LONG).show();

	}

	private void loadData() {
		array = new ArrayList<String>();
		String p1 = "";
		for (int i = 0; i < 20; i++) {
			p1 = (i + 1) + " Ngoc Ha";
			array.add(p1);
		}
	}
}
