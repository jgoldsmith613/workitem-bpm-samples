package com.rhc.citi;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class PrintingWorkItemHandler implements WorkItemHandler{

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		//no-op
	}

	public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
		System.out.println(workItem.getParameter("message"));
		workItemManager.completeWorkItem(workItem.getId(), null);
	}

}
