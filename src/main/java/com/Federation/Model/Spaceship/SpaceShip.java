package com.Federation.Model.Spaceship;


import com.Federation.Model.Personnel.CrewMember;
import com.Federation.Model.Personnel.Specialty;


import java.util.ArrayList;

public class SpaceShip {
    float fuel = 100.0f;
    public ArrayList<CrewMember> crewList;

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
            if(crewMember.getSpecialty() != Specialty.ENGINEERING &&
                crewMember.getSpecialty() != Specialty.MAINTENANCE){
                crewMember.setMorale(crewMember.getMorale()+20);}
            else if(crewMember.getSpecialty() == Specialty.MAINTENANCE){
                crewMember.setMorale(crewMember.getMorale() + 15);}
            else if(crewMember.getSpecialty() == Specialty.ENGINEERING){
                crewMember.setMorale(crewMember.getMorale() - 10);};
        });

        return fuel;
    }

    public float refuel() {
        fuel += 50;
        crewList.forEach(crewMember -> {
            if(crewMember.getSpecialty() != Specialty.MAINTENANCE &&
                    crewMember.getSpecialty() != Specialty.TRANSPORTATION &&
                    crewMember.getSpecialty() != Specialty.SECURITY){
                crewMember.setMorale(crewMember.getMorale()-5);}
            else if(crewMember.getSpecialty()==Specialty.MAINTENANCE){
                crewMember.setMorale(crewMember.getMorale()-10);
            }else if(crewMember.getSpecialty()== Specialty.TRANSPORTATION){
                crewMember.setMorale(crewMember.getMorale() + 10 );
            }else if(crewMember.getSpecialty() == Specialty.SECURITY){
                crewMember.setMorale(crewMember.getMorale() - 20);
            }

        });

        return fuel;
    }

}
