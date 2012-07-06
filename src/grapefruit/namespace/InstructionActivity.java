package grapefruit.namespace;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class InstructionActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructions);
	}
	
	public void back(View view) {
		finish();
	}
}
