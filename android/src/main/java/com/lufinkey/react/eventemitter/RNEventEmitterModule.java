
package com.lufinkey.react.eventemitter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNEventEmitterModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNEventEmitterModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNEventEmitter";
  }
}