package com.cristobal.rockbands;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

//youtube video http://stackoverflow.com/questions/4654878/how-to-play-youtube-video-in-my-android-application
// change buttons http://stackoverflow.com/questions/5266810/how-do-i-change-the-style-of-a-button-in-android
public class Band_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_band_1);
		
        Button button_home = (Button) findViewById(R.id.home);
        button_home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Band_1.this, MainActivity.class));
			}
		});
		
	}

}
