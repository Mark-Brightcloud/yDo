package com.tianyu.ydo;

import com.tianyu.ydo.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity);
		
		Button noAccount_main = (Button)findViewById(R.id.noAccount_main);
		noAccount_main.setOnClickListener(this);
		
		/* sign up button is clicked */
		Button singUp_main = (Button)findViewById(R.id.singUp_main);
		singUp_main.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent singUp_intent = new Intent(MainActivity.this, SignUp.class); 
				startActivity(singUp_intent);
			}
		});
		
		/* forgot password button is clicked */
		Button passReset_main = (Button)findViewById(R.id.passReset_main);
		passReset_main.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent passReset_intent = new Intent(MainActivity.this, PassReset.class); 
				startActivity(passReset_intent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; 
		// this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void autoLoginClicked(View v){
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
	
	public void passResetClicked(View v){
		Log.i("clicks", "\"Forgot password?\" is clicked");
	}

	/* Show alter to the user when "Start yDo without account" button 
	 * is licked */
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




/* Database connection from Pphp 
 
$mysql_host = "mysql5.000webhost.com";
$mysql_database = "a3531967_ydo";
$mysql_user = "a3531967_ydo";
$mysql_password = "mty+1990";

*/
