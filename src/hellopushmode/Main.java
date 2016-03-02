package hellopushmode;

import pushmode.*;

public class Main {
	// PushMode politely leaves main() method in our hands.
	public static void main(String[] args) {
		// PushMode server is a mere library.
		// It listens on port 8080 by default.
		PushServer
			// Login to PushMode cloud. We will need this later.
			.login("beta-till-mar31")
			// Map our only page to the root URL.
			.map("/", HelloPage::new)
			// Run until the process is killed.
			.run();
	}
}
