package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String url = "http://www.vogella.com";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i); 
		
		/*try {
			abc();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ImageView imageView=(ImageView)findViewById(R.id.imageView1);
		GetImageFromURLOrBinaryData binaryData=new GetImageFromURLOrBinaryData();
		try {
			Bitmap bitmap=binaryData.getImageFromURL("http://www.ypblogs.com/images/star-icon-25x25.png","http");
			System.out.println("----------bitmap-------/"+bitmap);
			imageView.setImageBitmap(bitmap);
		} catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	private void abc() throws Exception{
		throw new Exception("sdsd");
	}

}
