package com.wzx.command;

public interface Command {
	void execute();
}

/**
 * ����ʵ����
 * @author wzx
 *
 */
class CommandImpl implements Command{
	Receiver receiver;
		
	public CommandImpl(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		receiver.action();
		
	}
	
}

