package hellopushmode;

import pushmode.dom.DomElement;
import pushmode.html.Html;
import pushmode.server.PushStream;

public class HelloStream extends PushStream {
	@Override public DomElement document() {
		return Html.html()
			.add(Html.head()
				.add(Html.link()
					.rel("stylesheet")
					.type("text/css")
					.href("https://pushmode.angeloflogic.com/styles/hello.css")
				)
				.setupPushMode()
				.add(Html.title()
					.text("Hello World")
				)
			)
			.add(Html.body()
				.add(Html.div()
					.add(Html.p()
						.text("Hello World!")
					)
				)
			);
	}
}
