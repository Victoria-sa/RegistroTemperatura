package com.cursoceat.controller;
import java.io.File;
import java.util.Scanner;
import com.cursoceat.xml.schema.RegistroT;
import com.cursoceat.xml.schema.RegistroT.LeerT;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller {

	public static void main(String[] args)throws JAXBException {
		// TODO Auto-generated method stub
		medicion ();
		int menu = 0;
		boolean salir=false;
		Scanner lector=new Scanner(System.in);
		
		while(salir==false) {
		System.out.println("1.Registrar medicion");
		
		System.out.println("2.Leer Mediciones");
		
		System.out.println("3.salir");
		menu=lector.nextInt();
		if (menu==1) {medicion();}
		if (menu==2) {leer();}
		if (menu==3) {salir = true;}
		
		}
 		
	}
	public static void medicion () throws JAXBException{
		RegistroT miRegistroT=new RegistroT();
		LeerT leer1=new LeerT();
		leer1.setFecha("09-05-2023");
		leer1.setTMax("32º");
		leer1.setTMin("12º");
		miRegistroT.getLeerT().add(leer1);
		
		LeerT leer2=new LeerT();
		leer2.setFecha("10-05-2023");
		leer2.setTMax("30º");
		leer2.setTMin("10º");
		miRegistroT.getLeerT().add(leer2);
		

		LeerT leer3=new LeerT();
		leer3.setFecha("11-05-2023");
		leer3.setTMax("29º");
		leer3.setTMin("11º");
		miRegistroT.getLeerT().add(leer3);
		
		JAXBContext miContexto=JAXBContext.newInstance(RegistroT.class);
		Marshaller miLectura=miContexto.createMarshaller();
		miLectura.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//miLectura.marshal(miRegistroT,System.out);
		miLectura.marshal(miRegistroT, new File("C:\\Users\\PROGRAMACION\\Desktop\\RegistroT.xml"));

	}

	public static void leer() throws JAXBException{
		JAXBContext miContexto=JAXBContext.newInstance(RegistroT.class);
		Unmarshaller miLectura=miContexto.createUnmarshaller();
		RegistroT miRegistroT=(RegistroT)miLectura.unmarshal(new File("C:\\Users\\PROGRAMACION\\Desktop\\RegistroT.xml"));
		for(LeerT s:miRegistroT.getLeerT()) {
			System.out.println(s.getFecha());
			System.out.println(s.getTMax());
			System.out.println(s.getTMin());
			System.out.println("____________________");
						
		}
	}
}
