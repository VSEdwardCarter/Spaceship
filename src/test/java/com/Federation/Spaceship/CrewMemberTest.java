package com.Federation.Spaceship;

import com.Federation.Personnel.CrewMember;
import com.Federation.Personnel.OperationsType;
import com.Federation.Personnel.Role;
import com.Federation.Personnel.Specialty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrewMemberTest {
    CrewMember carrot = new CrewMember("Edward Carter");

    @Test
    public void testForCreationOfCrewMember(){
        CrewMember cm1 = new CrewMember("Carrot");

        assertTrue(cm1 instanceof CrewMember);
    }

    @Test
    public void testForConstructorCreation(){
        CrewMember cm1 = new CrewMember("Carrot");
        String expected = "Carrot";
        String actual = cm1.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testDefaultMoraleLevel(){
        CrewMember cm1 = new CrewMember("Carrot");
        float expected = 100.0f;
        float actual = cm1.getMorale();
        assertEquals(expected, actual);
    }

    @Test
    public void testDefaultForCrewMemberIsEntry(){
        CrewMember cm1 = new CrewMember("Carrot");
        assertEquals(Role.ENTRY, cm1.getRole());
    }

    @Test
    public void testNewRoleSetForCrewMemberIsExecutive(){
        CrewMember cm1 = new CrewMember("Carrot");
        cm1.setRole(Role.EXECUTIVE);
        assertEquals(Role.EXECUTIVE, cm1.getRole());
    }

    @Test
    public void testDefaultOperationsTypeForCrewMemberIsOnShip(){
        assertEquals(OperationsType.ONSHIP, carrot.getOperationType());
    }

    @Test
    public void testSetNewOperationsTypeForCrewMember(){
        carrot.setOperationType(OperationsType.SUPPORT);
        assertEquals(OperationsType.SUPPORT, carrot.getOperationType());
    }

    @Test
    public void testDefaultSpecialtyForCrewMemberIsCombat(){
        assertEquals(Specialty.COMBAT,carrot.getSpecialty());
    }

    @Test
    public void testSetSpecialtyCodeForCrewMember(){
        carrot.setSpecialty(Specialty.INTELLIGENCE);
        assertEquals(Specialty.INTELLIGENCE, carrot.getSpecialty());
    }

}
