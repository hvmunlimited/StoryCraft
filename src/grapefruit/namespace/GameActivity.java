package grapefruit.namespace;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class GameActivity extends Activity {
	private TextView turnText;
	private TextView prevLine;
	private EditText currentLine;
	int turnsTaken = 0;
	String[] story;
	int numTurns;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		numTurns = getIntent().getIntExtra("numTurns", 10);
		story = new String[numTurns];
		turnText = (TextView) findViewById(R.id.turnsText);
		turnText.setText((numTurns - turnsTaken) + " lines remaining");
		prevLine = (TextView) findViewById(R.id.prevLine);
		prevLine.setText("You are the first writer, brave soul");
		currentLine = (EditText) findViewById(R.id.currentLine);
		
	}
	
	public void writeLine(View view) {
		story[turnsTaken] = currentLine.getText().toString();
		prevLine.setText(story[turnsTaken]);
		turnsTaken++;
		turnText.setText((numTurns - turnsTaken) + " lines remaining");
		currentLine.setText("");
	}
	
}
