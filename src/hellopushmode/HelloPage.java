package hellopushmode;

import pushmode.dom.*;
import pushmode.html.*;
import pushmode.server.*;

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
				.add(Html.title()
					// Method text() will append inline text to the element.
					.text("Hello World")))
			.add(Html.body()
				// Attributes are set through a chain of fluent setters.
				.style("margin: 0; padding: 0; font-family: sans-serif")
				.add(Html.div()
					// We would normally reference CSS stylesheet, but let's keep it simple for now. 
					.style("display: flex; height: 100vh; justify-content: center; align-items: center")
					.add(Html.p()
						.style("font-size: 14vw")
						.text("Hello World!"))));
	}
}
