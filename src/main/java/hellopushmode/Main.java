package hellopushmode;

import java.nio.file.*;
import pushmode.*;

public class Main {
	// PushMode politely leaves main() method in our hands.
	public static void main(String[] args) {
		// Simple development-time static content server.
		// Deployed app should use CDN or native HTTP server.
		new FileServer(8082, Paths.get("content"))
			.start();
		// PushMode server is a mere library.
		// It listens on port 8080 by default.
		PushServer
			// Trial key is free and it's good enough for development.
			// You can get production keys at pushmode.angeloflogic.com.
			.login("trial")
			// Map our only page to the root URL.
			.map("/", HelloPage::new)
			// Run until the process is killed.
			.run();
	}
}
