package codings;
import java.util.*;

class TestClass {
	static int val=0;
	public static void main(String args[] ) throws Exception {
		
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> [] vec= new ArrayList[n+1];
    	for(int i=0;i<=n;i++) {
    		vec[i] = new ArrayList<Integer>();
    	}
        int root=-1;
    	for(int i=1;i<=n;i++) {
    		int x = scan.nextInt();
    		if(x == -1) {
    			root = i;
    			continue;
    		}
    		vec[i].add(x);
    		vec[x].add(i);
    		
    	}
    	
    	int temp[] = new int[n+1];
    	Arrays.fill(temp, 0);
    	int m = scan.nextInt();
    	for(int i=0;i<m;i++) {
    		int x = scan.nextInt();
    		temp[x] = -1;
    	}
    	val = 0;
    	
    	dfs(vec,temp,root,0);
    		
        System.out.println(val);
    		
    		
        
    }
    
    public static void dfs(ArrayList<Integer> [] vec,int [] temp,int s,int par) {
    	for(int i=0;i<vec[s].size();i++) {
    		int v = vec[s].get(i);
    		if(v == par) {
    			continue;
    		}
    		
    		if(temp[v] == -1) {
    			val++;
    			continue;
    		}
    		
    		dfs(vec,temp,v,s);
    	}
    }
    
}
