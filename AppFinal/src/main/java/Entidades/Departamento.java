/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Entidades;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Departamento {

    private int Codigo;
    private String Nome;
    ArrayList<Funcionarios> ListaFunc;

    public Departamento() {
        ListaFunc = new ArrayList();
    }

    public Departamento(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaFunc = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionarios> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionarios> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    public void addFunc(Funcionarios F){
        F.setDep(this);
        ListaFunc.add(F);
    }
}
