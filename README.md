# ExemploRabbitMQ

Como gerar jar usando maven:
    
1- mvn (clean?) compile assembly:single

2 -renomeia o jar para Receptor.jar

3- executa o .jar da página target:
 java -jar target/Receptor.jar 

5 - altera pom.xml de receptor para emissor

6- Abre novo terminal e refaz os passos anteriores para emissor