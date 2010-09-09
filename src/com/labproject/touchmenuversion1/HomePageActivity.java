package com.labproject.touchmenuversion1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends MenuActivity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button NavigateToCategory = (Button) findViewById(R.id.OrderButton);
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