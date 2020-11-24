/**
 * @author chris
 *
 */
public class GameConsole  {
private State HomeState;
private State NintendoState;
private State xBoxState;
private State state;

/**
 * 
 */
public GameConsole() {
	HomeState = new HomeState(this);
	NintendoState = new NintendoState(this);
	xBoxState = new XBoxState(this);
	state = HomeState;
	System.out.println("Starting up the Game Console");
}
public void pressHomeButton() {
	state.pressHomeButton();
	System.out.println();
}

public void pressNintendoButton() {
	state.pressNintendoButton();
	System.out.println();
}
public void pressXBoxButton() {
	state.pressXBoxButton();
	System.out.println();
}
public void pressGameButton() {
	state.pressGameButton();
	System.out.println();
}
/**
 * @param state the state to set
 */
public void setState(State state) {
	this.state = state;
}

/**
 * @return the homeState
 */
public State getHomeState() {
	return HomeState;
}



/**
 * @return the nintendoState
 */
public State getNintendoState() {
	return NintendoState;
}
/**
 * @return the xBoxState
 */
public State getXBoxState() {
	return xBoxState;
}


}
