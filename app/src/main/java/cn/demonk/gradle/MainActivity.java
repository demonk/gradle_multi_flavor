package cn.demonk.gradle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        setContentView(R.layout.activity_main);

        TextView text = new TextView(this);
        text.setText(Test.getTest());
        setContentView(text);
    }
}
