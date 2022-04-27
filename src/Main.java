public class Main
{

    public static void main(String[] args)
    {
        //String multiplesOf3 = "[";
        //for (int i = 1; i <= 100; i++)
        //{
        //    multiplesOf3 += (i*3) + ", ";
        //}
        //multiplesOf3 += "]";
        //System.out.println(multiplesOf3);
        //
        ////When concatenating  in a loop, use a StringBuilder
        //StringBuilder sb = new StringBuilder("[");
        //for (int i = 1; i <= 100; i++)
        //{
        //    sb.append(i*3).append(", ");
        //}
        //
        ////Let's replace the last comma (,) with a rectangle bracket (])
        ////Index = length() - 2
        //System.out.println("\n~~~~~~~String Builder Version~~~~~~\n" +sb + "\nLength = "+sb.length());
	//Concatenate the first 100 multiples of 3 on a string
        BinaryTree<Integer> bt = new BinaryTree();
        bt.add(8);
        bt.add(3);
        bt.add(10);
        bt.add(1);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(7);
        bt.add(13);
        System.out.println(bt);

    }
}
