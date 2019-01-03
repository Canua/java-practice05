package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		top++;
		if (buffer.length == top) {
			String[] copybuffer = new String[top + 1];
			System.arraycopy(buffer, 0, copybuffer, 0, buffer.length);
			buffer = new String[copybuffer.length];
			System.arraycopy(copybuffer, 0, buffer, 0, copybuffer.length);
		}
		buffer[top] = s;
	}

	public String pop() throws MyStackException {
		if (!isEmpty()) {
			return buffer[top--];
		} else
			throw new MyStackException("stack is empty");
	}

	public boolean isEmpty() {
		return top == -1;
	}
}