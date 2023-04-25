package edu.guilford;

/**
 * Hello world!
 *
 */
public class User {
    public static void main( String[] args )
    {
        // call userquestions class to make a User1 password
        userquestions User1 = new userquestions();
        String User1pass = User1.getPassword();
        //print out the password
        System.out.println("User 1's unencrypted password is " + User1pass);
        // call userquestions class to make a User2 password
        userquestions User2 = new userquestions();
       String User2pass =  User2.getPassword();
         //print out the password
            System.out.println("User 2's unecrypted password is " + User2pass);
        //call AES class to encrypt the password
        String User1passEncrypted = AES.encrypt(User1pass, "password");
        String User2passEncrypted = AES.encrypt(User2pass, "password");
        //print out the encrypted password
        System.out.println("User 1's encrypted password is " + User1passEncrypted);
        System.out.println("User 2's encrypted password is " + User2passEncrypted);
        //call AES class to decrypt the password
        String User1passDecrypted = AES.decrypt(User1passEncrypted, "password");
        String User2passDecrypted = AES.decrypt(User2passEncrypted, "password");
        //print out the decrypted password
        System.out.println("User 1's decrypted password is " + User1passDecrypted);
        System.out.println("User 2's decrypted password is " + User2passDecrypted);
        
    }}




