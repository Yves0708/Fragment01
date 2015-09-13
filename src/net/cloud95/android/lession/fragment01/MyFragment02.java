package net.cloud95.android.lession.fragment01;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment02 extends Fragment {
    
    private static final String TAG = "MyFragment02";
    private static final boolean isLog = true;
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //
        log("onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        log("onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        //
    	log("onCreateView");
    	return inflater.inflate(R.layout.fragment_myfragment02, container,false);
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //
        log("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        //
        log("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        //
        log("onResume");
    }

    @Override
    public void onPause() {
        // 
        super.onPause();
        log("onPause");
    }

    @Override
    public void onStop() {
        // 
        super.onStop();
        log("onStope");
    }

    @Override
    public void onDestroyView() {
        // 
        super.onDestroyView();
        log("onDestroyView");
    }
    
    @Override
    public void onDestroy() {
        // 
        super.onDestroy();
        log("onDestroy");
    }

    @Override
    public void onDetach() {
        // 
        super.onDetach();
        log("onDetach");
    }
    
    private void log(String message) {
    	if(isLog){
    		Log.d(TAG, message);
    	}
    }
}