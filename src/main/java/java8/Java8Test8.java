package java8;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;
 
public class Java8Test8 {
   public static void main(String args[]){
      try {
        
         // 使用基本编码
//         String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
    	 String base64encodedString =  Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
         System.out.println("Base64 编码字符串 (基本) :" + base64encodedString);
        
         // 解码
//         byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
         byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        
         System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));
         
//         base64encodedString = Base64.getUrlEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
         base64encodedString = Base64.getUrlEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
         
         System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);
         
         byte[] base64urlcodeString = Base64.getUrlDecoder().decode(base64encodedString);
         
         System.out.println("原始字符串: " + new String(base64urlcodeString, "utf-8"));
        
         StringBuilder stringBuilder = new StringBuilder();
        
         for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID().toString());
         }
        
         byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
         
//         String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
         String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
         
         System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);
         
         byte[] base64mimeString = Base64.getMimeDecoder().decode(mimeEncodedString);
         
         System.out.println("原始字符串: " + new String(base64mimeString, "utf-8"));
         
      }catch(UnsupportedEncodingException e){
         System.out.println("Error :" + e.getMessage());
      }
   }
}