import java.awt.Button;
import java.awt.event.*;
import java.beans.EventHandler;
import java.awt.Frame;
import java.awt.GridLayout;

public class Calendar {
	public static void main(String[] args) {
		Frame f = new Frame("Calender"); // 화면창 생성 및 이름

		f.setSize(500, 300); // 화면크기
		// frame은 기본적으로 BorderLayout로 설정되어 있어서 따로설정안해도됨
		f.setLayout(new GridLayout(8, 3));

		f.add(new Button("0"));
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		f.add(new Button("7"));
		f.add(new Button("8"));
		f.add(new Button("9"));
		f.add(new Button("+"));
		f.add(new Button("-"));
		f.add(new Button("*"));
		f.add(new Button("/"));
		f.add(new Button("%"));
		f.add(new Button(""));
		f.add(new Button("%"));
		f.add(new Button("=*"));
		f.add(new Button("$"));

		f.setVisible(true);

	}

}
		
	


