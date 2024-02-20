
class PRIME1{
	static int prime =0;
	static long nonprime =0;
	static long x[] = new long[7];
	static long randomarray[] = new long[1000000];
	public static void main(String args[]){
		long starttime = System.nanoTime();
		randomarray();
		int p = isprime(randomarray);
		System.out.println("Prime count:"+ p);
		System.out.println("Non-Prime count:"+(10000 - p));
		long endtime = System.nanoTime();
		long time = (endtime - starttime);
		System.out.println("Time in nanosecs for PRIME1:"+time);
	     
	}
	public static long generate7digit(){
		for(int i=0;i<7;i++){
		x[i] = System.nanoTime()%10;
		}
		for(int i=0;i<7;i++){
		if(x[0]==0){
		long replace = System.nanoTime()%10;
		x[0] = replace;
		}
		
		
		}
		String concate = String.valueOf(x[0])+ String.valueOf(x[1]) + String.valueOf(x[2]) + String.valueOf(x[3]) + String.valueOf(x[4]) + String.valueOf(x[5]) + String.valueOf(x[6]);
		
		return Long.parseLong(concate);
		
	}
	public static long randomarray(){
	int i = 0;
		for(i =0;i<1000000;i++){
			randomarray[i] = generate7digit();
		}
		
		return 1;
	}
	public static int isprime(long randomarray[]){
		int count =0;
		randomarray();
		
		for(int i=1;i<10000;i++){
			for(int j=1;j<randomarray[i];j++){
				if(randomarray[i]%j == 0){
				count++;
				}
			}
			if(count<2){
			nonprime++;
			}
			else{
			
			prime++;
						
			}
			}
			
			return prime;
		}
	
}


class PRIME2{

	static int prime =0;
	static long nonprime =0;
	static long x[] = new long[7];
	static long randomarray[] = new long[1000000];
	public static void main(String args[]){
		long starttime = System.nanoTime();
		randomarray();
		int p = isprime(randomarray);
		System.out.println("Prime count:"+ p);
		System.out.println("Non-Prime count:"+(10000 - p));
		long endtime = System.nanoTime();
		long time = (endtime - starttime);
		System.out.println("Time in nanosecs for PRIME2:"+time);
	     	      
	}
	public static long generate7digit(){
		for(int i=0;i<7;i++){
		x[i] = System.nanoTime()%10;
		}
		for(int i=0;i<7;i++){
		if(x[0]==0){
		long replace = System.nanoTime()%10;
		x[0] = replace;
		}
		
		
		}
		String concate = String.valueOf(x[0])+ String.valueOf(x[1]) + String.valueOf(x[2]) + String.valueOf(x[3]) + String.valueOf(x[4]) + String.valueOf(x[5]) + String.valueOf(x[6]);
		
		return Long.parseLong(concate);
		
	}
	public static long randomarray(){
	int i = 0;
		for(i =0;i<1000000;i++){
			randomarray[i] = generate7digit();
		}
		
		return 1;
	}
	public static int isprime(long randomarray[]){
		int count =0;
		randomarray();
		
		for(int i=1;i<10000;i++){
			for(int j=1;j<randomarray[i];j++){
				if(randomarray[i]%j == 0){
				count++;
				}
			}
			if(count>2){
			prime++;
			}
			else{
			
			nonprime++;
						
			}
			}
			
			return prime;
		}
	
}
