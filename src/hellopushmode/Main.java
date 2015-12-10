package hellopushmode;

import pushmode.server.PushServer;

public class Main {
	public static void main(String[] args) {
		PushServer
			.login("beta-till-dec31")
			.listen(8080)
			.map("/", HelloStream::new)
			.run();
	}
}
