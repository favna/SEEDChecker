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


## Buy me a donut

This project is open source and always will be, even if I don't get donations. That said, I know there are people out there that may still want to donate just to show their appreciation so this is for you guys. Thanks in advance!

I accept donations through PayPal, BitCoin, Ethereum and LiteCoin. You can use the buttons below to donate through your method of choice

|Donate With|QR|Address|
|:---:|:---:|:---:|
<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XMAYCF9SDHZ34"><img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/paypaldonate.png"></a>|<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XMAYCF9SDHZ34"><img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/paypalqr.png" width="128"></a>|[Donate with PayPal](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XMAYCF9SDHZ34)|
<img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/bitcoindonate.png">|<img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/bitcoinqr.png" width="128">|<a href="bitcoin:1E643TNif2MTh75rugepmXuq35Tck4TnE5?amount=0.01&label=Favna%27%20Ribbon%20Discord%20Bot">1E643TNif2MTh75rugepmXuq35Tck4TnE5</a>|
<img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/ethereumdonate.png">|<img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/ethereumqr.png" width="128">|<a href="ethereum:0xF653F666903cd8739030D2721bF01095896F5D6E?amount=0.01&label=Favna%27%20Ribbon%20Discord%20Bot">0xF653F666903cd8739030D2721bF01095896F5D6E</a>|
<img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/litecoindonate.png">|<img src="https://storage.googleapis.com/data-sunlight-146313.appspot.com/ribbon/litecoinqr.png" width="128">|<a href="litecoin:LZHvBkaJqKJRa8N7Dyu41Jd1PDBAofCik6?amount=0.01&label=Favna%27%20Ribbon%20Discord%20Bot">LZHvBkaJqKJRa8N7Dyu41Jd1PDBAofCik6</a>|
