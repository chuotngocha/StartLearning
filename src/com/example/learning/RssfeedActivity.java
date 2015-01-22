package com.example.learning;

import android.app.ActionBar;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class RssfeedActivity extends Activity {

	private MenuItem menuItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rssfeed);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME
				| ActionBar.DISPLAY_SHOW_TITLE | ActionBar.DISPLAY_SHOW_CUSTOM);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_load: {
			menuItem = item;
			menuItem.setActionView(R.layout.progressbar);
			menuItem.expandActionView();
			TestTask task = new TestTask();
			task.execute("test");
			break;
		}
		case R.id.menu_settings: {
			Toast.makeText(getApplicationContext(), "Action Setting selected",
					Toast.LENGTH_SHORT).show();
			break;
		}

		default:
			break;
		}
		return true;
	}

	private class TestTask extends AsyncTask<String, Void, String> {

		private int count = 0;

		@Override
		protected String doInBackground(String... params) {

			Log.d("debug", "count : " + count++);

			// Simulate something long running

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			menuItem.collapseActionView();
			Log.d("debug", "Ok");
			menuItem.setActionView(null);
		}
	};
}
