// Databricks notebook source
// MAGIC %md Mount Azure Data Lake to DBFS

// COMMAND ----------

val configs = Map(
  "fs.azure.account.auth.type" -> "OAuth",
  "fs.azure.account.oauth.provider.type" -> "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
  "fs.azure.account.oauth2.client.id" -> "8a663464-1dd8-4edc-a0be-62b5a3ae1fb6",
  "fs.azure.account.oauth2.client.secret" -> "vhH7Q~GIuhq9JJ.2EVVXuwFpxyb32BpY2h846",
  "fs.azure.account.oauth2.client.endpoint" -> "https://login.microsoftonline.com/b70f4d5d-6d07-4174-8591-db39bafdf2a4/oauth2/token")

dbutils.fs.mount(
  source = "abfss://myproject@myazureprojectdl.dfs.core.windows.net/",
  mountPoint = "/mnt/myazureprojectdl",
  extraConfigs = configs)
dbutils.fs.ls("/mnt/myazureprojectdl/rawdata")
//dbutils.fs.unmount("/mnt/myazureprojectdl")
