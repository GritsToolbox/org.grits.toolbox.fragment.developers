package org.grits.toolbox.core.log;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Priority;

public class GritsLogAppender 
{
    public static ConsoleAppender createAppender()
    {
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setName("ConsoleLogger");
        return consoleAppender;
    }

    public static Priority getDefaultThreshold()
    {
        return Level.ALL;
    }

    public static int getGritsLoggingLevel()
    {
        return Level.DEBUG_INT;
    }

    public static int getNonGritsLoggingLevel()
    {
        return Level.INFO_INT;
    }
}
