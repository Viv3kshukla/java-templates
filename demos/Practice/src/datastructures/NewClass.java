//
//
//class BSTNode{
//    int data;
//    BSTNode left,right;
//    
//    BSTNode(int data){
//        this.data = data;
//        left =null;
//        right = null;
//    }
//}
//
//
//class BST{
//    BSTNode root;
//    
//    BST(){
//        root = null;
//    }
////    
////    
////    
////                                                                                    10
////                                                                                    
////                                                                        5                    15
////                                                                        
////                                                                                        14            17
////                                                                
////                                                                   16 
////    
//   int answer;
//    public int search(BSTNode node,int x,int closest){
//    
//        
//        
//        if(closest< Math.abs(x-node.data)){
//            answer = node.data;
//            closest = Math.abs(x-node.data);
//        }
//    
//        if(cloeset == 0){
//            return x;
//        }
//                                                                                                                            
//        else if(node.data > x){
//            if(node.left == null){
//            
//                return answer;
//            }
//            else{
//                return search(node.left,x);
//            }
//        }
//            
//        else{
//        
//            if(node.right == null){
//                return answer;
//            }
//            else{
//                return search(node.right,x);
//            }
//            
//        }    
//            
//    
//    }
//    
//    
//    
//
//
//}