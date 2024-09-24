package com.fiap.grp2.integrationmq.util;

public class Constants {

    /*
    * https://www.devmedia.com.br/introducao-ao-amqp-com-rabbitmq/33036
    * https://www.cloudamqp.com/blog/part4-rabbitmq-for-beginners-exchanges-routing-keys-bindings.html?gad_source=1&gclid=EAIaIQobChMI1eKzz6fciAMVaFpIAB0clTWhEAAYASAAEgIwo_D_BwE
    * exchanges e bindings
    * "As exchanges distribuem as cópias das mensagens para filas utilizando regras que são chamadas de bindings"
    * Direct Exchange, Default Exchange, Topic Exchange, Fanout Exchange, Headers Exchange, Dead Letter Exchange0
    */


    public static final long SLEEP_TIME_MILLIS = 60000l;

    public static final float TEMPERATURA_MIN = 0f;
    public static final float TEMPERATURA_MAX = 35f;
    public static final float UMIDADE_MIN = 15f;

    public static final String RABBITMQ_USERNAME = "";
    public static final String RABBITMQ_PASSWD = "";
    public static final String RABBITMQ_VIRTUAL_HOST = "";

    public static final String RABBITMQ_EXCHANGE = "exchange.monitoracao";
    public static final String RABBITMQ_QUEUE = "queue.sensor";
    public static final String RABBITMQ_ROUTING_KEY = "temp-umid";

    /*
        Para configurar o Gmail como remetente, acesse:
        https://www.google.com/settings/security/lesssecureapps e ative 'Permitir aplicativos menos seguros'
    */
    public static final String GMAIL_SMTP = "smtp.gmail.com";
    public static final int GMAIL_PORT = 587;
    public static final String GMAIL_USERNAME = "";
    public static final String GMAIL_PASSWD = "";

    public static final String EMAIL_DESTINO = "";

}
