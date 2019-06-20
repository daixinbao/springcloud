rem set JAVA_HOME=D:\Program Files\Java\jdk1.8.0_101-64bit
rem set PATH=%JAVA_HOME%/bin;%JAVA_HOME%/jre/bin
rem set CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar
rem ./bin/win64/activemq.bat
rem 第一步激活RABBITMQ rabbitmq_management
rem "D:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.15\sbin\rabbitmq-plugins.bat" enable rabbitmq_management

SET ERLANG_HOME=D:\Program Files\erl9.3
SET RABBITMQ_SERVER=D:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.15
set PATH=%PATH%;%ERLANG_HOME%\bin;%RABBITMQ_SERVER%\sbin;
"%RABBITMQ_SERVER%/sbin/rabbitmq-plugins.bat" enable rabbitmq_management
net start RabbitMQ
