# Discord-Twitch_APPv0.11
This application together with DiscordChatExplorer and AIOTool provides you with a connection between your Discord and Twitch channels chats.

# What do you need to use?
- Your Discord Token, [check here;](https://discordhelp.net/discord-token)
- Your Twitch Token, [check here;](https://dev.twitch.tv/docs/authentication)
- DiscordChatExplorer installed and configured, [check here;](https://github.com/Tyrrrz/DiscordChatExporter/releases/tag/2.34.1)
- DotNet 6.0, [check here;](https://dotnet.microsoft.com/en-us/download/dotnet/6.0)
- Java 15, [check here;](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)
- AIO Tool or Message Applications for Twitch, [check here.](https://dev.twitch.tv/docs/irc)

# Basics
The algorithm will automatically filter and remove messages that it deems useless or against GDPR, such as:
- Mentions;
- Appointments;
- Images and other files attached;
- HTTP and HTTPS links;
- Any message that has a person's full name;
- Duplicated Messages;
- Emojis and Emoticons.

# What is it useful for?
- To connect your Discord to Twitch and send messages via API;
- For Machine Learning;
- To test applications that filter messages, E.G. GDPR Apps.

# How to use
Simply place the jar in a folder with your txt chat file downloaded from discord via DiscordChatExplorer and run:
- java -jar Discord-Twitch_APPv0.11.jar Yourfilename.txt

The output will be a file named ChatTokens.txt with the Tokens ready to be used in AIO Tool or any other Message Applications for Twitch.
Below is a brief example of a log generated from the execution:
```
Token message number 2 removed due containing useless data.
Token message number 3 removed due containing useless data.
Token message number 4 removed due containing useless data.
Token message number 5 removed due containing useless data.
Token message number 6 removed due containing data against GDPR policies.
Token message number 8 removed due containing useless data.
Token message number 9 removed due containing useless data.
Token message number 10 removed due containing data against GDPR policies.
Token message number 12 removed due containing useless data.
Token message number 13 removed due containing useless data.
Token message number 14 removed due containing data against GDPR policies.
Chat Tokens Successfully Generated!
Tokens Processed: 3
Removed Tokens: 12
```

# Contact
Any questions or problems when using the application, call me at [contact@bolonhezi.com](mailto:contact@bolonhezi.com).
