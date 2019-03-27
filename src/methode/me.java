package methode;

public class me {
    public String calculator(String num) {
        int i = num.indexOf("+");
        int b = num.indexOf("-");
        int c = num.indexOf("*");
        int d = num.indexOf("/");
        if (i != -1) {
            String num1 = num.substring(0, i);
            String num2 = num.substring(i + 1);
            return String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
        } else if (b != -1) {
            String num1 = num.substring(0, b);
            String num2 = num.substring(b + 1);
            return String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
        } else if (c != -1) {
            String num1 = num.substring(0, c);
            String num2 = num.substring(c + 1);
            return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        } else if (d != -1) {
            String num1 = num.substring(0, d);
            String num2 = num.substring(d + 1);
            return String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));

        }
        return null;
    }

    public String compare(String number) {
        if (number.indexOf('+') != -1 || number.indexOf('-') != -1 || number.indexOf('*') != -1 || number.indexOf('/') != -1) {
            return this.calculator(number);
        } else {
            return number;
        }

    }

    public String calEquale(String number, String resulte, String last) {
        if (resulte.equals("")) {
            int i = number.indexOf("+");
            int b = number.indexOf("-");
            int c = number.indexOf("*");
            int d = number.indexOf("/");
            if (i != -1 || b != -1 || c != -1 || d != -1) {
               return this.calculator(number);
            } else {
                char sign =0;
                String q="";
                String s = this.calculator(last);
                for (int j = 0; j < last.length(); j++) {
                    if(last.charAt(j)=='+'||last.charAt(j)=='-'||last.charAt(j)=='*'||last.charAt(j)=='/')
                    sign=last.charAt(j);
                }
                int a=last.indexOf(sign);
                q=last.substring(a+1);
               String res = s +sign+q;
              return this.calculator(res);
              
            }
                
            }
            
        
return null;
        }
    public boolean search(String string){
        for (int i = 0; i < string.length(); i++) 
          if (string.charAt(string.length()-1)=='+'||string.charAt(string.length()-1)=='/'||string.charAt(string.length()-1)=='-'||string.charAt(string.length()-1)=='*') 
               return true;
        return false;
                
            
        
    }
   
    }

