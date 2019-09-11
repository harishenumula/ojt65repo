set projectLocation=C:\Users\Mounika\git\ojt65repo1\git\Amazon_TestNG

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause
