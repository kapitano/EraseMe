package com.kevinearls.eraseme;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kearls on 4/23/14.
 */
public class StupidTest {
    protected static final Logger LOG = LoggerFactory.getLogger(StupidTest.class);

    @Test
    public void testDoingNothing() {
        LOG.info("Nothing to see here");
    }
}
