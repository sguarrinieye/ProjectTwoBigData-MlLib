package classifierCore.functions;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.mllib.regression.LabeledPoint;

import classifierCore.model.Flight;

public class ParsingFuction01 implements Function<Flight, LabeledPoint> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public LabeledPoint call(Flight arg0) throws Exception {
		Double delay = (double) arg0.isDelay();

		return new LabeledPoint(delay, arg0.getVectorFeaturesV2());
	}
}