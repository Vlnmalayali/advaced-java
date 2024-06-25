jdbc command line code to do in visual studio:
javac -cp ".;C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-j-8.0.31.jar" transaction.java

java -cp ".;C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-j-8.0.31.jar" transaction
-------------------------------------------------------------------------------------------------------
to run tomcat in mrdark:
->cd C:\Program Files (x86)\Apache Software Foundation\Tomcat 9.0\bin
->startup.bat
then->http://localhost:8080/
---------------------------------------------------------------------------------------------------
for servlet program:-
files(index.jsp,web.xml)
1-setup maven and java 
2-open vs code and create a folder
3-rightclick -> maven->newproject (webapp)->1.4->-> save all in same folder
(index.jsp is the folder to provide the code)
4->rightclick on folder and click on open intergrated terminal and type  "mvn clean package"
5-add tomcat to vs code
6-right click on (.war file) and run on tomcat
9-> then in tomcat right click and show in browser
-----------------------------------------------------------------------------------------------



