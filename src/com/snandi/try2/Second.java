package com.snandi.try2;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;

public class Second extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	@Override
	public void onBackPressed()
	{
		super.onBackPressed();
		finishAfterTransition();
	}
}