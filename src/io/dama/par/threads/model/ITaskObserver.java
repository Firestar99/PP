package io.dama.par.threads.model;

import pp_01_04_TaskObserver.io.dama.par.threads.model.ITask;

public interface ITaskObserver {
	
	public void inform(ITask changed);
}
