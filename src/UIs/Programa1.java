 package UIs;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import Funciones.Interfaz;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa1 extends JPanel {

	private static final long serialVersionUID = -9097426163847681658L;

	private JTextField CantidadIng;
	private JTextField CarnetIng;
	private JTextField NombreIng;
	private JTextField IPIng;
	private JTextField IIPIng;
	private JTextField ProyIng;
	
	public int N,Tam,i;
	public String[] Carnet;
	public String[] Nombres;
	public int[] IPs;
	public int[] IIPs;
	public int[] Sists;
	public int[] Proys;
	public int[] NotasFinales;
	private JTextField SistIng;
	JTable table;
	public Programa1(Interfaz interfaz) {
		String[] encabezado= {"Carnet","Nomb. & Apell.","IP","IIP","Sist","Proy","N.F"};
		setBounds(0,0,750,600);
		setVisible(true);
		setBackground(new Color(249, 248, 246));
		setLayout(null);

        DefaultTableModel model = new DefaultTableModel();
        
        for(String st:encabezado) {
        	model.addColumn(st);
        }
        
        table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(450,63));
        table.setFillsViewportHeight(true);

        JScrollPane js=new JScrollPane(table);
        js.setBounds(47, 273, 660, 265);
        js.setVisible(true);
        add(js);
      

		
		
		JLabel CantidadLbl = new JLabel("Cantidad de estudiantes a ingresar:");
		CantidadLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CantidadLbl.setBounds(66, 78, 390, 36);
		add(CantidadLbl);
		
		CantidadIng = new JTextField();
		CantidadIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CantidadIng.setBounds(466, 78, 86, 36);
		add(CantidadIng);
		CantidadIng.setColumns(10);
		
		JLabel CarnetLbl = new JLabel("Carnet:");
		CarnetLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CarnetLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CarnetLbl.setBounds(29, 125, 139, 36);
		add(CarnetLbl);
		
		JLabel NombreLbl = new JLabel("Apellidos y nombres:");
		NombreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		NombreLbl.setBounds(178, 125, 252, 36);
		add(NombreLbl);
		
		JLabel IPLbl = new JLabel("IP:");
		IPLbl.setHorizontalAlignment(SwingConstants.CENTER);
		IPLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		IPLbl.setBounds(440, 125, 59, 36);
		add(IPLbl);
		
		JLabel IIPLbl = new JLabel("IIP:");
		IIPLbl.setHorizontalAlignment(SwingConstants.CENTER);
		IIPLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		IIPLbl.setBounds(509, 125, 59, 36);
		add(IIPLbl);
		
		JLabel ProyLbl = new JLabel("PROY:");
		ProyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ProyLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ProyLbl.setBounds(639, 125, 80, 36);
		add(ProyLbl);
		
		CarnetIng = new JTextField();
		CarnetIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CarnetIng.setColumns(10);
		CarnetIng.setBounds(29, 162, 139, 36);
		add(CarnetIng);
		
		NombreIng = new JTextField();
		NombreIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NombreIng.setColumns(10);
		NombreIng.setBounds(178, 162, 252, 36);
		add(NombreIng);
		
		IPIng = new JTextField();
		IPIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IPIng.setColumns(10);
		IPIng.setBounds(440, 162, 59, 36);
		add(IPIng);
		
		IIPIng = new JTextField();
		IIPIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IIPIng.setColumns(10);
		IIPIng.setBounds(509, 162, 59, 36);
		add(IIPIng);
		
		ProyIng = new JTextField();
		ProyIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ProyIng.setColumns(10);
		ProyIng.setBounds(648, 162, 59, 36);
		add(ProyIng);
		
		JButton Programa1Boton = new JButton("Programa 1");
		Programa1Boton.setEnabled(false);
		Programa1Boton.setBounds(107, 11, 109, 23);
		add(Programa1Boton);
		
		JButton Programa2Boton = new JButton("Programa 2");

		Programa2Boton.setBounds(507, 11, 109, 23);
		add(Programa2Boton);
		
		JButton IngresarBtn = new JButton("Ingresar");
		IngresarBtn.setBounds(66, 209, 89, 23);
		add(IngresarBtn);
		
		JButton MostrarBtn = new JButton("Mostrar");

		MostrarBtn.setBounds(367, 209, 89, 23);
		add(MostrarBtn);
		
		JButton EstablecerBtn = new JButton("Establecer");
		EstablecerBtn.setBounds(583, 68, 98, 23);
		add(EstablecerBtn);
		
		JButton ReiniciarBtn = new JButton("Reiniciar");

		ReiniciarBtn.setBounds(583, 91, 98, 23);
		add(ReiniciarBtn);
		
		JButton EliminarBtn = new JButton("Eliminar");

		EliminarBtn.setBounds(66, 239, 89, 23);
		add(EliminarBtn);
		
		JButton BuscarBtn = new JButton("Buscar");

		BuscarBtn.setBounds(264, 209, 89, 23);
		add(BuscarBtn);
		
		JButton PromedioBtn = new JButton("<html> &ensp; Promedio<br>de asignatura </html>");

		PromedioBtn.setBounds(466, 209, 119, 37);
		add(PromedioBtn);
		
		JButton MejorEstudianteBtn = new JButton("<html> &ensp; Mejor<br>estudiante </html>");

		MejorEstudianteBtn.setBounds(595, 209, 86, 37);
		add(MejorEstudianteBtn);
		
		JLabel SistLbl = new JLabel("Sist:");
		SistLbl.setHorizontalAlignment(SwingConstants.CENTER);
		SistLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		SistLbl.setBounds(578, 125, 59, 36);
		add(SistLbl);
		
		SistIng = new JTextField();
		SistIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SistIng.setColumns(10);
		SistIng.setBounds(579, 162, 59, 36);
		add(SistIng);
		
		ReiniciarBtn.setEnabled(false);
		IngresarBtn.setEnabled(false);
		EliminarBtn.setEnabled(false);
		BuscarBtn.setEnabled(false);
		MostrarBtn.setEnabled(false);
		PromedioBtn.setEnabled(false);
		MejorEstudianteBtn.setEnabled(false);
		
		JButton ModificarBtn = new JButton("Modificar");

		ModificarBtn.setEnabled(false);
		ModificarBtn.setBounds(165, 209, 89, 23);
		add(ModificarBtn);
		
		JButton AboutBtn = new JButton("?");
		AboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Jose Antonio Marin Zelaya 2021-0056U <br> Algoritmizacion y estructura de datos 23/08/2023 </html>","Creditos c:",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/UIs/logoUni.png"));
			}
		});
		AboutBtn.setBounds(342, 11, 59, 23);
		add(AboutBtn);
		
		EstablecerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tam= Integer.parseInt(CantidadIng.getText());
				Carnet= new String[Tam];
				Nombres= new String[Tam];
				IPs= new int[Tam];
				IIPs= new int[Tam];
				Sists= new int[Tam];
				Proys= new int[Tam];
				NotasFinales= new int[Tam];
				N=0;
				ReiniciarBtn.setEnabled(true);
				IngresarBtn.setEnabled(true);
				EliminarBtn.setEnabled(true);
				BuscarBtn.setEnabled(true);
				MostrarBtn.setEnabled(true);
				PromedioBtn.setEnabled(true);
				MejorEstudianteBtn.setEnabled(true);
				ModificarBtn.setEnabled(true);
			}
		});
		
		IngresarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(N <=Tam-1) {					
						Carnet[N]=CarnetIng.getText();
						Nombres[N]= NombreIng.getText();
						IPs[N]= Integer.parseInt(IPIng.getText());
						IIPs[N]=Integer.parseInt(IIPIng.getText());
						Sists[N]=Integer.parseInt(SistIng.getText());				
						Proys[N]=Integer.parseInt(ProyIng.getText());
						NotasFinales[N]=IPs[N]+IIPs[N]+Sists[N]+Proys[N];
						N++;
					}
					
					else JOptionPane.showMessageDialog(null, "No hay espacio para mas estudiantes.");
				
			}
		});
		
		ModificarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CarnetIng.getText();
				while(i<N && !x.equals(Carnet[i])) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {
					Carnet[i]=CarnetIng.getText();
					Nombres[i]= NombreIng.getText();
					IPs[i]= Integer.parseInt(IPIng.getText());
					IIPs[i]=Integer.parseInt(IIPIng.getText());
					Sists[i]=Integer.parseInt(SistIng.getText());				
					Proys[i]=Integer.parseInt(ProyIng.getText());
					NotasFinales[i]=IPs[i]+IIPs[i]+Sists[i]+Proys[i];
					JOptionPane.showMessageDialog(null, "La persona con carnet "+x+" se ha actualizado.");
					
				}
			}
		});
		
		EliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CarnetIng.getText();
				while(i<N && !x.equals(Carnet[i])) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {
					for(int k=i;k<N-1;k++) {
						Carnet[k]=Carnet[k+1];
						Nombres[k]=Nombres[k+1];
						IPs[k]= IPs[k+1];
						IIPs[k]= IIPs[k+1];
						Sists[k]=Sists[k+1];
						Proys[k]=Proys[k+1];
						NotasFinales[k]=NotasFinales[k+1];
					}
					N--;
					JOptionPane.showMessageDialog(null, "La persona con carnet "+x+" se ha eliminado.");

				}
			}
		});
		
		MostrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.getDataVector().removeAllElements();
				for(i=0;i<N;i++) {
					dm.addRow(new Object[] {Carnet[i],Nombres[i],IPs[i],IIPs[i],Sists[i],Proys[i],NotasFinales[i]});
				}
				dm.fireTableDataChanged();
			}
		});
		
		BuscarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CarnetIng.getText();
				while(i<N && !x.equals(Carnet[i])) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {
					DefaultTableModel dm = (DefaultTableModel)table.getModel();
					dm.getDataVector().removeAllElements();
					dm.addRow(new Object[] {Carnet[i],Nombres[i],IPs[i],IIPs[i],Sists[i],Proys[i],NotasFinales[i]});					
					dm.fireTableDataChanged();
				}
			}
		});
		
		PromedioBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double prom=0;
				for(int i=0;i<N;i++) {
					prom+=NotasFinales[i];
				}
				prom /= N;
				
				JOptionPane.showMessageDialog(null, "El promedio total de la clase es de "+String.format("%.2f",prom));
			}
		});
		
		MejorEstudianteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        int i=0;
		        int max = NotasFinales[0];
		        String mejorEst="";
		        for (i = 0; i < N; i++) {
		            if (NotasFinales[i] > max) {
		            	max = NotasFinales[i];
		            	mejorEst=Nombres[i];
		            	}
		        }

		        JOptionPane.showMessageDialog(null, "El mejor estudiante es "+mejorEst);
			}
		});
		
		ReiniciarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.cambiarPrograma(1);
			}
		});
		
		Programa2Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.cambiarPrograma(2);
			}
		});
	}
}
