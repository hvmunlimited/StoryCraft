package grapefruit.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SavedGamesActivity extends Activity {
	String[] story;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saved_games);
	}
	
	public void viewStory(View view) {
		Intent i = new Intent(SavedGamesActivity.this, ViewStoryActivity.class);
		i.putExtra("story", story);
		startActivity(i);
		finish();
	}

}
