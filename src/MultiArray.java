import java.util.Random;

public class MultiArray {

    int[][] tab;
    Random rand = new Random();

    MultiArray(int n, int m){
        this.tab=new int[n][m];
        this.randomize();

    }

    void randomize(){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                tab[i][j]=rand.nextInt(100);
            }
        }
    }

    int findMin(){
        int min = tab[0][0];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                if(tab[i][j]<min){
                    min=tab[i][j];
                }
            }
        }
        return min;
    }

    int findMax(){
        int max = tab[0][0];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                if(tab[i][j]>max){
                    max=tab[i][j];
                }
            }
        }
        return max;
    }

    void print(){
        for(int i=0; i<tab.length; i++){
            System.out.println();
            for(int j=0; j<tab.length; j++){
                System.out.print(tab[i][j]+" ");
            }
        }
    }


}
