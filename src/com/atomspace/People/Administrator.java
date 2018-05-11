package com.atomspace.People;

import com.atomspace.Course;

import java.util.ArrayList;
import java.util.HashMap;

public class Administrator implements Human {

    public Administrator( ) {
        m_residents = new HashMap<>( );
    }

    public void subscribe( Human resident,
                    ArrayList<Course> courses ) {
        m_residents.put( resident, courses );
    }

    public void unsubscribe( Human resident ) {
        m_residents.remove( resident );
    }

    public void residentAttendanceCourse( Human resident,
                                          boolean visit ) {
        for ( Course course :  m_residents.get( resident ) ) {
            course.setVisit( visit );
        }
    }

    public ArrayList<Course> getCourses( Human human ) {
        return m_residents.get( human );
    }

    private HashMap< Human,
            ArrayList<Course> > m_residents;
}
