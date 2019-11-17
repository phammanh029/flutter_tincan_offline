import 'dart:async';

import 'package:flutter/services.dart';
import 'package:tincan_flutter/Statement.dart';

class TincanFlutter {
  static const MethodChannel _channel = const MethodChannel('tincan_flutter');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<bool> initialize(Map<String, dynamic> params) async {
    final result = await _channel.invokeMethod('initialize', params);
    return result;
  }

  static Future<bool> enqueueStatement(Statement statement) async {
    final result = await _channel.invokeMethod('enqueueStatement', statement);
    return result;
  }
}
