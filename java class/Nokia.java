import java.util.Scanner;
 

  public class Nokia {
 public static void main(String[] args) {
   
Scanner input = new Scanner(System.in);
   
  System.out.println("nokia phone\n1. phone book\n2. messages\n3. chat\n4. call register");
     int nokia = input.nextInt();
      switch(nokia) {
       case 1:
        System.out.println("1. search\n2. servise Nos\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. send b'card\n8 options\n9. Speed dials\n10. Voice tags");
         int options = input.nextInt();
          switch(options){
           case 1:
            System.out.println("search");
             break;
	   case 2:
            System.out.println("service Nos");
	     break;
	   case 3:
	    System.out.println("Add name");
	     break;
	   case 4:
	     System.out.println("Erase");
             break;
           case 5:
              System.out.println("Edit");
             break;
	    case 6:
              System.out.println("Assign tone");
             break;
             case 7:
              System.out.println("Send b'card");
             break;
          case 8: 
           System.out.println("1. Type of view\n2. Memory status");
         break;
           case 9:
              System.out.println("Speed dials");
             break;
               case 10:
              System.out.println("Voice tags");
             break;
         }break;
     case 2:
      System.out.println("1. write message\n2. inbox\n3. outbox\n4. picture messages\n5. Templates\n6. Smileys\n7. message settings\n8.info service\n9. Voice mailbox number\n10. Service command editor");
      int messages = input.nextInt();
       switch(messages) {
        case 1: 
          System.out.println("Write message");
         break;
         case 2: 
          System.out.println("Inbox");
         break;
          case 3: 
          System.out.println("Outbox");
         break;
          case 4: 
          System.out.println("Picture message");
         break;
          case 5: 
          System.out.println("Templates");
         break;
           case 6: 
          System.out.println("Smileys");
         break;
          case 7: 
          System.out.println("Message setting\n1. Set1\n   1. Message centre number\n   2. Message sent as\n   3. Message validity\n2. Common\n   1.Delivery reports\n   2. Reply via same centre\n   3. Character support");
          break;
           case 8:
           System.out.println("info service");
            break;
            case 9:
           System.out.println("Voice mailbox number");
            break;
            case 10:
            System.out.println("Service command editor");
             break;
             }break;
             case 3:
               System.out.println("chat");
              break;
             case 4:
                System.out.println("1. Missed calls\n2. Receives calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost setting\n8. prepaid credit ");
         
            int register = input.nextInt();
             switch(register) {
            case 1:
             System.out.println("miss calls");
              break;
             case 2:
              System.out.println("Receive calls");
              break;
               case 3:
              System.out.println("Dialled numbers");
              break;
                 case 4:
              System.out.println("Erase recent call lists");
              break;
                case 5:
              System.out.println("1. last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear timers");
              break;
                case 6:
              System.out.println("1. last call cost\n2. All Calls cost\n3. Clare counters");
              break;
                 case 7:
              System.out.println("1. Call cost limit\n2. Show costs in");
              break;
                  case 8:
              System.out.println("Prepaid credit");
              break;




}


	
}
}

}
      
  