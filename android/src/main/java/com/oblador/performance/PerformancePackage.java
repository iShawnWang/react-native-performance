package com.oblador.performance;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class PerformancePackage implements ReactPackage {

  public PerformancePackage() {
    PerformanceModule.setupListener();
  }

  @Override
  public List<NativeModule> createNativeModules(final ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();

    modules.add(new PerformanceModule(reactContext));

    return modules;
  }

  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(final ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
