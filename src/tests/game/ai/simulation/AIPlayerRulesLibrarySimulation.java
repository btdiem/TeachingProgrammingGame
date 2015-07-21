package tests.game.ai.simulation;

import game.ai.shared.player.AIPlayer;
import game.ai.shared.player.factory.TwoAIPairsPlayerFactory;
import game.ai.shared.player.factory.HumanAIPairsPlayerFactory;
import game.ai.shared.player.specification.PairsPlayerSpecification;
import game.ai.shared.rules.RulesFactory;

/**
 * This class is used to simulate the library of rules are assigned to different {@link AIPlayer} </br>
 * These rules are generated by system and they are subset of standard rules </br>
 * The simulation will create 2 pairs of {@link AIPlayer} and every {@link AIPlayer} has their rules and can play together </br>
 * @author btdiem
 * @version 1.0 
 */
public class AIPlayerRulesLibrarySimulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DateHeader.dateString());
		/**
		 * PairsPlayer 1: AI and AI
		 */
		PairsPlayerSpecification pairs1 = TwoAIPairsPlayerFactory.getInstance().createPairsPlayer();
		System.out.println("Pairs 1:");
		System.out.println(pairs1.toString());
		((AIPlayer)pairs1.getFirstPlayer()).applyCommandChain(RulesFactory.getInstance().createRandomRules());
		System.out.println("The first player's rules:");
		System.out.println(((AIPlayer)pairs1.getFirstPlayer()).getCommandChain().toString());
		((AIPlayer)pairs1.getSecondPlayer()).applyCommandChain(RulesFactory.getInstance().createRandomRules());
		System.out.println("The second player's rules:");
		System.out.println(((AIPlayer)pairs1.getSecondPlayer()).getCommandChain().toString());
		/**
		 * PairsPlayer 2: Human and AI
		 */
		PairsPlayerSpecification pairs2 = HumanAIPairsPlayerFactory.getInstance().createPairsPlayer();
		System.out.println("Pairs 2: ");
		System.out.println(pairs2.toString());
		((AIPlayer)pairs2.getSecondPlayer()).applyCommandChain(RulesFactory.getInstance().createRandomRules());
		System.out.println("The second player's rules:");
		System.out.println(((AIPlayer)pairs2.getSecondPlayer()).getCommandChain().toString());

	}

}