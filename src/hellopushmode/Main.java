package hellopushmode;

import pushmode.server.*;

public class Main {
	public static void main(String[] args) {
		PushServer
			.login("beta-till-mar31")
			.listen(8080)
			.map("/", HelloStream::new)
			.run();
	}
}
