package staticKeyword;

public class Main {
	public static void main(String[] args) {
		
		//Static = modifier. A single copy of a variable/method is created and shared. 
		
		Friend friend1 = new Friend("SpiderMan");
		Friend friend2 = new Friend("BatMan");
		Friend friend3 = new Friend("IronMan");


		System.out.println(Friend.numberOfFriends);
		Friend.displayFriends();
		
	}
}
