package com.example.yohanda_biodata;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.content.DialogInterface;
import android.app.Dialog;
import android.provider.Settings.System;

public class MainActivity extends Activity implements OnClickListener {
Button profil, informasi, bantuan, keluar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
		profil = (Button)findViewById(R.id.profil);
		profil.setOnClickListener(this);
		
		informasi = (Button)findViewById(R.id.informasi);
		informasi.setOnClickListener(this);
		
		bantuan = (Button)findViewById(R.id.bantuan);
		bantuan.setOnClickListener(this);
		
		keluar = (Button)findViewById(R.id.keluar);
		keluar.setOnClickListener(this);
		
		
		profil.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent("com.example.activity_profil"));
			}
		});
		
		informasi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent("com.example.activity_informasi"));
			}
		});
		
		bantuan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent("com.example.activity_bantuan"));
			}
		});
		
		keluar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}
