package IOStream;

import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {
		try{    
            FileOutputStream fout=new FileOutputStream("D:\\yuvraj1.ws\\yuvrajlearning\\src\\IOStream\\text.txt");    
            String s="solanki yuvraj";
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}  

	}

}
