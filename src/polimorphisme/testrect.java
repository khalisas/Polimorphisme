/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author LENOVO
 */
public class testrect {
    public static void main (String[] args){
        Rect u= new Rect();
        Rect t= new Rect(3,3);
        
        t.move(1,1);
        int x1=t.x1;
        int x2=t.x2;
        int y1=t.y1;
        int y2=t.y2;
        System.out.println("Awal["+x1+","+y1+";"+x2+","+y2+"]");
        Rect utama = new Rect (x1, y1, x2, y2);
        System.out.println("<"+"2,3"+"> Inside the union"+utama.isInside(2, 3));
        Rect akhir = new Rect (2, 3, 5, 6);
        u= utama.union(akhir);
        x1=u.x1;
        x2=u.x2;
        y1=u.y1;
        y2=u.y2;
        
        System.out.println("[1,1,4,4] Union [2,3;5,6]=["+x1+","+y1+";"+x2+","+y2+"]" );
        u=utama.intersection(akhir);
        x1=u.x1;
        x2=u.x2;
        y1=u.y1;
        y2=u.y2;
        System.out.println("[1,1,4,4] Intersection [2,3;5,6]=["+x1+","+y1+";"+x2+","+y2+"]" );
          
    }
    
}
