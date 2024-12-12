package com.fuzora.workflow;

import org.springframework.stereotype.Component;

import com.fuzora.service.FilterService;
import com.fuzora.service.InputService;
import com.fuzora.service.OutputService;
import com.fuzora.service.TransformerService;

@Component
public class WorkflowExecutor {

    private final InputService inputService;
    private final FilterService filterService;
    private final TransformerService transformerService;
    private final OutputService outputService;

    public WorkflowExecutor(InputService inputService, FilterService filterService,
                            TransformerService transformerService, OutputService outputService) {
        this.inputService = inputService;
        this.filterService = filterService;
        this.transformerService = transformerService;
        this.outputService = outputService;
    }

    public void executeWorkflow() {
        String data = inputService.getData();
        String filteredData = filterService.filter(data);
        String transformedData = transformerService.transform(filteredData);
        outputService.sendData(transformedData);
    }
}