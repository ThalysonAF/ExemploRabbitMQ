# ExemploRabbitMQ

Como gerar jar usando maven:
    
mvn clean compile assembly:single
renomeia o jar para Receptor.jar
executa o .jar da página target:
java -jar target/Receptor.jar 
altera pom.xml de receptor para emissor
Abre novo terminal e refaz os passos anteriores para emissor