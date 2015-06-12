package jp.ac.chibafjb.app.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
	private static final String TAG = "LIFECYCLE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG, "onCreate()が呼ばれました。");
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.v(TAG, "onStart()が呼ばれました。");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.v(TAG, "onResume()が呼ばれました。");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.v(TAG, "onPause()が呼ばれました。");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.v(TAG, "onStop()が呼ばれました。");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.v(TAG, "onRestart()が呼ばれました。");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v(TAG, "onDestroy()が呼ばれました。");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public static class Fragment1 extends Fragment {
		private static final String TAG = "Fragment";

		@Override
		public void onAttach(Activity activity) {
			// TODO Auto-generated method stub
			super.onAttach(activity);
			Log.v(TAG, "onAttache()が呼ばれました。");
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			Log.v(TAG, "onCreate()が呼ばれました。");
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			Log.v(TAG, "onCreateView()が呼ばれました。");
			return inflater.inflate(R.layout.fragment1, container, false);
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onActivityCreated(savedInstanceState);
			Log.v(TAG, "onActivityCreated()が呼ばれました。");
		}

		@Override
		public void onStart() {
			// TODO Auto-generated method stub
			super.onStart();
			Log.v(TAG, "onStart()が呼ばれました。");
		}

		@Override
		public void onResume() {
			// TODO Auto-generated method stub
			super.onResume();
			Log.v(TAG, "onResume()が呼ばれました。");
		}

		@Override
		public void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			Log.v(TAG, "onPause()が呼ばれました。");
		}

		@Override
		public void onStop() {
			// TODO Auto-generated method stub
			super.onStop();
			Log.v(TAG, "onStop()が呼ばれました。");
		}

		@Override
		public void onDestroyView() {
			// TODO Auto-generated method stub
			super.onDestroyView();
			Log.v(TAG, "onDestroyView()が呼ばれました。");
		}

		@Override
		public void onDestroy() {
			// TODO Auto-generated method stub
			super.onDestroy();
			Log.v(TAG, "onDestroy()が呼ばれました。");
		}

		@Override
		public void onDetach() {
			// TODO Auto-generated method stub
			super.onDetach();
			Log.v(TAG, "onDetach()が呼ばれました。");
		}
	}

}
