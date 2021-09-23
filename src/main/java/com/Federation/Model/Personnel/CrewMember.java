package com.Federation.Model.Personnel;


import javax.persistence.*;

@Entity
@Table(name ="Crewmembers")
public class CrewMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    String name;
    float morale = 100.0f;
    private Role role = Role.ENTRY;
    private OperationsType operationsType = OperationsType.ONSHIP;
    private Specialty specialty = Specialty.COMBAT;



    public CrewMember(String name) {

    }

    public CrewMember() {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperationsType getOperationsType() {
        return operationsType;
    }

    public void setOperationsType(OperationsType operationsType) {
        this.operationsType = operationsType;
    }
}
