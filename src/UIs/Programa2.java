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

public class Programa2 extends JPanel {

	private static final long serialVersionUID = -9097426163847681658L;

	private JTextField CantidadIng;
	private JTextField CedulaIng;
	private JTextField NombreIng;
	private JTextField SalarioIng;
	private JTextField ApellidoIng;
	private JTextField HijosIng;
	
	public int N,Tam,i;
	public String[] Cedulas;
	public String[] Nombres;
	public String[] Apellidos;
	public double[] Salarios;
	public int[] Hijos;

	JTable table;

	public Programa2(Interfaz interfaz) {
		String[] encabezado= {"Cedula","Nombres.","Apellidos","Salario","Num. Hijos"};
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
      

		
		
		JLabel CantidadLbl = new JLabel("Cantidad de empleados a ingresar:");
		CantidadLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CantidadLbl.setBounds(66, 78, 390, 36);
		add(CantidadLbl);
		
		CantidadIng = new JTextField();
		CantidadIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CantidadIng.setBounds(466, 78, 86, 36);
		add(CantidadIng);
		CantidadIng.setColumns(10);
		
		JLabel CedulaLbl = new JLabel("Cedula:");
		CedulaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CedulaLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CedulaLbl.setBounds(10, 125, 139, 36);
		add(CedulaLbl);
		
		JLabel NombreLbl = new JLabel("Nombres:");
		NombreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		NombreLbl.setBounds(159, 125, 170, 36);
		add(NombreLbl);
		
		JLabel SalarioLbl = new JLabel("Salario:");
		SalarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		SalarioLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		SalarioLbl.setBounds(524, 125, 90, 36);
		add(SalarioLbl);
		
		CedulaIng = new JTextField();
		CedulaIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CedulaIng.setColumns(10);
		CedulaIng.setBounds(10, 162, 139, 36);
		add(CedulaIng);
		
		NombreIng = new JTextField();
		NombreIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NombreIng.setColumns(10);
		NombreIng.setBounds(159, 162, 170, 36);
		add(NombreIng);
		
		SalarioIng = new JTextField();
		SalarioIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SalarioIng.setColumns(10);
		SalarioIng.setBounds(524, 162, 90, 36);
		add(SalarioIng);
		
		JButton Programa1Boton = new JButton("Programa 1");

		Programa1Boton.setEnabled(true);
		Programa1Boton.setBounds(107, 11, 109, 23);
		add(Programa1Boton);
		
		JButton Programa2Boton = new JButton("Programa 2");
		Programa2Boton.setEnabled(false);
		Programa2Boton.setBounds(507, 11, 109, 23);
		add(Programa2Boton);
		
		JButton IngresarBtn = new JButton("Ingresar");
		IngresarBtn.setBounds(60, 209, 89, 23);
		add(IngresarBtn);
		
		JButton MostrarBtn = new JButton("Mostrar");

		MostrarBtn.setBounds(357, 209, 89, 23);
		add(MostrarBtn);
		
		JButton AboutBtn = new JButton("?");
		AboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Jose Antonio Marin Zelaya 2021-0056U <br>Algoritmizacion y estructura de datos 23/08/2023 </html>","Creditos c:",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/UIs/logoUni.png"));
			}
		});
		AboutBtn.setBounds(342, 11, 59, 23);
		add(AboutBtn);
		
		JButton EstablecerBtn = new JButton("Establecer");
		EstablecerBtn.setBounds(583, 68, 98, 23);
		add(EstablecerBtn);
		
		JButton ReiniciarBtn = new JButton("Reiniciar");

		ReiniciarBtn.setBounds(583, 91, 98, 23);
		add(ReiniciarBtn);
		
		JButton EliminarBtn = new JButton("Eliminar");

		EliminarBtn.setBounds(159, 209, 89, 23);
		add(EliminarBtn);
		
		JButton BuscarBtn = new JButton("Buscar");

		BuscarBtn.setBounds(456, 209, 89, 23);
		add(BuscarBtn);
		
		JButton AumentarSalarioBtn = new JButton("<html> Aumentar<br>salario </html>");

		AumentarSalarioBtn.setBounds(572, 209, 109, 37);
		add(AumentarSalarioBtn);
		
		ReiniciarBtn.setEnabled(false);
		IngresarBtn.setEnabled(false);
		EliminarBtn.setEnabled(false);
		BuscarBtn.setEnabled(false);
		MostrarBtn.setEnabled(false);
		AumentarSalarioBtn.setEnabled(false);
		
		JButton ModificarBtn = new JButton("Modificar");

		ModificarBtn.setEnabled(false);
		ModificarBtn.setBounds(258, 209, 89, 23);
		add(ModificarBtn);
		
		JLabel ApellidoLbl = new JLabel("Apellidos:");
		ApellidoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ApellidoLbl.setBounds(339, 125, 175, 36);
		add(ApellidoLbl);
		
		ApellidoIng = new JTextField();
		ApellidoIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ApellidoIng.setColumns(10);
		ApellidoIng.setBounds(339, 162, 175, 36);
		add(ApellidoIng);
		
		JLabel HijosLbl = new JLabel("Num hijos:");
		HijosLbl.setHorizontalAlignment(SwingConstants.CENTER);
		HijosLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		HijosLbl.setBounds(624, 125, 116, 36);
		add(HijosLbl);
		
		HijosIng = new JTextField();
		HijosIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		HijosIng.setColumns(10);
		HijosIng.setBounds(634, 162, 90, 36);
		add(HijosIng);
		
		EstablecerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tam= Integer.parseInt(CantidadIng.getText());
				Cedulas= new String[Tam];
				Nombres= new String[Tam];
				Apellidos= new String[Tam];
				Salarios= new double[Tam];
				Hijos= new int[Tam];

				N=0;
				ReiniciarBtn.setEnabled(true);
				IngresarBtn.setEnabled(true);
				EliminarBtn.setEnabled(true);
				BuscarBtn.setEnabled(true);
				MostrarBtn.setEnabled(true);

				AumentarSalarioBtn.setEnabled(true);
				ModificarBtn.setEnabled(true);
			}
		});
		
		IngresarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(N <=Tam-1) {					
						Cedulas[N]=CedulaIng.getText();
						Nombres[N]= NombreIng.getText();
						Apellidos[N]= ApellidoIng.getText();
						Salarios[N]= Double.parseDouble(SalarioIng.getText());
						Hijos[N]=Integer.parseInt(HijosIng.getText());				

						N++;
					}
					
					else JOptionPane.showMessageDialog(null, "No hay espacio para mas empleados.");
				
			}
		});
		
		ModificarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CedulaIng.getText();
				while(i<N && !x.equals(Cedulas[i])) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "La cedula "+x+" no esta registrada");
				
				else {
					Cedulas[i]=CedulaIng.getText();
					Nombres[i]= NombreIng.getText();
					Apellidos[i]= ApellidoIng.getText();
					Salarios[i]=Double.parseDouble(SalarioIng.getText());
					Hijos[i]=Integer.parseInt(HijosIng.getText());				

					JOptionPane.showMessageDialog(null, "El empleado con cedula "+x+" se ha actualizado.");
					
				}
			}
		});
		
		EliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CedulaIng.getText();
				while(i<N && !x.equals(Cedulas[i])) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {
					for(int k=i;k<N-1;k++) {
						Cedulas[k]=Cedulas[k+1];
						Nombres[k]=Nombres[k+1];
						Apellidos[k]= Apellidos[k+1];
						Salarios[k]= Salarios[k+1];
						Hijos[k]=Hijos[k+1];

					}
					N--;
					JOptionPane.showMessageDialog(null, "El empleado con cedula "+x+" se ha eliminado.");

				}
			}
		});
		
		MostrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.getDataVector().removeAllElements();
				for(i=0;i<N;i++) {
					dm.addRow(new Object[] {Cedulas[i],Nombres[i],Apellidos[i],Salarios[i],Hijos[i]});
				}
				dm.fireTableDataChanged();
			}
		});
		
		BuscarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CedulaIng.getText();
				while(i<N && !x.equals(Cedulas[i])) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "La cedula "+x+" no esta registrada");
				
				else {
					DefaultTableModel dm = (DefaultTableModel)table.getModel();
					dm.getDataVector().removeAllElements();
					dm.addRow(new Object[] {Cedulas[i],Nombres[i],Apellidos[i],Salarios[i],Hijos[i]});
					dm.fireTableDataChanged();
				}
			}
		});
		
		AumentarSalarioBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double prom=0;
				for(int i=0;i<N;i++) {
					prom+=Salarios[i];
				}
				prom /= N;
				
				for(int i=0;i<N;i++) {
					if(Salarios[i]<prom) Salarios[i]+=(Salarios[i]*0.10f);
				}
			}
		});
		
		ReiniciarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.cambiarPrograma(2);
			}
		});
		
		Programa1Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.cambiarPrograma(1);
			}
		});
	}
}