package com.example.yohanda_biodata;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Informasi extends Activity implements OnClickListener {
	Button informasi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_informasi);
		
		informasi = (Button)findViewById(R.id.homei);
		informasi.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		finish();
		
	}

}