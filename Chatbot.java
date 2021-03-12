import java.util.*;
public class Chatbot {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to T22 Eats Customer Support! Are you an existing member? If yes, type 1. If not, type 2.");

		memberValidity();

		int choice = issuesmenu();

		while(choice != 6) {

			if(choice == 1) {
				System.out.println("Enter the order number with the missing food:");
				String conversation = sc.next();
				System.out.println("Thank you! Could you please tell us which items your order missed?");
				conversation = sc.next();
				System.out.println("We apologize for the inconvenience!");
				System.out.println("What course of action would you like to take?");
				System.out.println("1: Refund, 2: Talk to a real agent, 3: End the conversation");
				conversation = sc.next();
				if(Integer.parseInt(conversation) == 1 || conversation == "refund") {
					refund();
					System.out.println("\nWe hope that solved the problem!");
					System.out.println("Is there any other issue that we can help you with?\n");
					choice = issuesmenu();
				}
				else if (Integer.parseInt(conversation) == 2 || conversation == "real agent") {
					realAgent();
					choice = 7;
				}
				else {
					helpfulMessage();
					choice = 7;
				}
			}

			else if (choice == 2){
				System.out.println("Enter the order number that was late:");
				String conversation = sc.next();	
				System.out.println("Thanks! How late was the delivery? Please enter a number in minutes:");
				int time = sc.nextInt();
				if(time > 30) {
					System.out.println("\nThis delivery time is past our policy. We apologise for the inconvenience.");
					System.out.println("What course of action would you like to take?");
					System.out.println("1: Refund, 2: Talk to a real agent, 3: End the conversation");
					conversation = sc.next();
					if(Integer.parseInt(conversation) == 1 || conversation == "refund") {
						refund();
						System.out.println("\nWe hope that solved the problem!");
						System.out.println("Is there any other issue that we can help you with?\n");
						choice = issuesmenu();
					}
					else if (Integer.parseInt(conversation) == 2 || conversation == "real agent") {
						realAgent();
						choice = 7;
					}
					else {
						helpfulMessage();
						choice = 7;
					}

				}
				else {
					System.out.println("The delivery time provided is within our stated policy.");
					System.out.println("If you are unsatisfied, Chatbot suggests talking to a real agent to resolve the issue.");
					System.out.println("\nWould you like to talk to a real agent instead? If yes, please type 1, if not, type 2.");
					int realAgentReply = sc.nextInt();
					if(realAgentReply == 1) {
						realAgent();
						choice = 7;
					}
					else if(realAgentReply == 2) {
						helpfulMessage();
						choice = 7;
					}
				}
			}

			else if (choice == 3) {
				System.out.println("Enter the order number with the issue:");
				String conversation = sc.next();
				System.out.println("What seems to be the issue?");
				conversation = sc.next();
				System.out.println("\nUnderstood. We apologise for the the inconvience caused.");
				System.out.println("We are always working to ensure that our products meet our customer expectations!");
				System.out.println("What course of action would you like to take?");
				System.out.println("1: Refund, 2: Talk to a real agent, 3: End the conversation");
				conversation = sc.next();
				if(Integer.parseInt(conversation) == 1 || conversation == "refund") {
					noRefund();
					System.out.println("\nWould you like to talk to a real agent instead? If yes, please type 1, if not, type 2.");
					int realAgentReply = sc.nextInt();
					if(realAgentReply == 1) {
						realAgent();
						choice = 7;
					}
					else if(realAgentReply == 2) {
						helpfulMessage();
						choice = 7;
					}
				}
				else {
					helpfulMessage();
					choice = 7;
				}

			}

			else if (choice == 4){
				System.out.println("Enter the order number with the issue:");
				String conversation = sc.next();
				System.out.println("What is the issue that you encountered with our delivery driver?");
				conversation = sc.next();
				System.out.println("Understood! We apologize for this experience.");
				System.out.println("We would be happy to further assist you by offering a small compensation!");
				System.out.println("If you want to proceed, please type 1 to talk to a respresentative, if not, type 2.");
				conversation = sc.next();
				if(Integer.parseInt(conversation) == 1) {
					realAgent();
					choice = 7;
				}
				else if(Integer.parseInt(conversation) == 2) {
					helpfulMessage();
					choice = 7;
				}
			}

			else if (choice == 5){
				System.out.println("Chatbot doesn't have support for other problems at the moment!");
				System.out.println("Would you like to talk to a real agent instead? If yes, type 1, if not, type 2.");
				int realAgentReply = sc.nextInt();
				if(realAgentReply == 1) {
					realAgent();
					choice = 7;
				}
				else if(realAgentReply == 2) {
					helpfulMessage();
					choice = 7;
				}

			}
			
			else if (choice == 7){
				System.out.println("Is there any other issue that we can help you with?\n");
				choice = issuesmenu();
			}

			else if (choice == 0){
				System.out.println("Thank you for contacting T22 Eats Customer Support! Have a great day!");
				break;
			}
			
			else {
				break;
			}
		}

	}

	@SuppressWarnings("resource")
	public static int issuesmenu () {

		Scanner sc = new Scanner(System.in);
		System.out.println("1: missing food");
		System.out.println("2: late delivery");
		System.out.println("3: quality of food");
		System.out.println("4: delivery driver");
		System.out.println("5: other");
		System.out.println("0: exit");

		int choice = sc.nextInt();
		return choice;

	}

	@SuppressWarnings("resource")
	public static void memberValidity () {

		Scanner sc = new Scanner(System.in);	
		int registeredMember = sc.nextInt();
		if(registeredMember == 2) {
			System.out.println("Can I have your first name please?");
			String memberName = sc.next();
			System.out.println("Thank you " + memberName + ". How may we help you?\n");
			System.out.println("Please choose an option from our menu!");
		}	
		else if(registeredMember == 1) {
			System.out.println("Please provide me with your registered first name:");
			String memberName = sc.next();
			System.out.println("Welcome back " + memberName + ". How can we assist you today?\n");
			System.out.println("Please choose an option from our menu!");

		}	
		else {
			int randomResponse = (int) (Math.random()*3);
			if(randomResponse == 0) {
				System.out.println("Invalid option! Please try again!");
			}
			else if(randomResponse == 1) {
				System.out.println("Please try again with one of the numbers provided!");
			}
			else {
				System.out.println("Number not recognized, please try again with one of the numbers provided!");
			}
			memberValidity();
		}	
	}

	@SuppressWarnings("resource")
	public static void refund() {

		Scanner sc = new Scanner(System.in);
		int refundOption;
		System.out.println("We are happy to process a refund for you!");
		System.out.println("Would you like to receive the refunded amount through T22 Eats credits, or would you prefer a credit card refund? For T22 Eats credits, type 1, for a credit card refund, type 2.");
		refundOption = sc.nextInt();
		if(refundOption == 1) {
			System.out.println("Thank you! Your T22 Eats credits should appear on your account momentarily!");
		}
		else if(refundOption == 2) {
			System.out.println("Thank you! The amount refunded should appear on your bank statement within 2-5 business days!");
		}
		else {
			int randomResponse = (int) (Math.random()*3);
			if(randomResponse == 0) {
				System.out.println("Invalid option! Please try again!");
			}
			else if(randomResponse == 1) {
				System.out.println("Please try again with one of the numbers provided!");
			}
			else {
				System.out.println("Number not recognized, please try again with one of the numbers provided!");
			}
			refund();
		}
	}

	public static void noRefund() {

		System.out.println("Unfortunately, a refund is not possible for this option through Chatbot.");
		System.out.println("This is due to unpleasant instances with customers who tried to take advantage of this service!");

	}

	public static void realAgent() {

		System.out.println("\nUnderstood! You can call ##### to resolve the issue!");

	}

	public static void helpfulMessage() {

		System.out.println("We hope this was helpful!");

	}
}
