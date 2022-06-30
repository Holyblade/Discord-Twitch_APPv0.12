# Discord-Twitch_APPv0.12
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
- Duplicate Messages;
- Emojis and Emoticons.

# What is it useful for?
- To connect your Discord to Twitch and send messages via API;
- For Machine Learning;
- To test applications that filter messages, E.G. GDPR Apps.

# How to use
Simply place the jar in a folder with your txt chat file downloaded from discord via DiscordChatExplorer and run:
- java -jar Discord-Twitch_APPv0.12.jar JohnDoe_Chat.txt

The output will be a file named ChatTokens.txt with the Tokens ready to be used in AIO Tool or any other Message Applications for Twitch.
Below is a brief example of a log generated from the execution:
```
Token message number 1 removed due containing useless data.
Token message number 2 removed due containing useless data.
Token message number 3 removed due containing useless data.
Token message number 4 removed due containing useless data.
Token message number 5 removed due containing useless data.
Token message number 11 removed due containing data against GDPR policies.
Token message number 14 removed due containing data against GDPR policies.
Token message number 15 removed due containing data against GDPR policies.
Token message number 16 removed due containing data against GDPR policies.
Token message number 17 removed due containing data against GDPR policies.
Token message number 21 removed due containing data against GDPR policies.
Token message number 22 removed due containing data against GDPR policies.
Token message number 23 removed due containing data against GDPR policies.
Token message number 24 removed due containing data against GDPR policies.
Token message number 26 removed due containing data against GDPR policies.
Generating ChatTokens.txt File, Please wait...
Chat Tokens Successfully Generated!
Tokens Processed: 1613976
Tokens Removed: 15
Ready Tokens: 1613961
```

# ChangeLog

```diff
v0.11 ⋮ 28/6/22
+ Stable Release

v0.12 ⋮ 30/06/22
+ Updated useless data filter
+ Added message to inform current state of execution

```

# Contact
Any questions or problems when using the application, call me at [contact@bolonhezi.com](mailto:contact@bolonhezi.com).
