package com.driver;

public class AppRankingComparator {
	 public int compare(NetBankingApp app1, NetBankingApp app2) {
	        // your code goes here

	        return Integer.compare(app2.getNumOfFeatures(), app1.getNumOfFeatures());
	    }
}
