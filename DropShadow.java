import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DropShadow extends JPanel {		
	//-------------------------------------------------------------------------------------------------------------
	public DropShadow() {}
	//-------------------------------------------------------------------------------------------------------------
	private void createRightShadow(int x, int y, int width, int height, JPanel contentPane) {
		JPanel panel = new JPanel();
		panel.setBounds(x + 3, y + 3, width, height);
		panel.setBackground(new Color(0, 0, 0, 50));
		contentPane.add(panel);
	}
	//-------------------------------------------------------------------------------------------------------------
	public void addRightBottomShadow(JButton btn, JPanel contentPane) {
		int x = btn.getX();
		int y = btn.getY();
		int width = btn.getWidth();
		int height = btn.getHeight();
		createRightShadow(x, y, width, height, contentPane);
	}
	//-------------------------------------------------------------------------------------------------------------
	public void addRightBottomShadow(JLabel lbl, JPanel contentPane) {
		int x = lbl.getX();
		int y = lbl.getY();
		int width = lbl.getWidth();
		int height = lbl.getHeight();
		createRightShadow(x, y, width, height, contentPane);
	}
	//-------------------------------------------------------------------------------------------------------------
	public void addRightBottomShadow(JPanel panel, JPanel contentPane) {
		int x = panel.getX();
		int y = panel.getY();
		int width = panel.getWidth();
		int height = panel.getHeight();
		createRightShadow(x, y, width, height, contentPane);
	}
	//-------------------------------------------------------------------------------------------------------------
	private void createLeftShadow(int x, int y, int width, int height, JPanel contentPane) {
		JPanel panel = new JPanel();
		panel.setBounds(x - 3, y + 3, width, height);
		panel.setBackground(new Color(0, 0, 0, 50));
		contentPane.add(panel);

	}
	//-------------------------------------------------------------------------------------------------------------
	public void addLeftBottomShadow(JButton btn, JPanel contentPane) {
		int x = btn.getX();
		int y = btn.getY();
		int width = btn.getWidth();
		int height = btn.getHeight();
		createLeftShadow(x, y, width, height, contentPane);
	}
	//-------------------------------------------------------------------------------------------------------------
	public void addLeftBottomShadow(JLabel lbl, JPanel contentPane) {
		int x = lbl.getX();
		int y = lbl.getY();
		int width = lbl.getWidth();
		int height = lbl.getHeight();
		createLeftShadow(x, y, width, height, contentPane);
	}
	//-------------------------------------------------------------------------------------------------------------
	public void addLeftBottomShadow(JPanel panel, JPanel contentPane) {
		int x = panel.getX();
		int y = panel.getY();
		int width = panel.getWidth();
		int height = panel.getHeight();
		createLeftShadow(x, y, width, height, contentPane);
	}
}


