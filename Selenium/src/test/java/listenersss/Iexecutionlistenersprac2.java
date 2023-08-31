package listenersss;

import org.testng.annotations.Test;
import org.testng.IExecutionListener;

public class Iexecutionlistenersprac2 implements IExecutionListener {

	    @Override
	    public void onExecutionStart() {
	        System.out.println("Starting On execution test from ExecutionListener2");
	        
	    }

	    @Override
	    public void onExecutionFinish() {
	        System.out.println("Starting On execution test TestNG is finished");
	    }
	}

