import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz Ordenada Alfabeticamente.\n");
        System.out.print("Inserta numero de Filas: ");
        int nFilas=sc.nextInt();
        System.out.print("Inserta numero de Columnas: ");
        int nColumnas=sc.nextInt();
        
        String nombres [][] = new String [nFilas][nColumnas];
        
        System.out.println("\nGuardar Matriz:");
        sc.nextLine();
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Nombre ["+i+"]["+j+"]: ");
                nombres[i][j]=sc.nextLine();
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz Original:");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+nombres[i][j]+"]" + " ");
            }
                System.out.println();
        }
        
        //Ordenando Matriz Alfabeticamente
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                for(int x=0; x<nFilas; x++){
                    for(int y=0; y<nColumnas; y++){
                        if(nombres[i][j].compareToIgnoreCase(nombres[x][y]) < 0){
                            String aux=nombres[i][j];
                            nombres[i][j]=nombres[x][y];
                            nombres[x][y]=aux;
                        }
                    }
                }
            }
        }
        
        System.out.println("\nMatriz Ordenada Alfabeticamente:");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+nombres[i][j]+"]" + " ");
            }
                System.out.println();
        }
    }
}