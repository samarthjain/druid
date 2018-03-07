package io.druid.timeline;

import org.joda.time.Interval;

/**
 * Created by parth on 3/7/18.
 */
public class OverlappingSegmentsWithSameVersionException extends Exception
{
    private String version;
    private Interval segment1;

    public Interval getSegment1()
    {
        return segment1;
    }

    public Interval getSegment2()
    {
        return segment2;
    }

    private Interval segment2;

    public OverlappingSegmentsWithSameVersionException(String version, Interval segment1, Interval segment2) {
        this.version = version;
        this.segment1 = segment1;
        this.segment2 = segment2;
    }

    @Override
    public String toString()
    {
        return "OverlappingSegmentsWithSameVersionException{" +
                "version='" + version + '\'' +
                ", segment1='" + segment1 + '\'' +
                ", segment2='" + segment2 + '\'' +
                '}';
    }
}
