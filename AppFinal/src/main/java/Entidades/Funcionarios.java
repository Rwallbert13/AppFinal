/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author aluno
 */
public class Funcionarios {
    private int Matricula;
    private String Nome;
    private Departamento Dep;

    public Funcionarios() {
    }

    public Funcionarios(int Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Departamento getDep() {
        return Dep;
    }

    public void setDep(Departamento Dep) {
        this.Dep = Dep;
    }   
}
