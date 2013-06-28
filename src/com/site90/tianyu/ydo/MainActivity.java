package com.site90.tianyu.ydo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button noAccount_button = (Button)findViewById(R.id.noAccount_button);
		noAccount_button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; 
		// this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void autoLoginChecked(View v){
		Log.i("clicks", "\"Auto login?\" is clicked");
	}
	
	public void loginClicked(View v){
		Log.i("clicks", "\"Start yDo\" is clicked");
	}
	
	public void signUpClicked(View v){
		Log.i("clicks", "\"Create yDo account\" is clicked");
	}
	
	public void noAccountClicked(View v){
		Log.i("clicks", "\"Start yDo without account\" is clicked");
	}
	
	public void forgotPasswordClicked(View v){
		Log.i("clicks", "\"Forgot password?\" is clicked");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Attention!");
		builder.setMessage("This option will store all the data " +
				"locally on your phone.");
		builder.setPositiveButton("OK", null);
		AlertDialog dialog = builder.show();
	}
}
