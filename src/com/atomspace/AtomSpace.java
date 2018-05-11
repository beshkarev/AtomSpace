package com.atomspace;

import com.atomspace.People.Administrator;

public class AtomSpace {
    AtomSpace( Administrator admin ) {
        m_admin = admin;
    }

    Administrator getAdmin( ) {
        return m_admin;
    }

    private Administrator m_admin;
}
