package com.example.learning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Text_TextViewActivity extends Activity {

	private Button btShowText;
	private EditText etInput;
	private TextView tvShow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_text_view);

		playWithTextEdit();
	}

	public void playWithTextEdit() {
		btShowText = (Button) findViewById(R.id.btShowText);
		etInput = (EditText) findViewById(R.id.editTextInput);
		tvShow = (TextView) findViewById(R.id.tvShowText);

		btShowText.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String strET = etInput.getText().toString();

				if ((strET.equals("")) || (strET == null)) {

					String strToast = getResources().getString(
							R.string.MustEnterString);

					Toast.makeText(Text_TextViewActivity.this, strToast,
							Toast.LENGTH_LONG).show();
				} else {
					tvShow.setText(strET);
				}
			}
		});
	}
}
