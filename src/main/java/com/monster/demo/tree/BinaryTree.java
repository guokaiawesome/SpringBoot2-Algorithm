package com.monster.demo.tree;

public class BinaryTree {
	
	private Node root;
	
	/**
	 * 
	 * @description 二叉树的查找操作
	 * 查找节点的时间复杂度实际上就是树的高度，O(Log2N)
	 * @param key
	 * @return
	 */
	public Node find(Integer key) {
		Node current=root;
		//这里忽略person为空的情况，查找外面判断
		while(!key.equals(current.getPerson().getAge())) {
			
			//小于，go left
			if(key<current.getPerson().getAge()) {
				current=current.getLeftChild();
			}else {
				current=current.getRightChild();
			}
			
			//没有子节点
			if(current==null) {
				return null;
			}
		}
		return current;
	}
	
	/**
	 * 
	 * @description 插入一节节点
	 * @param person
	 */
	public void insert(Person person) {
		Node newNode=new Node();
		newNode.setPerson(person);
		if(null==root) {
			root=newNode;
		}else {
			Node current=root;
			Node parent;
			
			//内部退出
			while(true){
				parent=root;
				if(person.getAge()<current.getPerson().getAge()) {
					// go left
					current=current.getLeftChild();
					if(current==null) {
						parent.setLeftChild(newNode);
						return;
					}
				}else {
					current=current.getRightChild();
					if(current==null){
						parent.setRightChild(newNode);
						return;
					}
				}
			}
		}
	}
	
	/**
	 * 
	 * @description 先序遍历
	 */
	public void preordervisit() {
		
		
		
	}
	
	/**
	 * 
	 * @description 中续遍历(递归)
	 * 先遍历左子树，再访问根节点，再遍历右子树
	 */
	public void inordervisit(Node node) {
		if(node!=null) {
			inordervisit(node.getLeftChild());
			System.out.println("访问此节点");
			inordervisit(node.getRightChild());
		}
		
		
		
	}
	
	/**
	 * 
	 * @description 后序遍历
	 */
	public void postordervisit() {
		
		
		
	}
	
	/**
	 * 
	 * @description 找出最小值节点
	 * @return
	 */
	public Node minimum() {
		Node current=root;
		Node last=null;
		while(current!=null) {
			last=current;
			current=current.getLeftChild();
		}
		return last;
	}
	
	/**
	 * 
	 * @description 删除节点
	 * 分为三种情况
	 * 1.该节点是叶节点
	 * 2.该节点有一个子节点
	 * 3.该节点有两个子节点
	 */
	public boolean deleteNoChild(Integer key) {
		
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		while(!key.equals(current.getPerson().getAge())) {
			parent=current;
			if(key<current.getPerson().getAge()) {
				//go left
				isLeftChild=true;
				current=current.getLeftChild();
			}else {
				isLeftChild=false;
				current=current.getRightChild();
			}
			
			//没有找到
			if(current==null) {
				return false;
			}
		}
		
		//找到了对应的节点
		if(current.getLeftChild()==null && current.getRightChild()==null) {
			//判断是不是根节点
			if(current==root) {
				root=null;
			}else if(isLeftChild){
				//断开连接
				parent.setLeftChild(null);
			}else {
				parent.setRightChild(null);
			}
		}
		return false;
	}

	public boolean deleteOneChild(Integer key) {
		
		/*Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		while(!key.equals(current.getPerson().getAge())) {
			parent=current;
			if(key<current.getPerson().getAge()) {
				//go left
				isLeftChild=true;
				current=current.getLeftChild();
			}else {
				isLeftChild=false;
				current=current.getRightChild();
			}
			
			//没有找到
			if(current==null) {
				return false;
			}
		}
		
		//找到了对应的节点
		if(current.getLeftChild()==null && current.getRightChild()==null) {
			//判断是不是根节点
			if(current==root) {
				root=null;
			}else if(isLeftChild){
				//断开连接
				parent.setLeftChild(null);
			}else {
				parent.setRightChild(null);
			}
		}*/
		return false;
	}
	
	
	/**
	 * 
	 * @description 要删除节点左右子节点均存在
	 * @param key
	 * @return
	 */
	public boolean deleteTwoChild(Integer key) {
		
		/*Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		while(!key.equals(current.getPerson().getAge())) {
			parent=current;
			if(key<current.getPerson().getAge()) {
				//go left
				isLeftChild=true;
				current=current.getLeftChild();
			}else {
				isLeftChild=false;
				current=current.getRightChild();
			}
			
			//没有找到
			if(current==null) {
				return false;
			}
		}
		
		//找到了对应的节点
		if(current.getLeftChild()==null && current.getRightChild()==null) {
			//判断是不是根节点
			if(current==root) {
				root=null;
			}else if(isLeftChild){
				//断开连接
				parent.setLeftChild(null);
			}else {
				parent.setRightChild(null);
			}
		}*/
		return false;
	}
	
	
}
