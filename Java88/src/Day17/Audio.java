package Day17;

public class Audio implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		this.volume = volume;
		System.out.println("볼륨을" + this.volume + "으로 변경합니다");
	}

	@Override
	public void setMute(boolean mute) {
		if (mute)
			System.out.println("오디오를 음소거 상태로 설정합니다");
		else
			System.out.println("오디오의 음소거 상태를 해제합니다");
	}

}
