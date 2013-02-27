package org.math.examples;

import java.applet.*;

import org.math.plot.*;

/**
 * Copyright : BSD License
 * @author Yann RICHET
 */

public class Plot3DApplet extends Applet {

	public void init() {
		// Data definition
		int n = 10;
		double[][] datas1 = new double[n][3];
		double[][] datas2 = new double[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				datas1[i][j] = Math.random();
				datas2[i][j] = Math.random();
			}
		}

		// PlotPanel construction
		Plot3DPanel plotpanel = new Plot3DPanel();
		plotpanel.addLegend("SOUTH");

		// Data plots addition
		plotpanel.addScatterPlot("datas1", datas1);
		plotpanel.addBarPlot("datas2", datas2);

		// include plot in applet
		add(plotpanel);
	}
}