package ejemplopersona;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;


public class FormulariosFrame extends JFrame{
    
   MetodosPersona captura = new MetodosPersona();
   Metodosasignatura ma = new Metodosasignatura();
   
     JLabel lb_curso=new JLabel("Curso");
     JLabel lb_horas=new JLabel("Horas");
     JLabel lb_creditos=new JLabel("Creditos");
     JLabel lb_docente=new JLabel("Docente");
     
     JTextField txt_curso=new JTextField();
     JTextField txt_horas=new JTextField();
     JTextField txt_creditos=new JTextField();
     JTextField txt_docente=new JTextField();
     
     JLabel lb_nombre=new JLabel("Nombre");
     JLabel lb_apPaterno=new JLabel("A. Paterno");
     JLabel lb_apMaterno=new JLabel("A. Materno");
     
     
     JTextField txt_nombre=new JTextField();
     JTextField txt_apPaterno=new JTextField();
     JTextField txt_apMaterno=new JTextField();
     
     
     JMenuItem menumantbuscar = new JMenuItem() ; 
     
     JPanel pn1=new JPanel(new GridLayout(1,2) );
     
     public FormulariosFrame(){
     
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenu menumant = new JMenu();
        JMenu menureporte = new JMenu() ;
        JMenuItem menureportevisualizar = new JMenuItem();
        JMenuItem menuFileExit = new JMenuItem();
        JMenuItem menumantingresar = new JMenuItem("") ; 
        JMenuItem menumantingresarAsignatura = new JMenuItem("") ; 
        JMenuItem menumanteliminar = new JMenuItem() ; 
        JMenuItem menureporteautor = new JMenuItem() ; 
        JMenuItem menureportegenero = new JMenuItem() ; 
        JMenuItem menureporteedicion = new JMenuItem() ; 
        JMenuItem menureportegeneral = new JMenuItem() ; 
        
        
        
        
        menuFile.setText("File");        
        menuFileExit.setText("Exit");
        menureporte.setText("Reporte");
        menureportegeneral.setText(" General");       
        
        menumant.setText("Mantenimiento");
        menumantingresar.setText("Ingresar Persona");
        menumantingresarAsignatura.setText("Ingresar Curso");
         
        menumantingresar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                              
                JPanel pn1=new JPanel(new GridLayout(1,2) );
                pn1.add(lb_curso);
                pn1.add(txt_curso);
                                 
                JPanel pn2=new JPanel(new GridLayout(1,2));
                pn2.add(lb_horas);
                pn2.add(txt_horas);
                
                JPanel pn3=new JPanel(new GridLayout(1,2));
                pn3.add(lb_creditos);
                pn3.add(txt_creditos);
                
                JPanel pn4=new JPanel(new GridLayout(1,2));
                pn4.add(lb_docente);
                pn4.add(txt_docente);
                
                                          
            Object msg []={pn1,pn2,pn3,pn4};
                
                
      if(JOptionPane.showOptionDialog(null,msg,"ingresar curso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){
      
      	        Datosasignatura d= new Datosasignatura();
                d.setCurso(txt_curso.getText());
                d.setHoras(Double.parseDouble(txt_horas.getText()));
                d.setCreditos(Double.parseDouble(txt_creditos.getText()));
                d.setDocente(txt_docente.getText());
     	  	ma.ingresar(d); 	
                
		JOptionPane.showMessageDialog(null,"Se Agrego el Curso con Exito !!","Ingreso de Personas",JOptionPane.INFORMATION_MESSAGE);
	
	          }      	
                   
                }
            }
        ); 
        
        
        menumantingresar.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                              
                JPanel pn1=new JPanel(new GridLayout(1,2) );
                pn1.add(lb_nombre);
                pn1.add(txt_nombre);
                                 
                JPanel pn2=new JPanel(new GridLayout(1,2));
                pn2.add(lb_apPaterno);
                pn2.add(txt_apPaterno);
                
                JPanel pn3=new JPanel(new GridLayout(1,2));
                pn3.add(lb_apMaterno);
                pn3.add(txt_apMaterno);
                
                
                
                                          
            Object msg []={pn1,pn2,pn3};
                
                
      if(JOptionPane.showOptionDialog(null,msg,"ingresar Persona",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){
      
      	/*
	      	datos v =new datos();      	
	      	v.autor=txt_autor.getText();
	      	v.codigo=txt_code.getText();
	      	v.genero=txt_genero.getText();
	      	v.edicion=txt_edicion.getText();
     	  	v.precio = txt_precio.getText();
         */
                DatosPersona v= new DatosPersona();
                v.setNombre(txt_nombre.getText());
                v.setApPaterno(txt_apPaterno.getText());
                v.setApMaterno(txt_apMaterno.getText());
     	  	captura.ingresar(v); 	
                
		JOptionPane.showMessageDialog(null,"Se Agrego Persona Con Exito !!","Ingreso de Personas",JOptionPane.INFORMATION_MESSAGE);
	
	          }      	
                   
                }
            }
        ); 
        
         
         
         
        
         menuFile.add(menuFileExit);
        
        
        menumant.add(menumantingresar);
        menumant.add(menumantingresarAsignatura);
        menumant.add(menumanteliminar);
        
        
        
        menureporte.add(menureporte);       
      
        menuBar.add(menuFile);
        menuBar.add(menumant); 
        menuBar.add(menureporte);
           
        
           
        setTitle("EXPOSICION POO");
        setJMenuBar(menuBar);
        setSize(new Dimension(600, 500));
        
        
        
         
     } 
    
}
