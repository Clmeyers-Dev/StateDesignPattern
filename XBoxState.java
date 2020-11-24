import java.util.ArrayList;
import java.util.List;
public class XBoxState implements State {
	private GameConsole gameConsole;
	private static List<String> games;

	static {
	games = new ArrayList<>();
	games.add("Forza Horizon");
	games.add("Ori and the Blind Forest");
	games.add("Red Dead Redemption");
	games.add("Fortnite");
	games.add("Gears");
	games.add("Cuphead");
	}

	public XBoxState(GameConsole gameConsole) {
	this.gameConsole = gameConsole;
	}

	/**
	* display: Display home screen.
	*/
	@Override
	public void pressHomeButton() {
	System.out.println("Display Home Screen...");
	gameConsole.setState(gameConsole.getHomeState());
	}
	@Override
	public void pressNintendoButton() {
	System.out.println("Starting Nintendo...");
	gameConsole.setState(gameConsole.getNintendoState());
	}

	/**
	* display: You are already viewing Xbox
	*/
	@Override
	public void pressXBoxButton() {
	System.out.println("You are already viewing XBox...");
	gameConsole.setState(gameConsole.getXBoxState());
	}

	/**
	* display: You have to pick a gaming system to play.
	*/
	@Override
	public void pressGameButton() {
	System.out.println("You have the following games: ");
	for (String game : games) {
	System.out.println(game);
	}
}
}