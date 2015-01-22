/**
 * 
 */
package com.example.customEvent;

import com.example.learning.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * @author ngocha
 *
 */
public class CustomButtonEvent implements OnClickListener {

	private TextView textView;

	public CustomButtonEvent(TextView textView) {
		this.textView = textView;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.start_button: {

			textView.setText("Button start clicked ");
			textView.setTextSize(24);
			break;
		}
		case R.id.stop_button: {
			textView.setText("Button stop clicked ");
			textView.setTextSize(30);
		}
		default:
			break;
		}

	}

}
