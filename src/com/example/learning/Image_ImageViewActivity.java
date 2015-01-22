package com.example.learning;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Image_ImageViewActivity extends Activity {

	private ImageView imDemo;
	private ImageButton ibtChangeImage;
	private int countOnclickButton = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image__image_view);

		playWithImageAndImageView();
	}

	public void playWithImageAndImageView() {

		imDemo = (ImageView) findViewById(R.id.imDemo);

		imDemo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ShowToastShort(Image_ImageViewActivity.this,
						"Ban Click vao ImageView");
			}
		});

		ibtChangeImage = (ImageButton) findViewById(R.id.ibtChangeImage);

		ibtChangeImage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				countOnclickButton++;
				switch (countOnclickButton % 6) {
				case 0:
					imDemo.setImageResource(R.drawable.vietnam);
					break;
				case 1:
					imDemo.setImageResource(R.drawable.canada);
					break;
				case 2:
					imDemo.setImageResource(R.drawable.gb);
					break;
				case 3:
					imDemo.setImageResource(R.drawable.south_korea);
					break;
				case 4:
					imDemo.setImageResource(R.drawable.sweden);
					break;
				case 5:
					imDemo.setImageResource(R.drawable.usa);
					break;
				default:
					break;
				}

			}
		});

	}

	public static void ShowToastShort(Context mContext, String Message) {
		Toast.makeText(mContext, Message, Toast.LENGTH_SHORT).show();

	}
}
