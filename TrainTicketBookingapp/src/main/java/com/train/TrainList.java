package com.train;
import java.util.ArrayList;
public class TrainList {	
		static ArrayList<TrainDetails> TrainName = new ArrayList<TrainDetails>();

		// This method used to add the train details 
		public static void addTrainList(TrainDetails  ...trains) {
		         for (TrainDetails trainDetails : trains) {
		        	 TrainName.add(trainDetails);
				}
			
		}

		// This method used to return the list of Train
		public static int getNoTrainsAviable() {
			int noOfBanks = TrainName.size();
			return noOfBanks;
		}

		// This method used to display the Trains
		public static void displayTrainName() {

			System.out.println("AVAILABLE TRAINS ");
			for (TrainDetails trainName: TrainName) {
				System.out.println(trainName);
			}
		}

	
        
}
