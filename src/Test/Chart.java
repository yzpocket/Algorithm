package Test;
import java.util.function.IntPredicate;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;


public class Chart {
	public static void main(String[] args) {
	double[] xData=new double[] {0.0,1.0,2.0};
	double[] yData=new double[] {0.0,1.0,2.0};
	
	XYChart chart=QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);
	
	new SwingWrapper<XYChart>(chart).displayChart();
	
	}
}
