package ca.samshelton.prsj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/*
 * This activity is started with 
 */

public class SelectExercise extends Activity
{
	ImageButton benchPress;
	ImageButton squat;
	ImageButton deadlift;
	ImageButton row;
	ImageButton militaryPress;
	ImageButton clean;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selectexercise);
		
		addButtonListener();
	}
	
	public void onResume() //Reseting any clicked buttons
	{
		super.onResume();
		benchPress.setImageResource(R.drawable.ex_benchpress);
		squat.setImageResource(R.drawable.ex_squat);
		deadlift.setImageResource(R.drawable.ex_deadlift);
		row.setImageResource(R.drawable.ex_row);
		militaryPress.setImageResource(R.drawable.ex_militarypress);
		clean.setImageResource(R.drawable.ex_clean);
	}
	
	public void addButtonListener()
	{
		benchPress    = (ImageButton) findViewById(R.id.BenchPress);
		squat         = (ImageButton) findViewById(R.id.Squat);
		deadlift      = (ImageButton) findViewById(R.id.Deadlift);
		row           = (ImageButton) findViewById(R.id.Row);
		militaryPress = (ImageButton) findViewById(R.id.MilitaryPress);
		clean         = (ImageButton) findViewById(R.id.Clean);
	}
	
	public void changeImage(View view, String name)
	{
		int resId = getResources().getIdentifier(name, "drawable", getPackageName());
		((ImageView) view).setImageResource(resId);//TODO pass recordPR object to make work for GP-functions
	}
	
	public void onClickOption(View view) throws ClassNotFoundException
	{
		String exercise = (String) view.getTag();
		String lower = exercise.toLowerCase();
		changeImage(view, "ex_"+lower+"_p"); //Eh, I'll fix this crime in the morning.
		
		Bundle extras = getIntent().getExtras();
		String selection = extras.getString("selection_class");
		Intent menu = new Intent(getApplicationContext(), (Class<?>) Class.forName(selection));
		

		(menu).putExtra("exercise", exercise);        //sends the exercise to activity
		startActivity(menu);
	}
}
