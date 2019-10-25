package org.atlanmod.arduino.sequential.eventengine;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect;
import org.gemoc.sequential.model.arduino.ArduinoBoard;
import org.gemoc.sequential.model.arduino.Pin;
import org.gemoc.sequential.model.arduino.Project;
import org.gemoc.sequential.model.arduino.WaitFor;


public class EventAddon implements IEngineAddon {
	int cpt = 0;
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine) {
		System.out.println("Starting Engine");
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction();
		
		
		
		Project p = (Project) engine.getExecutionContext().getResourceModel().getContents().get(0);
		ArduinoBoard board = (ArduinoBoard) p.getBoards().get(0);
		Pin pin = board.getDigitalPins().get(0);
		int pinvlue = Pin_EvaluableAspect.level(pin);
		
		if (caller instanceof WaitFor && "loop".equals(operation.getName())) {
			cpt++;
			
			if (cpt == 10) { //waited enough time
				System.out.println("now changing the signal value "+((WaitFor) caller).getPin());
				System.out.println("before: "+pinvlue);
				pinvlue ++;
				Pin_EvaluableAspect.level(pin, pinvlue);
				System.out.println("after: "+Pin_EvaluableAspect.level(pin));
			}
		}
			
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}

	
}
