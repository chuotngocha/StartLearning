package com.example.learning;

import com.example.customEvent.CustomButtonEvent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button buttonStart;
	Button buttonStop;
	TextView textView;
	CustomButtonEvent event;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = (TextView) findViewById(R.id.textView1);

		playWithButton();
	}

	public void playWithButton() {

		event = new CustomButtonEvent(textView);

		buttonStart = (Button) findViewById(R.id.start_button);
		buttonStart.setOnClickListener(event);

		buttonStop = (Button) findViewById(R.id.stop_button);
		buttonStop.setOnClickListener(event);
	}

	// android:onClick="doSmall"
	public void doSmall(View v) {
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText("Button clicked ");
		textView.setTextSize(24);
	}

	// android:onClick="doLarge"
	public void doLarge(View v) {
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText("Button clicked ");
		textView.setTextSize(30);
	}
}
