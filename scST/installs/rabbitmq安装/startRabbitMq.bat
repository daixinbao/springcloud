rem set JAVA_HOME=D:\Program Files\Java\jdk1.8.0_101-64bit
rem set PATH=%JAVA_HOME%/bin;%JAVA_HOME%/jre/bin
rem set CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar
rem ./bin/win64/activemq.bat
rem 第一步激活RABBITMQ rabbitmq_management
rem "D:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.15\sbin\rabbitmq-plugins.bat" enable rabbitmq_management
rem 安装包下载地址 链接：https://pan.baidu.com/s/1fvbLz8JY9HNWmkeeubzG5A
rem            提取码：34zi
rem 切换为管理员  runas /noprofile /user:Administrator cmd


SET ERLANG_HOME=D:\programs_java\javaManualDevl\erl6.2
SET RABBITMQ_SERVER=D:\programs_java\javaManualDevl\RabbitMQ Server\rabbitmq_server-3.4.1
set PATH=%PATH%;%ERLANG_HOME%\bin;%RABBITMQ_SERVER%\sbin;
call "%RABBITMQ_SERVER%/sbin/rabbitmq-plugins.bat" enable rabbitmq_management
net start RabbitMQ
