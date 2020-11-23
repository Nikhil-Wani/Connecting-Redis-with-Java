/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redisdemo;
import redis.clients.jedis.Jedis;
/**
 *
 * @author Nikhil
 */
public class Redisdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
   
        try{
            //connection
            Jedis jedis = new Jedis ("localhost");
            System.out.println("Connecttion Successfull");
            //ping
            System.out.println("Server Ping : "+jedis.ping());
            //lists
            System.out.println("list push one two : "+jedis.lpush("apple", "cake"));
            System.out.println("list pop one : "+jedis.lpop("apple"));
            //sets
            System.out.println("list push one two : "+jedis.sadd("apple", "cake"));
            System.out.println("list pop one : "+jedis.spop("apple"));
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
