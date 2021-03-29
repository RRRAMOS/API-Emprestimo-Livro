package dsi_CPS;

import javax.swing.JOptionPane;

public class classificacao_prioridade4 {

	public static void main(String[] args) {
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog ("Olá! Quantos anos o(a) senhor (a) tem?"));
		    
	    if (idade <60) { 
	        JOptionPane.showMessageDialog(null, "Fila Comum "); 
	      } else { 
	        if (idade >=60 && idade <79) { 
		         JOptionPane.showMessageDialog(null, "Fila Prioritária");
	        } else {
		        	 JOptionPane.showMessageDialog(null, "Fila 80+");
	       
	    }
	  }
   }
}