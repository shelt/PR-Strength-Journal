package ca.samshelton.prsj;

import android.app.Activity;
import android.os.Bundle;

public class RecordPR extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recordpr);
		
		Bundle extras = getIntent().getExtras();
		String exercise = extras.getString("exercise");
	}
}
