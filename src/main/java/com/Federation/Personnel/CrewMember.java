package com.Federation.Personnel;

public class CrewMember {
    String name;
    float morale = 100.0f;
    private Role role = Role.ENTRY;
    private OperationsType operationsType = OperationsType.ONSHIP;
    private Specialty specialty = Specialty.COMBAT;

    public CrewMember(String name){
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public float getMorale() {
        return morale;

    }

    public void setMorale(float morale) {
        this.morale = morale;
    }

    public void setRole(Role Role){
        this.role = Role;
    }

    public Role getRole(){
        return role;
    }

    public void setOperationType(OperationsType OperationType){
        this.operationsType = OperationType;
    }

    public OperationsType getOperationType(){
        return operationsType;
    }

    public Specialty getSpecialty(){
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
