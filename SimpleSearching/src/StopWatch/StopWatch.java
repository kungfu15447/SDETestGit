/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StopWatch;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Frederik Jensen
 */
public class StopWatch
{ 
    private long elapsedTime;
    private Instant startTime;
    private boolean isRunning;

    public StopWatch()
    {
        elapsedTime = 0;
        isRunning = false;
    }

    public void start()
    {
        if (!isRunning)
        {
            isRunning = true;
            startTime = Instant.now();
        }

    }

    public void stop()
    {
        if (isRunning)
        {
            isRunning = false;
            Instant endTime = Instant.now();
            elapsedTime = Duration.between(startTime, endTime).toMillis();
        }
    }
    
    public long getElapsedTime() {
        if (isRunning) {
            Instant endTime = Instant.now();
            elapsedTime = Duration.between(startTime, endTime).toMillis();
            return elapsedTime;
        } else {
            return elapsedTime;
        }
    }

    public void reset()
    {
        elapsedTime = 0;
        isRunning = false;
    }
}
