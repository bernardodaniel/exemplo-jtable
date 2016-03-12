package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExemploJtable extends JFrame {

	private JPanel contentPane;
	private JTable tabela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploJtable frame = new ExemploJtable();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExemploJtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		setVisible(true);
		
		
		
		String[] colunas = {"Nome", "Sobrenome", "Telefone"};
		String[][] linhas = {
				{"Daniel", "Bernardo", "44 9999-0000"}
		}; 

		DefaultTableModel model = 
				new DefaultTableModel(linhas, colunas);
		tabela.setModel(model);
		
		String[] linha = {"Ana", "Maria", "44 8888-0000"};
		model.addRow(linha);
		
		JOptionPane.showMessageDialog(null, "ok");
		
		int indiceLinha = tabela.getSelectedRow();
		
		if (indiceLinha != -1)
			model.removeRow(indiceLinha);
		
		
	}

}
