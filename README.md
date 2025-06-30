import java.util.;
public class Main
{
      static int[] computeLPSArray(String pat){
          int n=pat.length();
          int[] lps= new int[n];
          int len=0;
          
          lps[0]=0;
          
          int i=1;
          while(i<n){
              if(pat.charAt(i)==pat.charAt(len)){
                  len++;
                  lps[i]=len;
                  i++;
              }else{
                  if(len!=0){
                      len=lps[len - 1];
                  }
              }
          }
          return lps;
      }
    static boolean areRotations(String s1,String s2){
        String txt=s1+s1;
        String pat=s2;
        int n=txt.length();
        int m=pat.length();
        
        int[] lps=computeLPSArray(pat);
        
        int i=0;
        int j=0;
        while(i<n){
            if(pat.charAt(j)==txt.charAt(i)){
                j++;
                i++;
            }
            if(j==m){
                return true;
            }
            else if(i<n&&pat.charAt(j)!=txt.charAt(i)){
                if(j!=0)
                   j=lps[j-1];
                else
                    i=i+1;
            }
        }
        return false;
    }
