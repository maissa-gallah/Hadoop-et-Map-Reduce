package tn.insat.tp1;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class TokenizerMapper extends Mapper<Object, Text, Text, FloatWritable> {

	private Text word = new Text();
	private  FloatWritable cost;

	public void map(Object key, Text value, Mapper.Context context) throws IOException, InterruptedException {
		
		String valueString = value.toString();
		String[] line = valueString.split(",");
		word.set(line[3]);
		cost=new FloatWritable(Float.parseFloat(line[5])); 
		context.write(word,cost );
		
		
	}
}
