package exception;

public class MessageUtil {
	private String message;

	public MessageUtil(String message) {
		super();
		this.message = message;
	}

	public void printMessage() {
		System.out.println(message);

		int a = 0;
		int b = 1 / a;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
