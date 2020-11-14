package com.example.yohanda_biodata;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Profil extends Activity implements OnClickListener {
	Button profil1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profil);
		
		profil1 = (Button)findViewById(R.id.homep);
		profil1.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		finish();
		
	}

}
