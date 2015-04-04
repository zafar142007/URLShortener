# URLShortener
A simple URL shortener.

Usage:

java LoadURLs -file \<file\> 

java LoadURLs -console \<url1\> \<url2\> ...

If loading as a JAR, use the method getDeflatedURL(String) in the class ShortenURL.

Supports upto 493039 URLs currently, which can be extended by channging the shortened URL length (which is only 3 characters right now) or by inclusing more number of permissible characters in the shortened URL (which is 79 currently- from ASCII 48 to 126).