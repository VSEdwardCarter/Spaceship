package com.Federation.Spaceship;


import com.Federation.Personnel.CrewMember;
import com.Federation.Personnel.Specialty;
import com.Federation.Personnel.OperationsType;
import com.Federation.Personnel.Role;


import java.util.ArrayList;

public class SpaceShip {
    float fuel = 100.0f;



    ArrayList<CrewMember> crewList;

    public SpaceShip(ArrayList<CrewMember> crewList){this.crewList = crewList;}

    public float getFuel() {return fuel;}

    public float fastTravel(){
        fuel = fuel - 20;
        crewList.forEach(member -> {member.setMorale(member.getMorale()-10);});
        return fuel;
    }

    public void fillCrew(CrewMember member){crewList.add(member);}

    public float takeItEasy() {
        fuel -= 5;
        crewList.forEach(crewMember -> {
            if(crewMember.getSpecialty() != Specialty.TRANSPORTATION){
                crewMember.setMorale(crewMember.getMorale()+20);};
        });
        crewList.forEach(crewMember -> {
            if(crewMember.getSpecialty() == Specialty.TRANSPORTATION){
                crewMember.setMorale(crewMember.getMorale() + 15);};
        });
        return fuel;
    }

    public float refuel() {
        fuel += 50;
        crewList.forEach(member -> {member.setMorale(member.getMorale()-5);});
        crewList.forEach(crewMember -> {
            if(crewMember.getSpecialty()==Specialty.MAINTENANCE){
                crewMember.setMorale(crewMember.getMorale()-20);
            }
        });
        crewList.forEach(crewMember -> {
            if(crewMember.getSpecialty()== Specialty.TRANSPORTATION){
                crewMember.setMorale(crewMember.getMorale() + 10 );
            }
        });
        return fuel;
    }

}
