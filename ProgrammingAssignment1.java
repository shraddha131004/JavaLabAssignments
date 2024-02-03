class SY2022bit036{
	public static void main(String[] args){
	String str[]={"2022bit031","2021bit021","2021bcs045","2023bme091","2019bch036","2020bch123","2000tib456","2010ijk567","2013bch453","2014bcs111"};
	tp obj = new tp();
	System.out.print("Valid Registrations:");
	System.out.println(obj.getValidRegistrationsCount(str));
	
	}
	public int getValidRegistrationsCount(String s[]) {
	
	int count = 0;
	 for(int i=0;i<s[0].length();i++){
	 
        if(s[i].length()==10 && ((s[i].charAt(4)=='b'&& s[i].charAt(5)=='i' && s[i].charAt(6)=='t')||(s[i].charAt(4)=='b'&& s[i].charAt(5)=='c' && s[i].charAt(6)=='s')||(s[i].charAt(4)=='b'&& s[i].charAt(5)=='c' && s[i].charAt(6)=='h')||(s[i].charAt(4)=='b'&& s[i].charAt(5)=='m' && s[i].charAt(6)=='e')) && 
        (s[i].charAt(7)=='0'||s[i].charAt(7)=='1'||s[i].charAt(7)=='2'||s[i].charAt(7)=='3'||s[i].charAt(7)=='4'||s[i].charAt(7)=='5'||s[i].charAt(7)=='6'||s[i].charAt(7)=='7'||s[i].charAt(7)=='8'||s[i].charAt(7)=='9') &&
        (s[i].charAt(8)=='0'||s[i].charAt(8)=='1'||s[i].charAt(8)=='2'||s[i].charAt(8)=='3'||s[i].charAt(8)=='4'||s[i].charAt(8)=='5'||s[i].charAt(8)=='6'||s[i].charAt(8)=='7'||s[i].charAt(8)=='8'||s[i].charAt(8)=='9') &&
        (s[i].charAt(9)=='0'||s[i].charAt(9)=='1'||s[i].charAt(9)=='2'||s[i].charAt(9)=='3'||s[i].charAt(9)=='4'||s[i].charAt(9)=='5'||s[i].charAt(9)=='6'||s[i].charAt(9)=='7'||s[i].charAt(9)=='8'||s[i].charAt(9)=='9')&& 
        (s[i].contains("2000")||s[i].contains("2001")||s[i].contains("2002")||s[i].contains("2003")||s[i].contains("2004")||s[i].contains("2005")||s[i].contains("2006")||s[i].contains("2007")||s[i].contains("2008")||s[i].contains("2009")||s[i].contains("2010")||s[i].contains("2011")||s[i].contains("2012")||s[i].contains("2013")||s[i].contains("2014")||s[i].contains("2015")||s[i].contains("2016")||s[i].contains("2017")||s[i].contains("2018")||s[i].contains("2019")||s[i].contains("2020")||s[i].contains("2021")||s[i].contains("2022")||s[i].contains("2023")||s[i].contains("2024") )){
        count++;
        }
        }
         return count;
        }
}























