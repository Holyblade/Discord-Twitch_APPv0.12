package OpenFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;

public class File {

	private int processedTokens, readyTokens, removedTokens;
	private HashSet<String> HashSetTokens = new HashSet<String>();

	public int getprocessedTokens() {
		return processedTokens;
	}

	public int getreadyTokens() {
		return readyTokens;
	}

	public int getremovedTokens() {
		return removedTokens;
	}

	private void setprocessedTokens(int processedTokens) {
		this.processedTokens = processedTokens;
	}

	private void setreadyTokens(int readyTokens) {
		this.readyTokens = readyTokens;
	}

	private void setremovedTokens(int removedTokens) {
		this.removedTokens = removedTokens;
	}

	public void ReadFile(String Input_File) throws Exception {
		BufferedReader Buffer = new BufferedReader(new InputStreamReader(new FileInputStream(Input_File), "UTF-8"));
		String Line = Buffer.readLine();
		int currentLine = 2;
		do {
			Line = Buffer.readLine();
			if (Line != null) {
				if (!Line.trim().equals("")) {
					if (Line != "Image" && Line != "?" && Line != "\n" && currentLine > 5) {
						if (Line.contains("@") || Line.contains("(edited)") || Line.contains("attachment")
								|| Line.contains("http") || Line.contains("[") || Line.contains("{") || Line.equals("")
								|| Line.equals("+") || Line.equals("-") || Line.equals("$") || Line.equals("$")
								|| Line.equals("$") || Line.equals("!") || Line.equals("#") || Line.equals("%")
								|| Line.equals("&") || Line.equals("*") || Line.equals(" ") || Line.equals("¨")
								|| Line.equals("(") || Line.equals(")")) {
							System.out.println("Token message number " + currentLine + " removed due containing data against GDPR policies.");
							removedTokens++;
						} else {
							if (HashSetTokens.contains(Line)) {
								System.out.println("Token message number " + currentLine + " removed due containing useless data.");
								removedTokens++;
							} else {
								HashSetTokens.add(Line);
								readyTokens++;
							}
						}
					} else {
						System.out.println("Token message number " + currentLine + " removed due containing useless data.");
						removedTokens++;
					}
				} else {
					System.out.println("Token message number " + currentLine + " removed due containing useless data.");
					removedTokens++;
				}
			} else {
				removedTokens++;
				break;
			}
			setprocessedTokens(currentLine);
			currentLine++;
		} while (Line != null);
		System.out.println("Generating ChatTokens.txt File, Please wait...");
		Iterator<String> UniqueList = HashSetTokens.iterator();
		while (UniqueList.hasNext()) {
			String FormatedToken = UniqueList.next();
			WriteFile(FormatedToken);
		}
		setreadyTokens(readyTokens);
		setremovedTokens(removedTokens);
		Buffer.close();
	}

	private void WriteFile(String Chat) throws IOException {
		Writer File = new BufferedWriter(new FileWriter("ChatTokens.txt", true));
		File.append(Chat + "\n");
		File.close();
	}

}
