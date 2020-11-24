
public class HomeState implements State {
private GameConsole gameConsole = new GameConsole();

	public HomeState(GameConsole gameConsole) {
	// TODO Auto-generated constructor stub
		this.gameConsole = gameConsole;
}

	

	@Override
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("You are already on the home screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}

	@Override
	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}

	@Override
	public void pressXBoxButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}

	@Override
	public void pressGameButton() {
		// TODO Auto-generated method stub
		System.out.println("You have to pick a gaming system to play");
	}

}
