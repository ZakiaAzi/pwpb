package com.example.yohanda_biodata;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.Menu;

public class Bantuan extends Activity implements OnClickListener {
	Button bantuan1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bantuan);
		
		bantuan1 = (Button)findViewById(R.id.homeb);
		bantuan1.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		finish();
		
	}

}
