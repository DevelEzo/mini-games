package States;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class manager extends state {

	// manager
		public ArrayList<state> states = new ArrayList<state>();
		public int state = 0;
	
	@Override
	public void render(Graphics2D g) {
		// state
			states.get(state).render(g);
	}

	@Override
	public void update() {
		// state
			states.get(state).update();

	}

}
