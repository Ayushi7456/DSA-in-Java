public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(2);    //get
        System.out.println(ch);

        sb.setCharAt(0, 'd');      //set
        System.out.println(sb);

        sb.insert(2, 'y');         //insert
        System.out.println(sb);

        sb.deleteCharAt(3);        //delete
        System.out.println(sb);

        sb.append('g');             //add in last
        System.out.println(sb);

        System.out.println(sb.length());   //length

    }
}
// stringbuilder is similar to string have better performance than string and takes less time 
// to excute a program than a string.


