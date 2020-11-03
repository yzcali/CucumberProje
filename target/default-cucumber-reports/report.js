$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dbokuma.feature");
formatter.feature({
  "name": "Veri Okuma",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbokuma"
    }
  ]
});
formatter.scenario({
  "name": "kullanici hotel tablosundaki verileri okur",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbokuma"
    }
  ]
});
formatter.step({
  "name": "kullanici veritabanina baglanir",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinitions.DbReadStepDef.kullanici_veritabanina_baglanir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"tHOTEL\" tablosundaki \"DateStart\" verilerini alir",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinitions.DbReadStepDef.kullanici_tablosundaki_verilerini_alir(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "com.microsoft.sqlserver.jdbc.SQLServerException: Invalid column name \u0027DateStart\u0027.\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerException.makeFromDatabaseError(SQLServerException.java:262)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement.getNextResult(SQLServerStatement.java:1632)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement.doExecuteCursored(SQLServerStatement.java:2030)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement.doExecuteStatement(SQLServerStatement.java:846)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement$StmtExecCmd.doExecute(SQLServerStatement.java:767)\r\n\tat com.microsoft.sqlserver.jdbc.TDSCommand.execute(IOBuffer.java:7225)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerConnection.executeCommand(SQLServerConnection.java:3053)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement.executeCommand(SQLServerStatement.java:247)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement.executeStatement(SQLServerStatement.java:222)\r\n\tat com.microsoft.sqlserver.jdbc.SQLServerStatement.executeQuery(SQLServerStatement.java:692)\r\n\tat database_stepdefinitions.DbReadStepDef.kullanici_tablosundaki_verilerini_alir(DbReadStepDef.java:18)\r\n\tat ✽.kullanici \"tHOTEL\" tablosundaki \"DateStart\" verilerini alir(file:///C:/Users/yzc/IdeaProjects/CucumberProje/src/test/resources/features/dbokuma.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "kullanici \"DateStart\" sutunundaki verileri okur",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinitions.DbReadStepDef.kullanici_sutunundaki_verileri_okur(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});