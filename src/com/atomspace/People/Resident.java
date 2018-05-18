package com.atomspace.People;

import com.atomspace.Course;

import java.util.ArrayList;

public class Resident implements Human {
    public void subscribe( Human admin,
                          ArrayList<Course> course ) {
        admin.subscribe( this, course );
    }

    public void unsubscribe( Human admin ) {
        admin.unsubscribe( this );
    }

    public void attendance( Administrator admin,
                            String course_name,
                            boolean visit ) {
        admin.residentAttendanceCourse( this, course_name, visit );
    }

    public ArrayList<Course> getCourses( Human human ) {
        return new ArrayList<>();
    }
}
