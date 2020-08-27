package com.UAD.magic_id;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

import android.support.v7.app.AppCompatActivity;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		
	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
		 final EditText etID;
		Button btnSubmit;
		final TextView tvResult;
		etID = findViewById(R.id.etId);	
		btnSubmit = findViewById(R.id.btnSubmit);
		
		tvResult = findViewById(R.id.tvResult);
		tvResult.setVisibility(View.GONE);
		btnSubmit.setOnClickListener(new View.OnClickListener(){
				
			@Override
			public void onClick(View view)
			{
		
				String idnumber = etID.getText().toString().trim();
		String dob = idnumber.substring(0,6);
		int gender = Integer.parseInt(Character.toString(idnumber.charAt(6)  )  );
		
String sgender;
if(gender<5)
{
	sgender= "female";
}else{
	sgender="male";
}
				int nationality =Integer.parseInt(Character.toString(idnumber.charAt(10)  )  );
			String snationality;
				if(nationality==0)
					snationality= "citizen";
					else
					snationality="P.R";	
				String text = "date of birth: " +dob + "\n" +
					"Gender: " + sgender + "\n"+
					"Nationality: " + snationality ;
					tvResult.setText(text);
					tvResult.setVisibility(view.VISIBLE);
					}
		});
		
		
		}
}
