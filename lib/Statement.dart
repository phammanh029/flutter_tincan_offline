class Statement {
  DateTime stored;
  Agent authority;
  TCAPIVersion version;

  Statement();
  Statement.withOptions(StatementOptions options) : this(
  );
}

class TCAPIVersion {
  String version;
}

class Agent {
  String objectType;
  String name;
  String mbox;
  String mboxSHA1Sum;
  String openID;
  // AgentAccount account;
}

class StatementOptions {
  Verb verb;
  String activityType;
}

class Verb {
  String id;
  String display;
}
