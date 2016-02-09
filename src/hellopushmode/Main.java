package hellopushmode;

import pushmode.server.*;

public class Main {
	// PushMode politely leaves main() method in our hands.
	public static void main(String[] args) {
		// PushMode server is a mere library.
		PushServer
			// Login to PushMode cloud. We will need this later.
			.login("beta-till-mar31")
			// PushMode is an application server, not a generic web server.
			// Let nginx take port 80/443 and proxy connections to 8080.
			.listen(8080)
			// Map our only page to the root URL.
			.map("/", HelloPage::new)
			// Run until we get killed.
			.run();
	}
}
