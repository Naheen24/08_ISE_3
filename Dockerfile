# base image
FROM openjdk:8
COPY . /src/java
WORKDIR/src/java
RUN ["javac" , "PrimeNo.java"]
ENTRYPOINT ["java","PrimeNo"]
