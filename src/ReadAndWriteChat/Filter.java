package ReadAndWriteChat;

import javax.swing.JOptionPane;
import OpenFile.File;

public class Filter {

	public static void main(String[] Args) throws Exception {

		try {
			String Input_Directory = JOptionPane.showInputDialog(null, "Entry Path: ", "Discord-Twitch_APPv0.1 - Fill in the Required Information", JOptionPane.QUESTION_MESSAGE);
			String Output_Directory = JOptionPane.showInputDialog(null, "Output Directory with the / in the end: ", "Discord-Twitch_APPv0.1 - Fill in the Required Information", JOptionPane.QUESTION_MESSAGE);
			File Tokens = new File();
			Tokens.ReadFile(Input_Directory, Output_Directory);
			int processedTokens = Tokens.getprocessedTokens(), removedTokens = Tokens.getremovedTokens();
			JOptionPane.showMessageDialog(null, "Chat Tokens Successfully Generated!" + "\n Tokens Processed: " + processedTokens + "\n Removed Tokens: " + removedTokens);
		} catch (Exception Error) {
			JOptionPane.showMessageDialog(null, "Error:"+Error);
		}
		
	}

}