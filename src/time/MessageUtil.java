package time;

public class MessageUtil {
	private String message;

	public MessageUtil(String message) {
		super();
		this.message = message;
	}

	public void printMessage() {
		System.out.println(message);

		while (true)
			;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
