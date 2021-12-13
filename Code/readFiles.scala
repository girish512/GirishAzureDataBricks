// Databricks notebook source
// MAGIC %fs ls dbfs:/mnt/files/rawdata

// COMMAND ----------

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{StructType,IntegerType,StringType}

val udata_schema = new StructType()
.add("custID",IntegerType,false)
.add("movieID", IntegerType,false)
.add("rating",IntegerType,false)

var spark = new SparkSession
  .Builder()
  .appName("readFiles")
  .master("local[*]")
  .getOrCreate()



var ds = spark.read
  .option("header","false")
  .schema(udata_schema)
  .option("delimiter","\t")
  .csv("/mnt/files/rawdata/u.data")
.withColumnRenamed("_c0","custID")
.withColumnRenamed("_c1","movieID")
.withColumnRenamed("_c2","rating")


ds.show(10)
