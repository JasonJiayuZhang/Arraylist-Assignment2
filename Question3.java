import java.util.ArrayList;

class Question3 {

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newnumber = new ArrayList<Integer>();
        int B = b.size()-1;
        int take = 0;
        int A = a.size()-1;
        while (A >=0 || B >=0) {
            int sum = 0;
            if (A >= 0 && B >=0) {
                sum =a.get(A) + b.get(B) + take;
            } else if (A >=0) {
                sum =a.get(A) + take;  
            } else if (B >=0) {
                sum =b.get(B) + take;
            } else {  
                sum =take;
            }
           if (sum > 9) {
               sum -=10;
                take =1;             
            } else {
                take =0;
            }

            newnumber.add(0, sum);
            A--;
            B--;
        }

        if (take > 0) {
            newnumber.add(0, 1);
        }
        return newnumber;
    }
    public static void main (String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(9);
        n1.add(9);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(9);
        n2.add(9);
        ArrayList<Integer> n3 = add(n1, n2);
        System.out.println(n3);
    }
}