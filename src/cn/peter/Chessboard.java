package cn.peter;

/**
 * 棋盘类
 */
public class Chessboard {
    /**
     * 棋盘宽
     */
    private int cols=20;
    /**
     * 棋盘高
     */
    private int rows=15;
    /**
     * 初始化棋盘
     */
    private Object[][] array=new Object[cols][rows];
    void initBoard(){

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=new Object();
            }
        }
    }

    /**
     * 输出棋盘
     */
    void printBoard(){}

    /**
     * 设置棋子
     * @param posX 坐标x
     * @param posY 坐标y
     * @param chessman 棋子类型（黑子或白子）
     */
    void setBoard( int posX , int posY , String chessman ){}

    /**
     * 返回棋盘
     * @return 返回棋盘的二维数组
     */
    String[][] getBoard(){
        return  null;
    }
}










