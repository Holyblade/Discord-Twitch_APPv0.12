package OpenFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class File {

	private int processedTokens, removedTokens;

	public int getprocessedTokens() {
		return processedTokens;
	}

	public int getremovedTokens() {
		return removedTokens;
	}

	private void setprocessedTokens(int processedTokens) {
		this.processedTokens = processedTokens;
	}

	private void setremovedTokens(int removedTokens) {
		this.removedTokens = removedTokens;
	}

	public void ReadFile(String Input_File, String Output_Directory) throws Exception {
		BufferedReader Buffer = new BufferedReader(new InputStreamReader(new FileInputStream(Input_File), "UTF-8"));
		String Line = Buffer.readLine();
		int currentLine = 2;
		do {
			Line = Buffer.readLine();
			if (Line != null) {
				if (!Line.trim().equals("")) {
					if (Line != "Image" && Line != "?" && Line != "\n" && currentLine > 5) {
						if (Line.contains("@") || Line.contains("(edited)") || Line.contains("Click to see attachment") || Line.contains("http") || Line.contains("[")) {
							System.out.println("Token message number " + currentLine+ " removed due containing data against GDPR policies.");
							removedTokens++;
						} else {
							WriteFile(Line, Output_Directory);
							processedTokens++;
						}
					} else {
						System.out.println("Token message number " + currentLine + " removed due containing useless data.");
						removedTokens++;
					}
				}
			} else {
				break;
			}
			currentLine++;
		} while (Line != null);
		setprocessedTokens(processedTokens);
		setremovedTokens(removedTokens);
		Buffer.close();
	}

	private void WriteFile(String Chat, String Output_Directory) throws IOException {
		Writer File = new BufferedWriter(new FileWriter(Output_Directory + "ChatTokens.txt", true));
		File.append(Chat + "\n");
		File.close();
	}

}