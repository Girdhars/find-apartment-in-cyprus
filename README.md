# find-apartment-in-cyprus
this project will help you to find the apartment in cyprus from bazaraki web site

1. pre-requisite 
  Java8 must be installed on your machine, JAVA_HOME env variable must be there and and java must be there in CLASSPATH
  
2. download the find-my-apartment.zip file at your local machine

3. extract the find-my-apartment.zip 

3. open the extracted location in command prompt

4. run below command to start the application 
   java -jar find-my-apartment.jar

5. it will prompt for "your search criteria", please provide the search criteria, go to bazaraki site. apply your filters and get the url    in URL bar e.g. https://www.bazaraki.com/real-estate/houses-and-villas-rent/number-of-bedrooms---2/?price_max=800&city_districts=5693&city_districts=5699&city_districts=5694

  note: make sure your search criteria must contain search result in a single page. If your search result in more than one page. apply more filters :) reduce it to one page. multipage functionality is not yet implemented in application ;) 

6. it will prompt for "schedular time", how frequently you want to get the alert, please provie the time in minute.
   you will get alart notification on your machine when the new apartment is available. and the url of newly appartment will be published    on your console
   
   NOTE: application will open a chrome browser. don't close the browser. If you close the browser it will not going to find appart for      you.
  
  
    
