package com.autolayout.demo;

import com.zjl.autolayout.AutoUtils;

import android.app.Activity;
import android.os.Bundle;
/**
 * 
 * @author ZhengJingle
 *
 */
public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		AutoUtils.auto(this);//����ʵ����Ļ
		
	}

	
}
