package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class LanguageDetectorModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public LanguageDetectorModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "LanguageDetector";
    }

   @Override
    public Map<String, Object> getConstants() {
        HashMap<String,Object> constants = new HashMap<String,Object>();
        constants.put("locale", reactContext.getResources().getConfiguration().locale.toString());
        return constants;
    }

}
