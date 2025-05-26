/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register_login;

/**
 *
 * @author RC_Student_lab
 */import java.util.Random;
import java.util.ArrayList;

public class Message {
    private static int totalMessagesSent = 0;
    private String messageID;
    private String recipient;
    private String messageContent;
    private String messageHash;
    
    
    public Message(String recipient, String messageContent) {
        this.messageID = generateMessageID();
        this.recipient = recipient;
        this.messageContent= validateMessageLength(messageContent);
        this.messageHash = createMessageHash();
        totalMessagesSent++;
        
    }
       private String generateMessageID() {
        Random rand = new Random();
        return String.format("%010d", rand.nextInt(1000000000));
    }
      private String validateMessageLength(String message) {
        if (message.length() > 250) {
            return "Message exceeds 250 characters. Reduce size.";
        }
        return message;
      }
     public boolean checkRecipientCell(String recipient) {
    return recipient.length() <= 10 && recipient.startsWith("+");
}


     public String getRecipient() {
         return recipient;
     }
     private String createMessageHash() {
        return messageID.substring(0, 2) + ":" + totalMessagesSent + ":" + 
               messageContent.split(" ")[0].toUpperCase() + 
               messageContent.split(" ")[messageContent.split(" ").length - 1].toUpperCase();
    }
     public String sentMessage(String choice) {
        switch (choice.toLowerCase()) {
            case "send":
                return "Message successfully sent.";
            case "discard":
                return "Message deleted.";
            case "store":
                return "Message stored.";
            default:
                return "Invalid option.";
        }
    }
     public static void printMessages(ArrayList<Message> messages) {
        for (Message msg : messages) {
            System.out.println("ID: " + msg.messageID);
            System.out.println("Recipient: " + msg.recipient);
            System.out.println("Message: " + msg.messageContent);
            System.out.println("Message Hash: " + msg.messageHash);
            System.out.println("----------------------");
        }
    }
      public static int returnTotalMessages() {
        return totalMessagesSent;
    }

    
}
