package com.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NetBankingAppRanker {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<NetBankingApp> apps = new ArrayList<NetBankingApp>();

	        System.out.println("Enter number of apps to rank:");
	        int numOfApps = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 0; i < numOfApps; i++) {
	            System.out.println("Enter app name:");
	            String appName = scanner.nextLine();

	            System.out.println("Enter security rating (out of 10):");
	            int securityRating = scanner.nextInt();

	            System.out.println("Enter user friendliness rating (out of 10):");
	            int userFriendliness = scanner.nextInt();

	            System.out.println("Enter number of features:");
	            int numOfFeatures = scanner.nextInt();
	            scanner.nextLine();

	            apps.add(new NetBankingApp(appName, securityRating, userFriendliness, numOfFeatures));
	        }

	        Collections.sort(apps, new AppRankingComparator());

	        System.out.println("Apps ranked:");
	        for (NetBankingApp app : apps) {
	            System.out.println(app.getAppName());
	        }
	    }
}
