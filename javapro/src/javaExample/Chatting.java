package javaExample;

public class Chatting {
	void startChar(String charId) {
		String nickName = null;
		nickName = charId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
	}
	
	class Chat {
		String nickName;
		void start() { }
		void sendMessage(String message) {}
	}
}
