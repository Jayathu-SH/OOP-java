public class Buffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Navin");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        sb.append(" Reddy");

        //sb.deleteCharAt(2);
         sb.insert(6,"jay ");
        sb.setLength(30);
        

        System.out.println(sb); 
    }
}
