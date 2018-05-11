package com.atomspace;

public class Course {
    Course( String name, int duration ) {
        m_course_name = name;
        m_duration = duration;
    }

    public String getName( ) {
        return m_course_name;
    }

    public int getDuration( ) {
        return m_duration;
    }

    public void setVisit( boolean visit ) {
        m_visited = visit;
    }

    public boolean getVisit() {
        return m_visited;
    }

    @Override
    public String toString() {
        return m_course_name;
    }

    private String m_course_name;
    private int m_duration;
    private boolean m_visited;
}
