package ctec.theotherscreenchanger;

import com.example.theotherscreenchanger.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity
{
	private Button secondButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		secondButton = (Button) findViewById(R.id.backButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		secondButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();
			}
		});
	}
}
