package com.atomspace;

import com.atomspace.People.Administrator;
import com.atomspace.People.Ann;
import com.atomspace.People.Human;
import com.atomspace.People.Resident;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AtomSpace atomSpace = new AtomSpace( new Ann( ) );
        Human Nastya = new Resident( );

        ArrayList< Course > course = new ArrayList<>( );
        course.add( new Course( "JAVA", 90 ) );
        course.add( new Course( "C++", 90 ) );
        course.add( new Course( "Artificial intelligence", 90 ) );

        Nastya.subscribe( atomSpace.getAdmin( ), course );

        attend( atomSpace.getAdmin(),
                Nastya,
                "C++",
                true );

        showAttendCourses( atomSpace.getAdmin().getCourses( Nastya ) );

        attend( atomSpace.getAdmin(),
                Nastya,
                "JAVA",
                true );

        showAttendCourses( atomSpace.getAdmin().getCourses( Nastya ) );

        ((Ann)atomSpace.getAdmin()).meeting( );
    }

    static void attend( Administrator admin,
                        Human resident,
                        String course_name,
                        boolean visit ) {
        admin.residentAttendanceCourse( resident, course_name, visit );
    }

    static void showAttendCourses( ArrayList< Course > courses ) {
        for ( Course course : courses ) {
            System.out.print( course );
            System.out.printf(" -> %b\n", course.getVisit(  ) );
        }
    }
}
