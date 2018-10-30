import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.prompt.PromptSupport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class GuiHelloWorld  implements ActionListener {
	//GUI
	static JFrame guiFrame = new JFrame();
	
	static JPanel container=new JPanel();
	static JPanel nameField=new JPanel();
	static JPanel buttons=new JPanel();
	
	static JButton java=new JButton("Java");
	static JButton c=new JButton("C");
	static JButton python=new JButton("Python");
	static JButton selenium=new JButton("Selenium");
	static JButton winium=new JButton("Winium");
	static JButton vba=new JButton("VBA");
	static JButton back=new JButton("Back");
	static JTextField name = new JTextField(12);
	static JFrame frame = new JFrame("Code!");
	
	//Java Components
	static JPanel Java = new JPanel();
	static JTextArea javaCode=new JTextArea();
	
	//Python Components
		static JPanel Python = new JPanel();
		static JTextArea pythonCode=new JTextArea();
		
	//C Components
		static JPanel C = new JPanel();
		static JTextArea cCode=new JTextArea();
		
	//VBA Components
		static JPanel VBA = new JPanel();
		static JTextArea vbaCode=new JTextArea();
		
	//VBA Components
		static JPanel Selenium = new JPanel();
		static JTextArea seleniumCode=new JTextArea();
		
	//Winium Components
	static JPanel Winium = new JPanel();
	static JTextArea winiumCode=new JTextArea();
	
	public static void main(String[] args) {
		
	//Properties of the Frame
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Say Hello!");
		guiFrame.setSize(400,275);	
		//This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);
		
		//container properties
		container.setLayout(new GridLayout(2,1));
		
		//nameField panel
		nameField.setLayout(new BorderLayout());
		TitledBorder Name;
		Name = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"Name");
		PromptSupport.setPrompt("Enter a Name please",name);
		nameField.add(name);
		nameField.setBorder(Name);
		//Buttons Panel
		buttons.setLayout(new GridLayout(3,2));
		buttons.add(java);
		buttons.add(c);
		buttons.add(python);
		buttons.add(selenium);
		buttons.add(winium);
		buttons.add(vba);
		
		//add to Container
		container.add(nameField);
		container.add(buttons);
		//add Container to JFrame
		guiFrame.add(container);
		guiFrame.setVisible(true);
		
		//Display Java Code
		java.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(isNameThere()){
						container.setVisible(false);
						TitledBorder java=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"Java:");
						Java.setLayout(new GridLayout(2,1,1,1));
						javaCode.setText("public class JavaHello {\n\tpublic static void main(String[] args) {\n\t\tString name=\""+name.getText()+"\";\n\t\tSystem.out.println(\"Hello \"+name);\n\t}\n}");
						Java.add(javaCode);
						Java.add(back);
						Java.setBorder(java);
						guiFrame.add(Java);
						guiFrame.setSize(400,260);
						Java.setVisible(true);
	        		back.addActionListener(new ActionListener() {
	        			public void actionPerformed(ActionEvent e) {
	        			guiFrame.remove(Java);
	        			guiFrame.setSize(400,275);
	        			container.setVisible(true);
	        			}
			});
			}
		}
		});

	python.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(isNameThere()){
				container.setVisible(false);
				TitledBorder python=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"Python:");
				Python.setLayout(new GridLayout(2,1,1,1));
				pythonCode.setText("name=\""+name.getText()+"\"\nprint(\"Hello \"+name)");
				Python.add(pythonCode);
				Python.add(back);
				Python.setBorder(python);
				guiFrame.add(Python);
				guiFrame.setSize(400,260);
				Python.setVisible(true);
    		back.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    			guiFrame.remove(Python);
    			guiFrame.setSize(400,275);
    			container.setVisible(true);
    			}
	});
	}
}
});
	c.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(isNameThere()){
				container.setVisible(false);
				TitledBorder cTitle=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"C:");
				C.setLayout(new GridLayout(2,1,1,1));
				cCode.setText("#include <stdio.h>\nint main()\n{\n\tconst char name[] = \""+name.getText()+"\"; \n\t printf(\"Hello %s\",&name);\n\treturn 0;\n}");
				C.add(cCode);
				C.add(back);
				C.setBorder(cTitle);
				guiFrame.add(C);
				guiFrame.setSize(400,320);
				C.setVisible(true);
    		back.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    			guiFrame.remove(C);
    			guiFrame.setSize(400,275);
    			container.setVisible(true);
    			}
	});
	}
}
});
	
	vba.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(isNameThere()){
				container.setVisible(false);
				TitledBorder vbaTitle=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"VBA:");
				VBA.setLayout(new GridLayout(2,1,1,1));
				vbaCode.setText("Sub Say_Hello()\nDim name As String\nname =\""+name.getText()+"\"\nMsgBox \"Hello \" + name\nEnd Sub");
				VBA.add(vbaCode);
				VBA.add(back);
				VBA.setBorder(vbaTitle);
				guiFrame.add(VBA);
				guiFrame.setSize(400,320);
				VBA.setVisible(true);
    		back.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    			guiFrame.remove(VBA);
    			guiFrame.setSize(400,275);
    			container.setVisible(true);
    			}
	});
	}
}
});
	selenium.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(isNameThere()){
				container.setVisible(false);
				TitledBorder seleniumTitle=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"Selenium:");
				Selenium.setLayout(new GridLayout(2,1,1,1));
				seleniumCode.setText("public class SelniumHello {\n\tpublic static void main(String[] args) {\n\t\t\\\\Selenium to write Hello 'Name' on Google Search\n\t\tString name=\""+name.getText()+"\";\n\t\tSystem.setProperty(\"webdriver.gecko.driver\",\"Path\\to\\your\\geckodriver.exe\");\n\t\tThread.sleep(2000);\n\t\tWebDriver driver = new FirefoxDriver();\n\t\tdriver.get(\"http://google.com\");\n\t\tWebElement search = driver.findElement(By.id(\"lst-ib\"));\n\t\tsearch.sendKeys(\"Hello \"+name);\n\t\tThread.sleep(10000);\n\t\tdriver.quit();\n\t}\n}");
				Selenium.add(seleniumCode);
				Selenium.add(back);
				Selenium.setBorder(seleniumTitle);
				guiFrame.add(Selenium);
				guiFrame.setSize(630,515);
				Selenium.setVisible(true);
				back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						guiFrame.remove(Selenium);
						guiFrame.setSize(400,275);
						container.setVisible(true);
					}
				});
			}
		}
	});
	
	winium.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
//			DesktopOptions options= new DesktopOptions();\n\t\toptions.setApplicationPath("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");\n\t\tWiniumDriver driver=null;\n\t\t\ttry {Thread.sleep(5000);\n\t\t\tdriver= new WiniumDriver(new URL("http://localhost:9999"), options);\n\t\t\tdriver.findElement(By.className("Scintilla")).sendKeys("Hello \""+name.getText()+"\");\n\t\t}catch (Exception e1) {\n\t\t\te1.printStackTrace();\n\t\t}
			if(isNameThere()){
				container.setVisible(false);
				TitledBorder winiumTitle=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"Winium:");
				Winium.setLayout(new GridLayout(2,1,1,1));
				winiumCode.setText("public class WiniumHello {\n\tpublic static void main(String[] args) {\n\t\tString name=\""+name.getText()+"\"; \n\t\tDesktopOptions options= new DesktopOptions();\n\t\toptions.setApplicationPath(\"C:\\Program Files (x86)\\Notepad++\\notepad++.exe\");\n\t\tWiniumDriver driver=null;\n\t\t\ttry {Thread.sleep(5000);\n\t\t\tdriver= new WiniumDriver(new URL(\"http://localhost:9999\"), options);\n\t\t\tdriver.findElement(By.className(\"Scintilla\")).sendKeys(\"Hello \"+name);\n\t\t}catch (Exception e1) {\n\t\t\te1.printStackTrace();\n\t\t}\n\t}\n}");
				Winium.add(winiumCode);
				Winium.add(back);
				Winium.setBorder(winiumTitle);
				guiFrame.add(Winium);
				guiFrame.setSize(725,525);
				Winium.setVisible(true);
				back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						guiFrame.remove(Winium);
						guiFrame.setSize(400,275);
						container.setVisible(true);
					}
				});
			}
		}
	});
}

	public static boolean isNameThere(){
		if((name.getText().equals(null)) | (name.getText().equals(""))){
			String message="Name is needed";
			JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else{
			return true;
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}