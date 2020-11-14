package com.example.intent_krido;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	Button kotak_dialog, input_biodata, keluar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		kotak_dialog = (Button)findViewById(R.id.BtnDialog);
        input_biodata = (Button)findViewById(R.id.BtnBiodata);
        
        
        
        kotak_dialog.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				setContentView(R.layout.kotak_dialog);
				Intent i=new Intent(getApplicationContext(),KotakDialog.class);
				startActivity(i);			
			}
		});
        
        input_biodata.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				setContentView(R.layout.isi_biodata);
				Intent i=new Intent(getApplicationContext(),IsiBiodata.class);
				startActivity(i);			
			}
		});
        
        keluar = (Button)findViewById(R.id.BtnKeluar);
		keluar.setOnClickListener(this);
        
	}
	
	public void onClick(View clicked) {
		// TODO Auto-generated method stub
		switch (clicked.getId()){
		case R.id.BtnKeluar:
			keluar();
			break;
		}
	}
	
	private void keluar() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Apakah anda ingin keluar?")
			.setCancelable(false)
			.setPositiveButton("Ya", new
					DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int id) {
							// TODO Auto-generated method stub
							MainActivity.this.finish();
						}
					})
			.setNegativeButton("Tidak", new
					DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int arg) {
							// TODO Auto-generated method stub
							dialog.cancel();
						}
					}).show();
	}


}
