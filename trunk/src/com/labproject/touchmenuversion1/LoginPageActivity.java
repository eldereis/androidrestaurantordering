

package com.labproject.touchmenuversion1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPageActivity extends MenuActivity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
       //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
        Button NavigateToCategory = (Button) findViewById(R.id.buttonSignIn);
        NavigateToCategory.setOnClickListener(  new View.OnClickListener() 
        
        {
        public void onClick(View v) {
        // navigate to category page//consider using the clickhandler with switch
        	setContentView(R.layout.home);
        }
        }
        
        );
           
        
        
        
        
        
    }
    
    
        
    
}