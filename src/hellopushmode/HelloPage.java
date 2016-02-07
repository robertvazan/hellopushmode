package hellopushmode;

import pushmode.dom.*;
import pushmode.html.*;
import pushmode.server.*;

// Every page is a class. Every page hit is a class instance.
public class HelloPage extends PushPage {
	// This is where we put our HTML "template".
	@Override public DomElement document() {
		// We can create new HTML elements through Html factory class.
		return Html.html()
			// Notice how elements are nested by calling add() on parent element.
			.add(Html.head()
				.add(Html.link()
					// Attributes are set through a chain of fluent setters.
					.rel("stylesheet")
					.type("text/css")
					// PushMode is not a file server. Our CSS is hosted elsewhere.
					.href("https://pushmode.angeloflogic.com/styles/hello.css"))
				// Link to pushmode.js, which makes all the PushMode magic happen.
				.setupPushMode()
				.add(Html.title()
					.text("Hello World")))
			.add(Html.body()
				.add(Html.div()
					.add(Html.p()
						// This method will append inline text to the element.
						.text("Hello World!"))));
	}
}
