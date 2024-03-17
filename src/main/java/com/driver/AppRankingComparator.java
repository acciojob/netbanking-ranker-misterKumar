package com.driver;

import java.util.Comparator;

public class AppRankingComparator implements Comparator<NetBankingApp> {
	 public int compare(NetBankingApp app1, NetBankingApp app2) {
	        // your code goes here
		// First, compare by security rating
		 int securityComparison = Integer.compare(app2.getSecurityRating(), app1.getSecurityRating());
		 if (securityComparison != 0) {
			 return securityComparison;
		 }

		 // If security ratings are equal, compare by user friendliness
		 int userFriendlinessComparison = Integer.compare(app2.getUserFriendliness(), app1.getUserFriendliness());
		 if (userFriendlinessComparison != 0) {
			 return userFriendlinessComparison;
		 }

		 // If user friendliness ratings are also equal, compare by number of features
	        return Integer.compare(app2.getNumOfFeatures(), app1.getNumOfFeatures());
	    }
}
