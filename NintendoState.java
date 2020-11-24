import java.util.ArrayList;
import java.util.List;
public class NintendoState implements State {
	private GameConsole gameConsole;
	private static List<String> games;

	static {
	games = new ArrayList<>();
	games.add("The Legends of Zelda");
	games.add("Super Smash Bros");
	games.add("Super Mario");
	games.add("Mario Kart");
	games.add("Animal Crossing");
	games.add("Pokemon");
	}

	public NintendoState(GameConsole gameConsole) {
	this.gameConsole = gameConsole;
	}

	/**
	* display: Display Home Screen
	*/
	@Override
	public void pressHomeButton() {
	System.out.println("Display Home Screen");
	gameConsole.setState(gameConsole.getHomeState());
	}

	/**
	* display: You are already viewing Nintendo
	*/
	@Override
	public void pressNintendoButton() {
	System.out.println("You are already viewing Nintendo");
	gameConsole.setState(gameConsole.getNintendoState());
	}

	/**
	* display: Starting XBox...
	*/
	@Override
	public void pressXBoxButton() {
	System.out.println("Starting XBox...");
	gameConsole.setState(gameConsole.getXBoxState());
	}
	/**
	* display: You have the following games and the list of games
	*/
	@Override
	public void pressGameButton() {
	System.out.println("You have the following games: ");
	for (String game : games) {
	System.out.println(game);
	}
}
	}

	
