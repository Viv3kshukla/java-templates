//package codings;
//
//import java.util.LinkedList;
//
//import codings.DopoPoet.hmnodes;
//public class Hmap<K,V> {
//	public class Hnode{
//		K key;
//		V value;
//	}
//	
//	private int size = 0;
//	private LinkedList<Hnode> buckets[];
//	
//	public Hmap() {
//		buckets = new LinkedList[4];
//		for(int i=0;i<4;i++) {
//			buckets[i] = new LinkedList<>();
//		}
//	}
//	
//	public void put(K key,V value) throws Exception{
//		int bi = bucketIndex(key);
//		int foundAt = find(bi,key);
//		if(fountAt == -1) {
//			Hnode temp = new Hnode();
//			temp.key = key;
//			temp.value = value;
//			buckets[bi].addLast(temp);
//			this.size++;
//		}
//		else {
//			buckets[bi].get(foundAt).value = value;
//		}
//		
//		double lambda = (this.size*1.0)/this.buckets.length;
//		if(lambda>2.0){
//			rehash();  //rehashing function which will increase the size of bucket as soon as lambda exceeds 2.0
//		}
//		
//		
//		
//	}
//	
//	public int bucketIndex(K key) throws Exception {
//		int bi = key.hashCode();
//		return Math.abs(bi%buckets.length);
//		
//	}
//	
//	public int find(int bi,K key) throws Exception{
//		for(int i=0;i<buckets[bi].size();i++) {
//			if(key.equals(buckets[bi].get(i).key)) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//	private void rehash() throws Exception{
//		LinkedList<hmnodes> ob[]= buckets;
//		buckets=new LinkedList[ob.length*2];
//		for(int i=0;i<ob.length*2;i++)
//			buckets[i]=new LinkedList<>();
//		
//		size = 0;
//		for(int i=0;i<ob.length;i++){
//			for(int j=0;j<ob[i].size();j++){
//				put(ob[i].get(j).key,ob[i].get(j).value);
//			}
//		}
//		
//	}
//	
//	
//	
//}
