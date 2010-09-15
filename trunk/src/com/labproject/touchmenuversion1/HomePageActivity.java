package com.labproject.touchmenuversion1;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

//public class HomePageActivity  extends MenuActivity implements OnClickListener{

 
 /*
protected void onCreate(Bundle savedValues)
{
 //   super.onCreate(savedInstanceState);
 //   setContentView(R.layout.category);
   //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
    //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
   // NavigateToCategory.setOnClickListener(  new View.OnClickListener() 
    ImageButton button =(ImageButton)findViewById(R.id.ordericon);
    button.setOnClickListener( this);
}
    public void onClick(View b) {
    // navigate to category page//consider using the clickhandler with switch
    	setContentView(R.layout.login);
    };
    
    
} 
*/
	
	public class HomePageActivity extends MenuActivity {
	    /** Called when the activity is first created. */
		
	    @Override
	    public void onCreate(Bundle rod)
	    {
	        super.onCreate(rod);
	     setContentView(R.layout.category);
	       //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
	        ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
	        NavigateToCategory.setOnClickListener(  new View.OnClickListener() 
	        
	        {
	        public void onClick(View v) {
	        // navigate to category page//consider using the clickhandler with switch
	        	setContentView(R.layout.category);
	        }
	        }
	        
	        );
	    }
	}