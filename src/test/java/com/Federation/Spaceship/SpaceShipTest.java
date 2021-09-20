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
    public void printCrewList() {
        for (int i = 0; i < UssCarter.crewList.size(); i++) {
            System.out.print(UssCarter.crewList.get(i).getName() + " - ");
            System.out.print(UssCarter.crewList.get(i).getMorale() + " - ");
            System.out.print(UssCarter.crewList.get(i).getSpecialty() + " - ");
            System.out.print(UssCarter.crewList.get(i).getRole() + " - ");
            System.out.println(UssCarter.crewList.get(i).getOperationType());
        }
    }

    @BeforeEach
    void setUp(){
        ArrayList<CrewMember> crewList = new ArrayList<>();
        UssCarter = new SpaceShip(crewList);

        CrewMember jamesCarterJr = new CrewMember("James Carter Jr");
        UssCarter.fillCrew(jamesCarterJr);
        UssCarter.crewList.get(0).setSpecialty(Specialty.INTELLIGENCE);

        CrewMember jewelDCarter = new CrewMember("Jewel D. Carter");
        UssCarter.fillCrew(jewelDCarter);
        UssCarter.crewList.get(1).setSpecialty(Specialty.LEGAL);

        CrewMember jamesECarterJr  = new CrewMember("James E Carter Jr");
        UssCarter.fillCrew(jamesECarterJr);
        UssCarter.crewList.get(2).setSpecialty(Specialty.TRANSPORTATION);

        CrewMember walterCarter = new CrewMember("Walter Carter");
        UssCarter.fillCrew(walterCarter);
        UssCarter.crewList.get(3).setSpecialty(Specialty.WEAPONS);

        CrewMember gwendolynCarter = new CrewMember("Gwendolyn Carter");
        UssCarter.fillCrew(gwendolynCarter);
        UssCarter.crewList.get(4).setSpecialty(Specialty.RELIGIOUS);

        CrewMember cynthiaCarter = new CrewMember("Cynthia Carter");
        UssCarter.fillCrew(cynthiaCarter);
        UssCarter.crewList.get(5).setSpecialty(Specialty.HUMAN_RESOURCES);

        CrewMember edwardCarter = new CrewMember("Edward Carter");
        UssCarter.fillCrew(edwardCarter);
        UssCarter.crewList.get(6).setSpecialty(Specialty.COMBAT);

        CrewMember nthabisengCarter = new CrewMember("Nthabiseng Carter");
        UssCarter.fillCrew(nthabisengCarter);
        UssCarter.crewList.get(7).setSpecialty(Specialty.SUPPLY);

        CrewMember kenakoCarter = new CrewMember("Kenako Carter");
        UssCarter.fillCrew(kenakoCarter);
        UssCarter.crewList.get(8).setSpecialty(Specialty.PUBLIC_AFFAIRS);

        CrewMember kelesegoCarter = new CrewMember("Kelesego Carter");
        UssCarter.fillCrew(kelesegoCarter);
        UssCarter.crewList.get(9).setSpecialty(Specialty.SECURITY);

        CrewMember eboniCarter = new CrewMember("Eboni Carter");
        UssCarter.fillCrew(eboniCarter);
        UssCarter.crewList.get(10).setSpecialty(Specialty.ORDNANCE);

        CrewMember ezekielCarter = new CrewMember("Ezekiel Carter");
        UssCarter.fillCrew(ezekielCarter);
        UssCarter.crewList.get(11).setSpecialty(Specialty.COMMUNICATION);

        CrewMember terrenceCarter = new CrewMember("Terrence Carter");
        UssCarter.fillCrew(terrenceCarter);
        UssCarter.crewList.get(12).setSpecialty(Specialty.ENGINEERING);

        CrewMember shirleyJohnson = new CrewMember("Shirley Johnson");
        UssCarter.fillCrew(shirleyJohnson);
        UssCarter.crewList.get(13).setSpecialty(Specialty.MEDICAL);

        CrewMember dustinWillis = new CrewMember("Dustin Willis");
        UssCarter.fillCrew(dustinWillis);
        UssCarter.crewList.get(14).setSpecialty(Specialty.MAINTENANCE);


    }

    @Test
    public void testSpaceShipCreation(){
        printCrewList();
        assertTrue(UssCarter instanceof SpaceShip);
    }

    @Test
    public void testSpaceShipDefaultFuel(){

        float expected = 100.0f;
        float actual = UssCarter.getFuel();
        printCrewList();
        assertEquals(expected, actual);
    }

    @Test
    public void testSpaceShipTakesArrayListAndArrayListEmpty(){
        ArrayList<CrewMember> crewList = new ArrayList<>();
        SpaceShip UssCarter = new SpaceShip(crewList);
        printCrewList();
        assertTrue(UssCarter.crewList.isEmpty());
    }

    @Test
    public void testFastTravelReducesBy20(){

        float expected = 80;
        UssCarter.fastTravel();
        float actual = UssCarter.getFuel();
        printCrewList();
        assertEquals(expected, actual);

    }

    @Test
    public void testFillCrewMethodLoadCrew(){
        printCrewList();
        assertTrue(!UssCarter.crewList.isEmpty());
    }

    @Test
    public void testFastTravelReducesCrewMoraleBy10(){

        UssCarter.fastTravel();
        float expected = 90;
        float actual = UssCarter.crewList.get(0).getMorale();
        printCrewList();
        assertEquals(expected, actual);
    }

    @Test
    public void testTakeItEasyReducesFuelBy5(){
        UssCarter.takeItEasy();
        float expected = 95;
        float actual = UssCarter.getFuel();
        printCrewList();
        assertEquals(expected,actual);
    }

    @Test
    public void testTakeItEasyIncreasesMoraleBy20(){
        UssCarter.takeItEasy();
        float expected = 120;
        float actual = UssCarter.crewList.get(0).getMorale();
        printCrewList();
        assertEquals(expected, actual);
    }

    @Test
    public void testRefuelIncreasesFuelBy50(){
        UssCarter.refuel();
        float expected = 150;
        float actual = UssCarter.getFuel();
        printCrewList();
        assertEquals(expected, actual);
    }

    @Test
    public void testRefuelDecreasesMoraleBy5(){
        UssCarter.refuel();
        float expected = 95;
        float actual = UssCarter.crewList.get(0).getMorale();
        printCrewList();
        assertEquals(expected, actual);

    }

    @Test
    public void testRefuelAffectsMaintenanceCrewMembersBy25(){
        UssCarter.refuel();
        float expected1 = 75;
        float actual1 = UssCarter.crewList.get(14).getMorale();
        printCrewList();
        assertEquals(expected1, actual1);

    }

    @Test
    public void testRefuelAffectsNonMaintenanceCrewMembersBy5(){
        UssCarter.refuel();
        float expected2 = 95;
        float actual2 = UssCarter.crewList.get(1).getMorale();
        printCrewList();
        assertEquals(expected2, actual2);
    }
}
