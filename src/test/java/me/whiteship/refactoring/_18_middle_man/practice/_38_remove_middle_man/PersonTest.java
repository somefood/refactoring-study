package me.whiteship.refactoring._18_middle_man.practice._38_remove_middle_man;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person keesun = new Person("keesun", new Department(nick));
        assertEquals(nick, keesun.getDepartment().getManager());
    }

}
