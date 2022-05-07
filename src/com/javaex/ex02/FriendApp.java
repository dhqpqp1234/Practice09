package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    
    ArrayList<String> friends = new ArrayList();	
    
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("찬구 3명 등록해 주세요");
    for(int i=0; i<4; i++) {
    	String friend = sc.nextLine();
    	friends.add(friend);
    }
    for(int i=0; i<friends.size(); i++) {
    	System.out.println(friends.get(i).toString());
    }
    
    
    sc.close();
    	
    	
    }

}
