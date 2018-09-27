package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutSteveJobs() throws Exception {
        assertThat(queryProcessor.process("steve jobs"), containsString("CEO"));
    }

    @Test
    public void knowsPlus() throws Exception {
        assertThat(queryProcessor.process("what is 10 plus 15"), containsString("26"));
    }

    @Test
    public void knowsLargest() throws Exception {
        assertThat(queryProcessor.process("which largest: 923, 25, 28, 778"), containsString("923"));
    }
}
