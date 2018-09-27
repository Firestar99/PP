package pp_01_04_TaskObserver.io.dama.par.threads.model;

public interface ITaskObserver {
	
	public void inform(ITask changed);
}
