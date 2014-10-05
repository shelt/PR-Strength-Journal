package ca.samshelton.prsj;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecordPR extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recordpr);
		
		TextView txt = (TextView) findViewById(R.id.bebas_text);
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/bebas.ttf");
		txt.setTypeface(font);
		txt.setText("TODO");//TODO [Priority]
		
		Bundle extras = getIntent().getExtras();
		String exercise = extras.getString("exercise");
		
		//ImageView oval = new ImageView(getBaseContext());
		//oval.setImageResource(R.drawable.oval);
	}
}
