package br.ufs.dcomp.ExemploRabbitMQ;

import com.rabbitmq.client.*;

import java.io.IOException;

public class Receptor {

  private final static String QUEUE_NAME = "minha-fila";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUsername("thalyson");
    factory.setPassword("12345678");
<<<<<<< HEAD
    factory.setHost("ec2-54-174-158-151.compute-1.amazonaws.com");
=======
    factory.setHost("ec2-54-242-14-47.compute-1.amazonaws.com");
>>>>>>> e6efaa494795c3e7ccd509adb0d7ad3f309cdaa1
    factory.setVirtualHost("/");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();

                      //(queue-name, durable, exclusive, auto-delete, params); 
    channel.queueDeclare(QUEUE_NAME, false,   false,     false,       null); //RabbitMQ ignora filas já declaradas
    
    System.out.println(" [*] Esperando recebimento de mensagens...");

    Consumer consumer = new DefaultConsumer(channel) {
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
      throws IOException {

        String message = new String(body, "UTF-8");
        System.out.println(" [x] Mensagem recebida: '" + message + "'");

                        //(deliveryTag,               multiple);
        //channel.basicAck(envelope.getDeliveryTag(), false);
      }
    };
                      //(queue-name, autoAck, consumer);    
    channel.basicConsume(QUEUE_NAME, true,    consumer);
  }
}