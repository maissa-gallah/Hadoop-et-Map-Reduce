

# Hadoop Map/Reduce

I am using this docker image to create a cluster of a master node (Namenode) and two worker nodes (Datanodes).

```
docker pull liliasfaxi/spark-hadoop:hv-2.7.2
```

I worked with a simple MapReduce program which is WordCount. It basically calculates the number of words in a given file, by breaking down the calculation into two steps:

1. The Mapping step, which splits the text into words and outputs a text stream, where each line contains the word found, followed by the value 1 (basically saying the word has been found once).
2. The Reducing step, which sums the 1s for each word, to find the total number of occurrences of the word in the text.


**Note**

You can launch the map/reduce job locally (for testing) or on the cluster.

