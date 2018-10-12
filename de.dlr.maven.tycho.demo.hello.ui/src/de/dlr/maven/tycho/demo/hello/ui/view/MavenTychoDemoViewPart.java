/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.hello.ui.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.experimental.chart.swt.ChartComposite;

import de.dlr.maven.tycho.demo.hello.say.SayHello;

/**
 * This class implements a simple view
 * 
 */
public class MavenTychoDemoViewPart extends ViewPart {

	/**
	 * The constructor
	 */
	public MavenTychoDemoViewPart() {
	}

	public static final int GRID_LAYOUT_3_COLUMNS = 3;

	@Override
	public void createPartControl(Composite parent) {

		GridLayout gridLayout = new GridLayout(GRID_LAYOUT_3_COLUMNS, true);
		parent.setLayout(gridLayout);

		Text textfieldIn = new Text(parent, SWT.BORDER);
		textfieldIn.setLayoutData(new GridDataFactory().grabHorizontalSpace().fillHorizontalAlignment().create());

		Button buttonSayHello = new Button(parent, SWT.PUSH);
		buttonSayHello.setText("Say Hello");
		buttonSayHello.setLayoutData(new GridDataFactory().grabHorizontalSpace().fillHorizontalAlignment().create());

		Text textFieldOut = new Text(parent, SWT.BORDER);
		textFieldOut.setLayoutData(new GridDataFactory().grabHorizontalSpace().fillHorizontalAlignment().create());

		buttonSayHello.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String nameOfFriend = textfieldIn.getText();
				String sayHello = new SayHello().toMyFriend(nameOfFriend);
				textFieldOut.setText(sayHello);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		JFreeChart chart = createPieChart();
		ChartComposite chartComposite = new ChartComposite(parent, SWT.NONE, chart, true);
		chartComposite.setLayoutData(new GridDataFactory()
				.fillHorizontalAlignment()
				.grabVerticalSpace()
				.fillVerticalAlignment()
				.grabHorizontalSpace()
				.horizontalSpan(GRID_LAYOUT_3_COLUMNS)
				.create()
		);
		
	}

	/**
	 * Factory to help creating SWT GridLayout LaoutDatas
	 *
	 */
	class GridDataFactory {

		GridData gridData = new GridData();

		/**
		 * Make the GridData capture excess Horizontal Space
		 * @return the Factory
		 */
		GridDataFactory grabHorizontalSpace() {
			gridData.grabExcessHorizontalSpace = true;
			return this;
		}
		
		/**
		 * Make the GridData capture excess Vertical Space
		 * @return the Factory
		 */
		GridDataFactory grabVerticalSpace() {
			gridData.grabExcessVerticalSpace = true;
			return this;
		}

		/**
		 * Make the GridData fill horizontal alignment
		 * @return the Factory
		 */		
		GridDataFactory fillHorizontalAlignment() {
			gridData.horizontalAlignment = SWT.FILL;
			return this;
		}

		/**
		 * Make the GridData fill vertical alignment
		 * @return the Factory
		 */		
		GridDataFactory fillVerticalAlignment() {
			gridData.verticalAlignment = SWT.FILL;
			return this;
		}
		
		/**
		 * Make the GridData capture span horizontally given by the number of columns
		 * @param clmns the number of columns to span over
		 * @return the Factory
		 */
		GridDataFactory horizontalSpan(int clmns) {
			gridData.horizontalSpan = clmns;
			return this;
		}
		
		/**
		 * Create the GridLayoutData
		 * @return the built GridLayout Data
		 */
		GridData create() {
			return gridData;
		}
	}
	
	/**
	 * Method to create a Pie Chart using JFreeChart
	 * @return The JFreeChart PieChart
	 */
	private JFreeChart createPieChart() {
		DefaultPieDataset pieDataSet = new DefaultPieDataset();
		
		//CHECKSTYLE:OFF
		pieDataSet.setValue("Part One", new Double(22.1));
		pieDataSet.setValue("Part Two", new Double(34.6));
		pieDataSet.setValue("Part Three", new Double(62.3));
		//CHECKSTYLE:ON
		
		JFreeChart chart = ChartFactory.createPieChart("Pie Chart Demo", pieDataSet, true, true, false);
		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setSectionOutlinesVisible(false);
		return chart;
	}

	@Override
	public void setFocus() {
	}
}
