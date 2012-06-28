package grapefruit.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.SeekBar;

public class GrapefruitActivity extends Activity {
	private EditText seekBarVal;
	private SeekBar seekBar;
	int numTurns = 10;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        seekBarVal = (EditText) findViewById(R.id.seekBarVal);
        seekBar = (SeekBar) findViewById(R.id.seekBar1);
        
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				seekBarVal.setText(String.valueOf(progress));
				numTurns = progress;
			}
		});
        
        seekBarVal.setOnFocusChangeListener(new OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if (!hasFocus) {
					int value = Integer.parseInt(seekBarVal.getText().toString());
					seekBar.setProgress(value);
					numTurns = value;
				}	
			}
        });
        
    }
    
    public void playGame(View view) {
    	Intent i = new Intent(GrapefruitActivity.this, GameActivity.class);
    	i.putExtra("numTurns", numTurns);
    	startActivity(i);
    }
    
}