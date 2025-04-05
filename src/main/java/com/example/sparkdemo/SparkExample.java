package com.example.sparkdemo;

import org.apache.spark.sql.*;

public class SparkExample {
    public static void main(String[] args) {
        // 创建 SparkSession
        SparkSession spark = SparkSession.builder()
                .appName("Java Spark Example")
                .master("spark://2b4cf3b85975:7077")  // 连接到 Spark 集群
                .getOrCreate();

        // 创建 DataFrame
        Dataset<Row> df = spark.createDataFrame(
                java.util.Arrays.asList(
                        new Person("Alice", 30),
                        new Person("Bob", 25),
                        new Person("Charlie", 35)
                ),
                Person.class
        );
        // 显示数据
        df.show();
        // 结束 Spark 任务
        spark.stop();
    }
}
//spark-submit --class com.example.sparkdemo.SparkExample --name testcjl  --master spark://localhost:7077 --conf "spark.executor.extraLibraryPath=$HADOOP_HOME/lib/native" /opt/share/SparkDemo-0.0.1-SNAPSHOT.jar