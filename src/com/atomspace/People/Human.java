package com.atomspace.People;

import com.atomspace.Course;

import java.util.ArrayList;

public interface Human {
    void subscribe( Human human, ArrayList<Course> courses );
    void unsubscribe( Human human );
    ArrayList<Course> getCourses( Human human );
}
