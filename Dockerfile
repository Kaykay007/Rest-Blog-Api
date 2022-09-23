FROM openjdk:18
RUN touch /env.txt
RUN printenv > /env.txt
MAINTAINER korede
COPY target/RestfulBlog-0.0.1-SNAPSHOT.jar RestfulBlog-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/RestfulBlog-0.0.1-SNAPSHOT.jar"]