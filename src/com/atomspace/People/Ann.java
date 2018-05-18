package com.atomspace.People;

import java.util.Scanner;

public final class Ann extends Administrator {

    public void meeting( ) {
        System.out.println( "Are you bored? Yes/No" );

        Scanner scanner = new Scanner( System.in );
        String answer = scanner.nextLine( );
        if ( answer.equalsIgnoreCase( "Yes" ) ) {
            System.out.println( "Ну ок" );
        } else if ( answer.equalsIgnoreCase( "No" ) ) {
            System.out.println( "Огонь" );
        } else {
            System.out.println( "В смысле?" );
        }
    }

    public void presentation( ) {

    }
}
