package hellopushmode;

import pushmode.*;
import pushmode.dom.*;
import pushmode.html.*;

// Every distinct page on the site usually gets its own class.
public class HelloPage extends PushPage {
	// This is where we put our HTML "template".
	@Override public DomElement document() {
		// We can create new HTML elements through Html factory class.
		return Html.html()
			// Notice how elements are nested by calling add() on parent element.
			.add(Html.head()
				// Insert link to pushmode.js, which makes all the PushMode magic happen.
				.setupPushMode()
				.add(Html.link()
					// Attributes are set through a chain of fluent setters.
					.rel("stylesheet")
					.type("text/css")
					.href("http://localhost:8082/styles/style.css"))
				.add(Html.title()
					// Method text() will append inline text to the element.
					.text("Hello World")))
			.add(Html.body()
				.add(Html.div()
					.add(Html.p()
						.text("Hello World!"))));
	}
}
