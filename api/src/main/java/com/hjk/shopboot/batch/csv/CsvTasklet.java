package com.hjk.shopboot.batch.csv;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class CsvTasklet implements Tasklet{
    
    @Override
    public RepeatStatus execute(StepContribution contribution,ChunkContext chunkContext) throws Exception{
        log.info("executed tasklet!!");
        return RepeatStatus.FINISHED;
    }
}
