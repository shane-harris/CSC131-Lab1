import java.util.*;
import java.lang.*;

public class Training {
	/* This is a training class I created for out team so that we can
	 * get familiar with Git and all know how to push and pull and commit
	 * work.
	 * 
	 * For now everyone just add a System.out statement with your name
	 * and commit and push it to the repo. This will all be on the 
	 * master branch because this project if just for our practice*/
	public static void main(String[] args){	
		System.out.println("Shane Harris");
		System.out.println("Kevin Mouayang");
		System.out.println("Connor Gaymon");
		System.out.println("Joseph Crouson");
		System.out.println("Jake Reynolds");
		System.out.println("Ian Charamuga");
		
		/*The next thing that we will practice is creating a merge conflict
		 * and how to resolve the conflict. This will require two people
		 * each time we practice. I will volunteer to be everyones partner
		 * 
		 * A Merge conflict arises when two or more programmers pull from 
		 * the repo. make different changes and both try to commit. the
		 * first to commit will see no issue but the second will need to 
		 * resolve the conflict.
		 * 
		 * I will create a for loop and then the next user will change the
		 * loop to a while loop or do while or whatever you want as long as
		 * its not the same code.
		 * */
		for(int i=0; i<5;i++) {
			System.out.format("Out is %i",i);
		}
	}
}
