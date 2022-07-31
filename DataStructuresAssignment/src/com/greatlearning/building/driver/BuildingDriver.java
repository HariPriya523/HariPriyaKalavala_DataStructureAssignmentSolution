package com.greatlearning.building.driver;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.greatlearning.building.stub.FloorDetails;

public class BuildingDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		List<FloorDetails> list = new LinkedList<>();
		int noOfFloors = sc.nextInt();
		for (int i = 0; i < noOfFloors; i++) {
			FloorDetails fd = new FloorDetails();
			System.out.println("enter the floor size given on day : " + (i + 1));
			fd.setDay(i + 1);
			fd.setFloorSize(sc.nextInt());
			list.add(fd);
		}
		Collections.sort(list, new Comparator<FloorDetails>() {
			@Override
			public int compare(FloorDetails fd1, FloorDetails fd2) {
				return fd2.getFloorSize() - fd1.getFloorSize();
			}

		});
		System.out.println(list.toString());
		System.out.println("The order of construction is as follows");
		int listiter = 0;
		for (int iter = 1; listiter < list.size() && iter <= list.size(); iter++) {
			System.out.print("Day-" + iter +" ");
			if (iter >= list.get(listiter).getDay()) {
				for (int j = iter; listiter < list.size() && j >= list.get(listiter).getDay();) {
					System.out.print(list.get(listiter).getFloorSize() + " ");
					listiter++;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
