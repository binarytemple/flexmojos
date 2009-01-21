package org.sonatype.flexmojos.test;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ProgressListener
    extends TestListenerAdapter
{
    @Override
    public void onTestStart( ITestResult result )
    {
        // TODO Auto-generated method stub
        super.onTestStart( result );

        System.out.println( "Running: " + result.getName() );
    }
}