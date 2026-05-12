package com.linkcode.collectionFramework_examples;

import java.time.LocalDateTime;
import java.util.TreeSet;

public class meetingSchedular {
	
	static TreeSet<LocalDateTime>meetings=new TreeSet<LocalDateTime>();
	
	public static void main(String[] args) {
		
		scheduleMeeting(LocalDateTime.of(2026,4,14,11,30));
		scheduleMeeting(LocalDateTime.of(2026,4,15,10,30));
		scheduleMeeting(LocalDateTime.of(2026,4,14,7,30));
		scheduleMeeting(LocalDateTime.of(2026,4,14,9,30));
		scheduleMeeting(LocalDateTime.of(2026,4,15,12,30));
		scheduleMeeting(LocalDateTime.of(2026,4,16,6,30));
		
		viewMeeting();
		System.out.println("First meeting : ");
		System.out.println(meetings.first());
		System.out.println("Last meeting : ");
		System.out.println(meetings.last());
		System.out.println("Meetings from : "+LocalDateTime.of(2026,4,15,10,30));
		System.out.println(meetings.tailSet(LocalDateTime.of(2026,4,15,10,30)));
		
		
		
		
	}

	private static void viewMeeting() {
		meetings.forEach(val->System.out.println(val));
		
	}

	private static void scheduleMeeting(LocalDateTime time) {
		meetings.add(time);
		System.out.println("Meeting marked");
		
	}

}
