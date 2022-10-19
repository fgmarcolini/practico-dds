package com.grupo2b.dds.tp;

import java.util.Scanner;

import com.grupo2b.dds.tp.dao.EmpresaDAOImpl;
import com.grupo2b.dds.tp.model.Empresa;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Codigo: ");
    	Integer codigo = input.nextInt();
    	
    	/*
    	System.out.println("Cuit: ");
    	Integer cuit = input.nextInt();
    	
    	input.nextLine();
    	
    	System.out.println("Nombre: ");
    	String nombre = input.nextLine();
    	
    	System.out.println("Direccion: ");
    	String direccion = input.nextLine();
    	
    	System.out.println("Email: ");
    	String email = input.nextLine();
    	
    	System.out.println("Descripcion: ");
    	String descripcion = input.nextLine();
    	
    	System.out.println("Telefono: ");
    	Integer telefono = input.nextInt();
    	*/
    	
    	//Empresa empresa = new Empresa(codigo, cuit, nombre, direccion, email, descripcion, telefono);
    	EmpresaDAOImpl test = new EmpresaDAOImpl();
    	
    	System.out.println("nombre de empresa buscada: " + test.getByID(codigo).getNombre()); 
    	
    	
    }
}
