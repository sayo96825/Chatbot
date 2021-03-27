package bot;

import static org.junit.Assert.assertEquals;

import java.awt.event.WindowEvent;

import org.junit.Test;

public class unittesting extends bot{
	@Test
	public void test_menuItem1() throws InterruptedException {
		bot b1 = new bot();
		String[] userinputs = {"hi", "yes", "1", "#a", "fries", "refund"};
		for(String i:userinputs) {
			b1.chatbox.setText(i);
			b1.chatbox.postActionEvent();
			Thread.sleep(1000);
		}
		String result = b1.textarea.getText();
		String expected = "Bot ->Welcome to the chat\n" +
				"Bot ->The text box to enter your text is on the right -->\n" + 
				"you ->hi\n" +
				"Bot ->Hello, Welcome to T22 Eats Customer Support! Are you an existing member?\n"+
				"you ->yes\n" +
				"Bot ->Alright Welcome to the chat. To help you, choose an option frrom this existing menu.\n"+
				"\n"+
				"Bot ->1: missing food\n" + 
				"Bot ->2: late delivery\n" + 
				"Bot ->3: quality of food\n" + 
				"Bot ->4: delivery driver\n" + 
				"Bot ->5: the app isn't working\n" + 
				"Bot ->6: other\n" + 
				"Bot ->0: exit\n" +
				"you ->1\n" +
				"Bot ->Enter the order number with the missing food: eg #a 45846\n" +  
				"you ->#a\n" +
				"Bot ->Thank you! Could you please tell us which items your order missed?\n" +  
				"you ->fries\n" +
				"Bot ->We apologize for the inconvenience!\n" + 
				"Bot ->Would you like a refund or talk to a real agent?\n" + 
				"you ->refund\n" +
				"Bot ->Understood. We will provide a refund via in app credits in an hour\n" + 
				"Bot ->I hope this solves the problem\n" + 
				"Bot ->have a great day. type menu to see the menu again\n";
		assertEquals(expected,result);
		Thread.sleep(1000);
		b1.dispatchEvent(new WindowEvent(b1, WindowEvent.WINDOW_CLOSING));
	}
	@Test
	public void test_menuItem2() throws InterruptedException{
		bot b2 = new bot();
		String[] userinputs = {"hi", "yes", "2", "#b", "an hour", "talk"};
		for(String i:userinputs) {
			b2.chatbox.setText(i);
			b2.chatbox.postActionEvent();
			Thread.sleep(1000);
		}
		String result = b2.textarea.getText();
		String expected = "Bot ->Welcome to the chat\n" +
				"Bot ->The text box to enter your text is on the right -->\n" + 
				"you ->hi\n" +
				"Bot ->Hello, Welcome to T22 Eats Customer Support! Are you an existing member?\n"+
				"you ->yes\n" +
				"Bot ->Alright Welcome to the chat. To help you, choose an option frrom this existing menu.\n"+
				"\n"+
				"Bot ->1: missing food\n" + 
				"Bot ->2: late delivery\n" + 
				"Bot ->3: quality of food\n" + 
				"Bot ->4: delivery driver\n" + 
				"Bot ->5: the app isn't working\n" + 
				"Bot ->6: other\n" + 
				"Bot ->0: exit\n" +
				"you ->2\n" +
				"Bot ->Enter the order number with the late delivery: eg #b 45846\n" +  
				"you ->#b\n" +
				"Bot ->Thank you! Could you please tell us how late the delivery was\n" +  
				"you ->an hour\n" +
				"Bot ->We apologise for the issue. would you like a rerfund or a conversation with a real agent?\n" + 
				"you ->talk\n" +
				"Bot ->Understood. call 4511284 to get the help that I can't provide.\n" + 
				"Bot ->have a great day. type menu to see the menu again\n";
		assertEquals(expected,result);
		Thread.sleep(1000);
		b2.dispatchEvent(new WindowEvent(b2, WindowEvent.WINDOW_CLOSING));
	}
	@Test
	public void test_menuItem3() throws InterruptedException{
		bot b3 = new bot();
		String[] userinputs = {"hi", "yes", "3", "#c", "it was cold", "pizza"};
		for(String i:userinputs) {
			b3.chatbox.setText(i);
			b3.chatbox.postActionEvent();
			Thread.sleep(1000);
		}
		String result = b3.textarea.getText();
		String expected = "Bot ->Welcome to the chat\n" +
				"Bot ->The text box to enter your text is on the right -->\n" + 
				"you ->hi\n" +
				"Bot ->Hello, Welcome to T22 Eats Customer Support! Are you an existing member?\n"+
				"you ->yes\n" +
				"Bot ->Alright Welcome to the chat. To help you, choose an option frrom this existing menu.\n"+
				"\n"+
				"Bot ->1: missing food\n" + 
				"Bot ->2: late delivery\n" + 
				"Bot ->3: quality of food\n" + 
				"Bot ->4: delivery driver\n" + 
				"Bot ->5: the app isn't working\n" + 
				"Bot ->6: other\n" + 
				"Bot ->0: exit\n" +
				"you ->3\n" +
				"Bot ->Enter the order number with the poor food quality: eg #c 45846\n" +  
				"you ->#c\n" +
				"Bot ->Thank you! Could you please tell us how the food wasn't up to the standards\n" +  
				"you ->it was cold\n" +
				"Bot ->We apologise! this must've ruined the experience. We can offer a partial compensation.\n" + 
				"Bot ->What items had the low quality\n" + 
				"you ->pizza\n" +
				"Bot ->Understood. We will provide in app credits to make up for the items. Thank you for letting us know.\n" + 
				"Bot ->type menu to check the menu to address another issue. Thank you\n";
		assertEquals(expected,result);
		Thread.sleep(1000);
		b3.dispatchEvent(new WindowEvent(b3, WindowEvent.WINDOW_CLOSING));
	}
	@Test
	public void test_menuItem4() throws InterruptedException{
		bot b4 = new bot();
		String[] userinputs = {"hi", "yes", "4", "#d", "they were rude"};
		for(String i:userinputs) {
			b4.chatbox.setText(i);
			b4.chatbox.postActionEvent();
			Thread.sleep(1000);
		}
		String result = b4.textarea.getText();
		String expected = "Bot ->Welcome to the chat\n" +
				"Bot ->The text box to enter your text is on the right -->\n" + 
				"you ->hi\n" +
				"Bot ->Hello, Welcome to T22 Eats Customer Support! Are you an existing member?\n"+
				"you ->yes\n" +
				"Bot ->Alright Welcome to the chat. To help you, choose an option frrom this existing menu.\n"+
				"\n"+
				"Bot ->1: missing food\n" + 
				"Bot ->2: late delivery\n" + 
				"Bot ->3: quality of food\n" + 
				"Bot ->4: delivery driver\n" + 
				"Bot ->5: the app isn't working\n" + 
				"Bot ->6: other\n" + 
				"Bot ->0: exit\n" +
				"you ->4\n" +
				"Bot ->Enter the order number with the poor food quality: eg #d 45846\n" +  
				"you ->#d\n" +
				"Bot ->Thank you! Could you please tell us what the issue was with the driver\n" +  
				"you ->they were rude\n" +
				"Bot ->That's awful. We'll get that sorted by talkking to the driver.\n" + 
				"Bot ->We'll provide in app credits to make p for the experience. Our apologies\n" + 
				"Bot ->If you are unsatisfied, type real agent to talk to a real person and futther discuss this.\n";
		assertEquals(expected,result);
		Thread.sleep(1000);
		b4.dispatchEvent(new WindowEvent(b4, WindowEvent.WINDOW_CLOSING));
	}
	@Test
	public void test_menuItem5() throws InterruptedException{
		bot b5 = new bot();
		String[] userinputs = {"hi", "yes", "5", "unresponsive"};
		for(String i:userinputs) {
			b5.chatbox.setText(i);
			b5.chatbox.postActionEvent();
			Thread.sleep(1000);
		}
		String result = b5.textarea.getText();
		String expected = "Bot ->Welcome to the chat\n" +
				"Bot ->The text box to enter your text is on the right -->\n" + 
				"you ->hi\n" +
				"Bot ->Hello, Welcome to T22 Eats Customer Support! Are you an existing member?\n"+
				"you ->yes\n" +
				"Bot ->Alright Welcome to the chat. To help you, choose an option frrom this existing menu.\n"+
				"\n"+
				"Bot ->1: missing food\n" + 
				"Bot ->2: late delivery\n" + 
				"Bot ->3: quality of food\n" + 
				"Bot ->4: delivery driver\n" + 
				"Bot ->5: the app isn't working\n" + 
				"Bot ->6: other\n" + 
				"Bot ->0: exit\n" +
				"you ->5\n" +
				"Bot ->Thank you for taking the time to provide feedback\n" +  
				"Bot ->What is wrong with the app?\n" +  
				"you ->unresponsive\n" +
				"Bot ->WOah! THat's a pain. please try reinstalling the app\n";
		assertEquals(expected,result);
		Thread.sleep(1000);
		b5.dispatchEvent(new WindowEvent(b5, WindowEvent.WINDOW_CLOSING));
	}
	@Test
	public void test_menuItem6() throws InterruptedException{
		bot b6 = new bot();
		String[] userinputs = {"hi", "yes", "6", "real agent"};
		for(String i:userinputs) {
			b6.chatbox.setText(i);
			b6.chatbox.postActionEvent();
			Thread.sleep(1000);
		}
		String result = b6.textarea.getText();
		String expected = "Bot ->Welcome to the chat\n" +
				"Bot ->The text box to enter your text is on the right -->\n" + 
				"you ->hi\n" +
				"Bot ->Hello, Welcome to T22 Eats Customer Support! Are you an existing member?\n"+
				"you ->yes\n" +
				"Bot ->Alright Welcome to the chat. To help you, choose an option frrom this existing menu.\n"+
				"\n"+
				"Bot ->1: missing food\n" + 
				"Bot ->2: late delivery\n" + 
				"Bot ->3: quality of food\n" + 
				"Bot ->4: delivery driver\n" + 
				"Bot ->5: the app isn't working\n" + 
				"Bot ->6: other\n" + 
				"Bot ->0: exit\n" +
				"you ->6\n" +
				"Bot ->Check up with a real agent by typing real agent to get stuff fixed that idk how to\n" +
				"you ->real agent\n" +
				"Bot ->Understood. call 4511284 to get the help that I can't provide.\n" +  
				"Bot ->have a great day. type menu to see the menu again\n";
		assertEquals(expected,result);
		Thread.sleep(1000);
		b6.dispatchEvent(new WindowEvent(b6, WindowEvent.WINDOW_CLOSING));
	}
	
	
}
