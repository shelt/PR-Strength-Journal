package ca.samshelton.prsj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity
{
	ImageButton startButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		addButtonListener();
	}
	public void addButtonListener()
	{
		startButton = (ImageButton) findViewById(R.id.startButton);
		
	}
	public void onClickButton(View view)
	{
		Intent menu = new Intent(getApplicationContext(), MainMenu.class);
		startActivity(menu);
	}
}
