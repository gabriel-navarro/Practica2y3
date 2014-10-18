package com.example.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Practica3 extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.correo);
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
	
	public void enviar(View v) {
		EditText etEmail = (EditText) findViewById(R.id.email);
		EditText etSubject = (EditText) findViewById(R.id.subject);
		EditText etBody = (EditText) findViewById(R.id.message);
		
		Intent itSend = new Intent(android.content.Intent.ACTION_SEND);
		itSend.setType("plain/text");
		
		itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ etEmail.getText().toString()});
		itSend.putExtra(android.content.Intent.EXTRA_SUBJECT, etSubject.getText().toString());
		itSend.putExtra(android.content.Intent.EXTRA_TEXT, etBody.getText());
		startActivity(itSend); 
    }	
}
