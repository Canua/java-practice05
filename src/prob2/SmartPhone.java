	package prob2;

public class SmartPhone extends MusicPhone {
	
	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	@Override
	public void execute(String function) {
		if (function.equals("앱")) {
			runApp();
			return;
		}
		super.execute(function);
	}

	protected void runApp() {
		System.out.println("앱실행");
	}

}
