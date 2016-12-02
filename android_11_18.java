package com.example.a403.android_11_18;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.view.View;
import android.widget.Button;import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {    
int p1, p2, p3, num1,num2,num3;    double hap, dc;    TextView textView;  
EditText editText;    TextView textView2;    EditText editText2;  
TextView textView3;    EditText editText3;    CheckBox checkBox;    
RadioGroup RG;    RadioButton radioButton;    RadioButton radioButton2; 
Button button3;    TextView textView5;    ImageView imageView4;   
@Override  
protected void onCreate(Bundle savedInstanceState) {    
super.onCreate(savedInstanceState);      
setContentView(R.layout.activity_main3);     
start();    }   
void start(){  
checkBox = (CheckBox) findViewById(R.id.checkBox);  
textView = (TextView) findViewById(R.id.textView);  
editText = (EditText) findViewById(R.id.editText);   
textView2 = (TextView) findViewById(R.id.textView2); 
editText2 = (EditText) findViewById(R.id.editText2);       
textView3 = (TextView) findViewById(R.id.textView3);      
editText3 = (EditText) findViewById(R.id.editText3);   
RG = (RadioGroup) findViewById(R.id.RG);       
radioButton = (RadioButton) findViewById(R.id.radioButton);
radioButton2 = (RadioButton) findViewById(R.id.radioButton2);   
textView5 = (TextView) findViewById(R.id.textView5);   
button3 = (Button) findViewById(R.id.button3);} 
public void OnClick(View v)
{       
num1 = Integer.parseInt(editText.getText().toString());  
num2 = Integer.parseInt(editText2.getText().toString());       
num3 = Integer.parseInt(editText3.getText().toString());    
hap = p1+p2+p3;     
p1 =num1 * 16000;       
p2 =num2 * 11000;      
p3 = num3 * 4000;       
dc = hap - (hap / 7);           
checkBox.setOnCheckedChangeListener        
(new CompoundButton.OnCheckedChangeListener() {      
public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {      
hap = (p1+p2+p3) - dc;                        }                    })   ;     
RG.setOnCheckedChangeListener               
(new RadioGroup.OnCheckedChangeListener() {               
@Override                            
public void onCheckedChanged(RadioGroup group, int checkedId) {    
{                              
if (radioButton.isChecked()) {       
imageView4.setImageResource(R.drawable.dog);              
} else if (radioButton2.isChecked()) {            
imageView4.setImageResource(R.drawable.cat);         
}                                    }                                }});         
switch(v.getId()){                   
case R.id.button3 :            
break;                     
}                   
textView5.setText("주문 개수는 : "+dc+"이고"+"가격은"+hap);       
}   
};








