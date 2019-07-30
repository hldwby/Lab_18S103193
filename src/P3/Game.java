package P3;

import java.util.Scanner;

public class Game extends Action{
	Board map;  //����
	Player player1; //���1
	Player player2; //���2 
	
	
	//���û������ʼ�����
	public void  main() {
		System.out.println("�������廹��Χ�壿����Chess���� Go");
		Scanner itScanner = new Scanner(System.in);
		String gameType = itScanner.nextLine();
		
		//��������û���
		System.out.println("���������1������:");
		String playerName1 = itScanner.nextLine();
		System.out.println("���������2������:");
		String playerName2 = itScanner.nextLine();
		
		//�����û�ѡ����������
		StringBuffer relType = new StringBuffer();
		String[] typeTemp = gameType.split("\\s+");
		for (int i = 0; i < typeTemp.length; i++)
			if (!typeTemp[i].contains(" "))
				relType.append(typeTemp[i]);
		
		//���ղ�ͬ�����ʹ������
		if (relType.toString().toLowerCase().equals("chess")) {
			map = new Board(8);
			System.out.println(map);
			player1 = new Player(playerName1,1,0,map);
			player2 = new Player(playerName2,2,0,map);
		} else if (relType.toString().toLowerCase().equals("go")) {
			map = new Board(19);
			player1 = new Player(playerName1,1,1,map);
			player2 = new Player(playerName2,2,1,map);
		} else {
			System.out.println("����������������������!");
			itScanner.close();
			return;
		}
		//itScanner.close();
	}
	
}
