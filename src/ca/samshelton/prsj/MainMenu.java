package ca.samshelton.prsj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainMenu extends Activity
{
	ImageButton recordPR;
	ImageButton viewProgress;
	ImageButton setGoal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		TextView txt = (TextView) findViewById(R.id.bebas_text);
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/bebas.ttf");
		txt.setTypeface(font);
		
		addButtonListener();
	}
	
	@Override
	public void onResume() //Reseting any clicked buttons
	{
		super.onResume();
		recordPR.setImageResource(R.drawable.ic_recordpr);
		viewProgress.setImageResource(R.drawable.ic_viewprogress);
		setGoal.setImageResource(R.drawable.ic_setgoal);
	}

	
	public void addButtonListener()
	{
		recordPR = (ImageButton) findViewById(R.id.RecordPR);
		viewProgress = (ImageButton) findViewById(R.id.ViewProgress);
		setGoal = (ImageButton) findViewById(R.id.SetGoal);
	}
	
	public void changeImage(String name)
	{
		int resId = getResources().getIdentifier(name, "drawable", getPackageName());
		recordPR.setImageResource(resId);//TODO pass recordPR object to make work for GP-functions
	}
	
	
	
	
	public void onClickPR(View v)
	{
		changeImage("ic_recordpr"+"_p"); //Button change on tap
		
		Intent selector = new Intent(getApplicationContext(), SelectExercise.class);
		selector.putExtra("selection_class", "ca.samshelton.prsj.RecordPR");
		
		startActivity(selector);//TODO do the rest of these methods
	}
	
	public void onClickViewProgress(View v)
	{
		Intent menu = new Intent(getApplicationContext(), MainActivity.class);//ViewProgress
		startActivity(menu);
	}
	
	public void onClickSetGoal(View v)
	{
		Intent menu = new Intent(getApplicationContext(), MainActivity.class);//SetGoal
		startActivity(menu);
	}
}
