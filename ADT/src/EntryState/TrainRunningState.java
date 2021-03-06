package EntryState;

public class TrainRunningState implements TrainState{

	static TrainRunningState instance=new TrainRunningState();
	private String nowstate="高铁已从起始站发车(Running)";
	
	// inmutability类
	// Abstraction function:
	// AF(instance)=该状态的类
	// AF(nowstate)=描述计划项当前状态的字符串
	// Representation invariant:
	// 对输入的指令进行检查，不符合要求抛出异常
	// Safety from rep exposure:
	// 将instance,nowstate设置为private
	
	private TrainRunningState() {
	}

	/**
	 * 改变当前状态
	 * @param c 改变指令
	 * @return 新的状态
	 */
	@Override
	public TrainState move(char c) {
		switch(c) {
		case 'a':
			return TrainEndedState.instance;
		case 'b':
			return TrainBlockedState.instance;
		default:
			throw new IllegalArgumentException();
		}
	}

	 /**
		 * 得到当前状态
		 * @return 描述当前状态的字符串
		 */
	@Override
	public String gettrainstate() {
		return this.nowstate;
	}

}
