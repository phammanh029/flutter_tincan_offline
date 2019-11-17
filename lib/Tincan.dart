import 'package:tincan_flutter/Statement.dart';
import 'package:tincan_flutter/tincan_flutter.dart';

class Tincan {
  Future<bool> initialize(Map<String, dynamic> params) {
    return TincanFlutter.initialize(params);
  }

  Future enqueueStatement(Statement statement) {
    return Future.delayed(Duration(seconds: 1));
  }
}
