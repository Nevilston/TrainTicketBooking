package com.train.sc;

import org.junit.Test;

import com.train.TrainDetails;
import com.train.TrainList;

public class TrainListTest {
	@Test
	public void testCase() {
		TrainDetails Train1 = new TrainDetails();
		Train1.trainno="12345M";
		Train1.trainName="Madurai Express ";										
		

		TrainDetails Train2 = new TrainDetails();
		Train2.trainno = "234451T";
		Train2.trainName = "Pearl City Express";
		

		TrainDetails Train3 = new TrainDetails();
		Train3.trainno = "457671C";
		Train3.trainName = "Kacheguda Express";
		 


		TrainList.addTrainList(Train1, Train2, Train3); 
		TrainList.displayTrainName();
	}

}
