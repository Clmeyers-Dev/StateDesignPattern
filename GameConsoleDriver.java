
public class GameConsoleDriver {

	public void runConsole() {
		GameConsole gameConsole = new GameConsole();
		
		gameConsole.pressNintendoButton();
		gameConsole.pressGameButton();
		gameConsole.pressXBoxButton();
		gameConsole.pressGameButton();
		gameConsole.pressHomeButton();
	}
	
	public static void main(String[] args) {
		GameConsoleDriver driver = new GameConsoleDriver();
		driver.runConsole();
	}
}
