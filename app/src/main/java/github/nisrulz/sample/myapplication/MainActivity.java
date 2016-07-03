package github.nisrulz.sample.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import github.nisrulz.awesomelibrary.AwesomeLibrary;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    AwesomeLibrary.getInstance().makeMeAwesome(this, "Nishant");
  }
}
