package ReadAndWriteChat;

import OpenFile.File;

public class Filter {

	public static void main(String[] Args) throws Exception {

		try {
			File Tokens = new File();
			Tokens.ReadFile(Args[0]);
			int processedTokens = Tokens.getprocessedTokens(), removedTokens = Tokens.getremovedTokens(), readyTokens = Tokens.getreadyTokens();
			System.out.println("Chat Tokens Successfully Generated!" + "\nTokens Processed: " + processedTokens + "\nTokens Removed: " + removedTokens + "\nReady Tokens: "+readyTokens);
		} catch (Exception Error) {
			System.out.println("Error:"+Error);
		}
		
	}

}
