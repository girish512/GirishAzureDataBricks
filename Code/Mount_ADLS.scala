// Databricks notebook source
// MAGIC %md Mount Azure Data Lake to DBFS

// COMMAND ----------

/*val configs = Map(
  "fs.azure.account.auth.type" -> "OAuth",
  "fs.azure.account.oauth.provider.type" -> "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
  "fs.azure.account.oauth2.client.id" -> dbutils.secrets.get(scope="girishdatabricks-secret",key="girishdl-appID"),
  "fs.azure.account.oauth2.client.secret" -> dbutils.secrets.get(scope="girishdatabricks-secret",key="girishdl-secretVal"),
  "fs.azure.account.oauth2.client.endpoint" -> "https://login.microsoftonline.com/b70f4d5d-6d07-4174-8591-db39bafdf2a4/oauth2/token")

dbutils.fs.mount(
  source = "abfss://girishdata@girish512dl.dfs.core.windows.net/files",
  mountPoint = "/mnt/files",
  extraConfigs = configs)*/
dbutils.fs.ls("/mnt/files/rawdata/")
//dbutils.fs.unmount("/mnt/files")
