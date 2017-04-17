package org.pashkou.messanger.database;

import java.util.HashMap;
import java.util.Map;

import org.pashkou.messanger.model.Message;
import org.pashkou.messanger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	private static void initMessageDataStub(){
		Message m1 = new Message(1L, "Hello Sergei", "Pashkou");
		Message m2 = new Message(2L, "Hello Natallia", "Pashkou");
		Message m3 = new Message(3L, "Hello Martina", "Pashkou");
		messages.put(m1.getId(), m1);
		messages.put(m2.getId(), m2);
		messages.put(m3.getId(), m3);
	}
	
	private static void initProfilesDataStub(){
		profiles.put("pashkou", new Profile(1L, "pashkou", "Pashkou", "Kadgarov") );
	}
	
	public static Map<Long, Message> getMessages() {
		if(messages.size() == 0){
			initMessageDataStub();
		}
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		if(profiles.size() == 0){
			initProfilesDataStub();
		}
		return profiles;
	}
	
	
}
