# SEEDChecker
SEEDChecker is a Java tool that can periodically check if a SEED is available for a certain 3DS title

## Usage
First of all make sure you have Java installed. [You can download it here](https://www.java.com/en/download/)

- With Java installed run the tool.
- Enter the TitleID of the title you want to start checking 
- Enter country following the ISO Alpha 2 code, examples are JP for Japan and US for United Stated. 
 - You can find all ISO Alpha 2 country codes [here] (http://www.nationsonline.org/oneworld/country_code_list.htm).
- Finally select the interval at which you want the tool to check the server and hit the button. A new window will pop up which will produce a log of events. Assuming you are checking for a SEED that is not available it will mostly tell you just that, once it is available however it will download it and tell you the download location.
- The download location will by default always be `your user directory/downloads/TitleID.dat`.
 - For example `C:\Users\UserName\downloads\TitleID.dat`

## Building
Ready made builds of the latest version can always be found under Releases. [Click here to go there](https://github.com/Favna/SEEDChecker/releases/latest)

If you desire to compile the source yourself you need [Java SE Development Kit] (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) as well as a Java compatible IDE such as [netbeans](https://netbeans.org/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/). Open the project in the IDE of your choose and build it from there by whichever method the IDE uses.
