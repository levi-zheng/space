FROM openjdk:17-jdk-alpine
WORKDIR opt
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN java -jar app.jar



