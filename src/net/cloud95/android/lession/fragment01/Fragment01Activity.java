package net.cloud95.android.lession.fragment01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

//為了支援Support Library，所以繼承自FragmentActivity
public class Fragment01Activity extends FragmentActivity {
    
    private static final String TAG = "Fragment01Activity";
    private static final boolean isLog = true;
    
    private boolean added = false;
    
    private FragmentManager manager;
    private MyFragment03 myFragment03;
    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment01);
        // 讀取放置MyFragment03的畫面元件
        container = (FrameLayout)findViewById(R.id.container);
        // 為了支援Support Library，
        // 所以呼叫getSupportFragmentManager方法，                
        // 取得FragmentManager物件   
        manager = getSupportFragmentManager();
        // 建立MyFragment03物件
        myFragment03 = new MyFragment03();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	
    	if(event.getAction()==MotionEvent.ACTION_DOWN){
            // 取得Support Library的FragmentTransaction物件
    		FragmentTransaction transaction = manager.beginTransaction();
    		
            // 如果已經加入
    		if(added){
                // 移除MyFragment03
    			transaction.remove(myFragment03);
                // 讓元件消失
    			container.setVisibility(View.GONE);
    		}
            // 如果還沒有加入
    			else{
                // 加入MyFragment03到指定的畫面元件
    				transaction.add(R.id.container, myFragment03);
                // 顯示元件
    				container.setVisibility(View.VISIBLE);
    			}
            // 確認執行
    			transaction.commit();
            // 設定為已加入與未加入
    			added=!added;
    		}
    		return true;
    }

    @Override
    protected void onRestart() {        
        super.onRestart();
        log("onRestart");
    }    
    
    @Override
    protected void onStart() {        
        super.onStart();
        log("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }
    
    private void log(String message) {
    	if(isLog){
    		Log.d(TAG, message);
    	}
    
    }
    
}
