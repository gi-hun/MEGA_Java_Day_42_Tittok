/* 
 * # ƽ����
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]�ε��� �Է� : 6
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]�¸�
 * 
 */
package day_42;

import java.util.Scanner;

class Ex12
{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;
}

public class ClassEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex12 e = new Ex12();
		
		for(int i=0;i<e.game.length;i++)
		{
			for(int j=0;j<e.game.length;j++)
			{
				e.game[i][j] = "[ ]";
			}
		}
		
		System.out.println("========ƽ���� ����========");
		while(true)
		{
			for(int i=0; i<e.game.length; i++) 
			{
				for(int j=0; j<e.game[i].length; j++) 
				{
					System.out.print(e.game[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			if(e.win==1)
			{
				System.out.println("player1 �¸�");
				break;
			}
			else if(e.win==2)
			{
				System.out.println("player2 �¸�");
				break;
			}
			
			if(e.turn%2==0)				//player1 ��
			{
				System.out.println("[player1]y ��ǥ");
				int y = sc.nextInt();
				System.out.println("[player1]x ��ǥ");
				int x = sc.nextInt();
				
				
				if(e.game[y][x].equals("[ ]"))
				{
					e.game[y][x] = "[o]";
					e.turn++;
				}
			}
			else if(e.turn%2==1)		//player2 ��
			{
				System.out.println("[player2]y ��ǥ");
				int y = sc.nextInt();
				System.out.println("[player2]x ��ǥ");
				int x = sc.nextInt();
				
				
				if(e.game[y][x].equals("[ ]"))
				{
					e.game[y][x] = "[x]";
					e.turn++;
				}
			}
			
			//����
			for(int i=0; i<e.game.length; i++) 
			{
				if(e.game[i][0].equals("[o]") && e.game[i][1].equals("[o]") && e.game[i][2].equals("[o]")) {e.win = 1;}
				if(e.game[i][0].equals("[x]") && e.game[i][1].equals("[x]") && e.game[i][2].equals("[x]")) {e.win = 2;}
			}

			//����
			for(int i=0; i<e.game.length; i++) 
			{
				if(e.game[0][i].equals("[o]") && e.game[1][i].equals("[o]") && e.game[2][i].equals("[o]")) {e.win = 1;}
				if(e.game[0][i].equals("[x]") && e.game[1][i].equals("[x]") && e.game[2][i].equals("[x]")) {e.win = 2;}
			}
			
			//�밢��
			if(e.game[0][0].equals("[o]") && e.game[1][1].equals("[o]") && e.game[2][2].equals("[o]")) {e.win = 1;}
			if(e.game[0][0].equals("[x]") && e.game[1][1].equals("[x]") && e.game[2][2].equals("[x]")) {e.win = 2;}
			
			//�밢��
			if(e.game[0][2].equals("[o]") && e.game[1][1].equals("[o]") && e.game[2][0].equals("[o]")) {e.win = 1;}
			if(e.game[0][2].equals("[x]") && e.game[1][1].equals("[x]") && e.game[2][0].equals("[x]")) {e.win = 2;}

		}
	}
}
