package client;

import java.io.IOException;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;
import aggregators.MinAggregator;

public class AggregatorApp {

	public static void main(String[] args) throws IOException {
		
		

		MaxAggregator agg = new MaxAggregator();
		AggregatorProcessor<MaxAggregator> aggsProcessor = new AggregatorProcessor<MaxAggregator>(agg, "table.csv");
		double value = aggsProcessor.runAggregartor(1);
		System.out.println(value);
	

	}

}
