package com.struts.action;

public class HelloWorld {private String message;

private String userName;

public HelloWorld() {
}

public String execute() {
    setMessage("Hello " + getUserName());
    System.out.println("hello sandy say helo to me");

    System.out.println("hai sandy");

    System.out.println("hi sree");

    return "SUCCESS";
}

public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
	
	
	
	
    this.userName = userName;
}

}


