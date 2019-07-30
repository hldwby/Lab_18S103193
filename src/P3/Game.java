package P3;

import java.util.Scanner;

public class Game extends Action{
	Board map;  //棋盘
	Player player1; //玩家1
	Player player2; //玩家2 
	
	
	//按用户输入初始化棋局
	public void  main() {
		System.out.println("国际象棋还是围棋？输入Chess或者 Go");
		Scanner itScanner = new Scanner(System.in);
		String gameType = itScanner.nextLine();
		
		//读入玩家用户名
		System.out.println("请输入玩家1的姓名:");
		String playerName1 = itScanner.nextLine();
		System.out.println("请输入玩家2的姓名:");
		String playerName2 = itScanner.nextLine();
		
		//读入用户选择的棋局类型
		StringBuffer relType = new StringBuffer();
		String[] typeTemp = gameType.split("\\s+");
		for (int i = 0; i < typeTemp.length; i++)
			if (!typeTemp[i].contains(" "))
				relType.append(typeTemp[i]);
		
		//按照不同的类型创建玩家
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
			System.out.println("您的输入有误，请重新输入!");
			itScanner.close();
			return;
		}
		//itScanner.close();
	}
	
}
