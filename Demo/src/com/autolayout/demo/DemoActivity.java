package com.autolayout.demo;

import com.zjl.autolayout.AutoUtils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * 
 * @author ZhengJingle
 *
 */
public class DemoActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		
		AutoUtils.setSize(this, false, 720, 1280);//û��״̬��,��Ƴߴ�Ŀ��
		
		
		setContentView(R.layout.demo);
		findViewById(R.id.button1).setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				DemoActivity.this.startActivity(new Intent(DemoActivity.this,MainActivity.class));
			}
			
		});
		
		findViewById(R.id.button2).setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				DemoActivity.this.startActivity(new Intent(DemoActivity.this,ListViewActivity.class));
			}
			
		});
	}

}
