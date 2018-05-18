package com.atomspace.People;

import java.util.Scanner;

public final class Ann extends Administrator {

    public void meeting( ) {
        System.out.println( "Are you bored? Yes/No" );

        Scanner scanner = new Scanner( System.in );

        if ( scanner.nextLine( ).equalsIgnoreCase( "Yes" ) ) {
            System.out.println( "Ну ок" );
        } else if ( scanner.nextLine( ).equalsIgnoreCase( "No" ) ) {
            System.out.println( "Огонь" );
        } else {
            System.out.println("В смысле?");
        }
    }

    public void presentation( ) {

    }
}
