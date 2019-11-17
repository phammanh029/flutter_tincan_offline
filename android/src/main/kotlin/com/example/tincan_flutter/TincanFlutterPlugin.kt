package com.example.tincan_flutter

import android.util.Log
import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class TincanFlutterPlugin {

  companion object {

    private var clientHandler: TincanClientHandler? = null
    @JvmStatic
    fun registerWith(registrar: Registrar): Unit {
      this.clientHandler = TincanClientHandler(registrar)
    }
  }
}


class TincanClientHandler(private val registrar: Registrar) : MethodCallHandler {
  private val TAG = "TincanClient";
  private lateinit var tincan: TincanApi
  private val channel: MethodChannel

  init {
    channel = MethodChannel(registrar.messenger(), "tincan_flutter")
    channel.setMethodCallHandler(this)
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    val context = registrar.activeContext()
    val application = context.getApplicationContext() as FlutterApplication

    when(call.method){
      "initialize" -> {
        val rawParams = call.arguments as Map<String, Object>
//        tincan = TincanApi(rawParams, registrar.getContext())
        // do add connector
        result.success(true);
      }
      "activity" -> {
        // add activity

      }
      "enqueueStatement"-> {
          Log.d(TAG, "Call Endqueue")
        //Log.d(TAG, call.arguments as Map<String, Object>);
      }
    }
//    if (call.method == "getPlatformVersion") {
//      result.success("Android ${android.os.Build.VERSION.RELEASE}")
//    } else {
//      if(call.method == "initialize"){
//
//      }
//      result.notImplemented()
//    }
  }
}
