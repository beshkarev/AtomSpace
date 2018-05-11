package com.atomspace;

import com.atomspace.People.Administrator;
import com.atomspace.People.Human;
import com.atomspace.People.Resident;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AtomSpace atomSpace = new AtomSpace( new Administrator( ) );
        Human Nastya = new Resident( );

        ArrayList< Course > course = new ArrayList<>( );
        course.add( new Course( "JAVA", 90 ) );
//        course.add( new Course( "C++", 90 ) );
        course.add( new Course( "Artificial intelligence", 90 ) );

        Nastya.subscribe( atomSpace.getAdmin( ), course );

        attend( atomSpace.getAdmin(),
                Nastya,
                true );

        showAttendCourses( atomSpace.getAdmin().getCourses( Nastya ) );

        attend( atomSpace.getAdmin(),
                Nastya,
                false );

        showAttendCourses( atomSpace.getAdmin().getCourses( Nastya ) );

    }

    static void attend( Administrator admin,
                        Human resident,
                        boolean visit ) {
        admin.residentAttendanceCourse( resident, visit );
    }

    static void showAttendCourses( ArrayList< Course > courses ) {
        for ( Course course : courses ) {
            System.out.print( course );
            System.out.printf(" -> %b\n", course.getVisit(  ) );
        }
    }
}
