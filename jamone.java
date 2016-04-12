import java.util.*;


class jamone{
    public static  List<Integer> list = new ArrayList<>();
    
    public static List<Integer> comp = new ArrayList<>();
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	
	
	
	for(int i=0;i<=9;i++)
	    comp.add(i);
	
	int t = in.nextInt();
	
	
	for(int i=1; i<=t; i++){
	    
	    int n = in.nextInt();
	    save(n);
	    int h = 0;
	    int k = 1;
	    int f=0;
	   

	    Collections.sort(list);
	    while(!comp.equals(list)){
		if (n==0){
		    f=1;
		    break;
		}
		k++;
		h=n*k;
		save(h);
		Collections.sort(list);
	    }
	    // System.out.println(list);
	    if (f==0)
		System.out.println("Case #"+i+":" +" "+ h);
	    if (f==1)
		System.out.println("Case #"+i+":" +" "+ "INSOMNIA");
	}
	
    }
    
    
    public static void save(int l){
	while (l>0){
	    if (!list.contains(l%10))
		list.add(l%10);
	    l=l/10;
	}
    }
	    
}




