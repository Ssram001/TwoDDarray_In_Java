package MultiDiMensionsArrays;

import java.util.ArrayList;
import java.util.List;

public class multiDarraylist {
    static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList <Integer>();
        a.add(1);a.add(2);a.add(3);a.add(4);

        ArrayList<Integer> b = new ArrayList <Integer>();
        b.add(12);b.add(23);b.add(31);

        ArrayList<Integer> c = new ArrayList <Integer>();
        c.add(18);c.add(22);c.add(33);c.add(46);c.add(5);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);

//        System.out.println(arr);

        for(ArrayList<Integer> list : arr){
             for( int i : list){
                 System.out.println(i+" ");
             }
        }

//        for(int i=0;i<arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
    }

    //METHOD=1(PASCLE TRAIANGLE)

//    public List<List<Integer>> generate(int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            ans.add(new ArrayList<>());
//            for(int j = 0; j < i; j++){
//                if(j==0||j==i){
//                   ans.get(i).add(1); // arr[i][j]=1
//
//                }
//                else{
////                    ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
////                    or
//                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
//                    ans.get(i).add(val);
//                }
//            }
//        }
//        return ans;

    //METHOD=2(PASCLE TRIANGLE)

//    public List<List<Integer>> generate(int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            List<Integer> list = new ArrayList<>();
//            for(int j = 0; j <=i; j++){
//                list.add(1);
//            }
//            ans.add(list);
//        }
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j <=i; j++){
//                if(j==0 || j==i){
//                    ans.get(i).set(j,1);
//                }
//                else{
//                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
//                    ans.get(i).set(j,val);
//                }
//            }
//        }
//        return ans;
//    }


}
