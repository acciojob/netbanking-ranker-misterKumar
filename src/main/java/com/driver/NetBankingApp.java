package com.driver;

public class NetBankingApp {
	private String appName;
    private int securityRating;  // out of 10
    private int userFriendliness; // out of 10
    private int numOfFeatures;

    public NetBankingApp(String appName, int securityRating, int userFriendliness, int numOfFeatures) {
      // your code goes here
    }

    public String getAppName() {
    	// your code goes here
        return appName;
    }

    public int getSecurityRating() {
    	// your code goes here
        return securityRating;
    }

    public int getUserFriendliness() {
    	// your code goes here
        return userFriendliness;
    }

    public int getNumOfFeatures() {
    	// your code goes here
        return numOfFeatures;
    }
}
