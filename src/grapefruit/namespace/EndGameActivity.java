package grapefruit.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class EndGameActivity extends Activity {
	String completeStory;
	private TextView storyView;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.end);
		
		String[] story = getIntent().getStringArrayExtra("story");
		
		for (int i = 0; i < story.length; i++) {
			completeStory = completeStory + "\n" + story[i];
		}
		
		storyView = (TextView) findViewById(R.id.story);
		storyView.setText(completeStory);		
		
	}
	
	public void restart(View view) {
		startActivity(new Intent(EndGameActivity.this, GrapefruitActivity.class));
	}

}
