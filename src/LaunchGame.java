 
public class LaunchGame {
	public static void main(String[] args) {
    TicTacToe t= new TicTacToe();
    t.dispBoard();
    t.placeMark(1, 2, 'X');
    t.placeMark(0, 2, 'X');
    t.placeMark(2, 2, '0');
    t.placeMark(0, 0, '0');
    t.placeMark(1, 1, 'X');
    t.placeMark(2, 1, '0');
    t.dispBoard();
//    System.out.println(t.colWin());
    System.out.println(t.diagonalWin());
	}

}

class TicTacToe{
	 char [][] board;
	  public TicTacToe()
	  {
		    board =new char[3][3];
		       initBoard();
	  }
	   void initBoard()
	   {
		    for( int i=0;i<board.length;i++)
		    {
		    	for(int j=0;j<board[i].length;j++)
		    	{
		    		 board[i][j]=' ';
		    	}
		    }
		  
	   }
	    void dispBoard()
	    {
	    	System.out.println("---------------");
	    	for(int i=0;i<board.length;i++) 
	    	{
	    		System.out.print(" | ");
	    		for(int j=0;j<board[i].length;j++) {
	    			 System.out.print(board[i][j] + " | " );
	    		}
	    		System.out.println();
	    		System.out.println("---------------");
	    	}
	    }
	     void placeMark(int row,int col,char Mark)
	     {
	    	  if(row>=0&&row<=2&&col>=0&&col<=2)
	    	  {
	    		  board[row][col]=Mark;
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Invalid input");
	    	  }
	     }
	    boolean colWin() {
	    	 for(int j=0;j<=2;j++)
	    	 {
	    		 if(board[0][j]==board[1][j]&&board[1][j]==board[2][j]) {
	    			 return true;
	    		 }
	    	 } 
	    	 return false;
	     }
	    boolean rowWin() {
	    	for(int i=0;i<=2;i++)
	    	{
	    		if(board[i][0]==board[i][1]&&board[i][1]==board[i][2])
	    		{
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    boolean diagonalWin() {
	    	if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]||board[0][2]==board[1][1]&&board[1][1]==board[2][0]) {
	    		return true;
	    	}
	    	return false;
	    
	    }
}

