package com.Federation.Spaceship;

import com.Federation.Personnel.CrewMember;
import com.Federation.Personnel.OperationsType;
import com.Federation.Personnel.Role;
import com.Federation.Personnel.Specialty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpaceShipTest {
    SpaceShip UssCarter;

    @BeforeEach
    void setUp(){
        ArrayList<CrewMember> crewList = new ArrayList<>();
        UssCarter = new SpaceShip(crewList);
        CrewMember kiwii = new CrewMember("Kiwii Johnson");
        UssCarter.fillCrew(kiwii);
        crewList.get(0).setRole(Role.SENIOR);
        crewList.get(0).setOperationType(OperationsType.OFFSHIP);
        crewList.get(0).setSpecialty(Specialty.MAINTENANCE);
        CrewMember bob = new CrewMember("Bob Howard");
        UssCarter.fillCrew(bob);
    }

    @Test
    public void testSpaceShipCreation(){

        assertTrue(UssCarter instanceof SpaceShip);
    }

    @Test
    public void testSpaceShipDefaultFuel(){

        float expected = 100.0f;
        float actual = UssCarter.getFuel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSpaceShipTakesArrayListAndArrayListEmpty(){
        ArrayList<CrewMember> crewList = new ArrayList<>();
        SpaceShip UssCarter = new SpaceShip(crewList);
        assertTrue(UssCarter.crewList.isEmpty());
    }

    @Test
    public void testFastTravelReducesBy20(){
//        ArrayList<CrewMember> crewList = new ArrayList<>();
//        SpaceShip UssCarter = new SpaceShip(crewList);
        float expected = 80;
        UssCarter.fastTravel();
        float actual = UssCarter.getFuel();
        assertEquals(expected, actual);

    }

    @Test
    public void testFillCrewMethodLoadCrew(){
//        CrewMember kiwii = new CrewMember("Kiwii Johnson");
//        UssCarter.fillCrew(kiwii);
        System.out.println(UssCarter.crewList.get(0).getName());
        System.out.println(UssCarter.crewList.get(0).getMorale());

        assertTrue(!UssCarter.crewList.isEmpty());
    }

    @Test
    public void testFastTravelReducesCrewMoraleBy10(){
//        CrewMember kiwii = new CrewMember("Kiwii Johnson");
//        UssCarter.fillCrew(kiwii);
        UssCarter.fastTravel();
        float expected = 90;
        float actual = UssCarter.crewList.get(0).getMorale();
        assertEquals(expected, actual);
    }

    @Test
    public void testTakeItEasyReducesFuelBy5(){
        UssCarter.takeItEasy();
        float expected = 95;
        float actual = UssCarter.getFuel();
        assertEquals(expected,actual);
    }

    @Test
    public void testTakeItEasyInducesMoraleBy20(){
        UssCarter.takeItEasy();
        float expected = 120;
        float actual = UssCarter.crewList.get(0).getMorale();
        assertEquals(expected, actual);
    }

    @Test
    public void testRefuelIncreasesFuelBy10(){
        UssCarter.refuel();
        float expected = 150;
        float actual = UssCarter.getFuel();
        assertEquals(expected, actual);
    }

    @Test
    public void testRefuelDecreasesMoraleBy5(){
        UssCarter.refuel();
        float expected = 95;
        float actual = UssCarter.crewList.get(0).getMorale();
        assertEquals(expected, actual);

    }

    @Test
    public void testRefuelAffectsMaintenanceCrewMembersBy25(){
        UssCarter.refuel();
        float expected1 = 75;
        float actual1 = UssCarter.crewList.get(0).getMorale();
        assertEquals(expected1, actual1);

    }

    @Test
    public void testRefuelAffectsNonMaintenanceCrewMembersBy5(){
        UssCarter.refuel();
        float expected2 = 95;
        float actual2 = UssCarter.crewList.get(1).getMorale();
        assertEquals(expected2, actual2);
    }
}
