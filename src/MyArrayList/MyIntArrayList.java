package MyArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
 
public class MyIntArrayList {
 
  private int[] elements;
  private int size;
  
  public void printArr (){
	  for(int i=0; i<size;i++){
		  System.out.print(elements[i]+" ");
	  }	
	  System.out.println();
  }
 
  public MyIntArrayList() {
    this(10);
  }
 
  public MyIntArrayList(int initialCapacity) {
    this.elements = new int[initialCapacity];
  }
  
  public int[] getElements(){
	  return Arrays.copyOf(elements, size);
  }
  
  public MyIntArrayList(MyIntArrayList c){
	  this.size=c.size();
	  elements=c.getElements();
	  }


  public void add(int index, int element){
	  if(index <0 || index > size-1){
		System.out.println("INDEX GRESIT !!!");
		return;
	  }		
	   if (this.size == this.elements.length) {
		      this.elements = Arrays.copyOf(this.elements, this.size * 2);
		    }
	  this.size++;
	  elements=Arrays.copyOf(elements, this.size);
	  for(int i=size-1; i>index; i--){
		  elements[i]=elements[i-1];
	  }
	  elements[index]=element;
  }
 
  public boolean add(int e) {
    if (this.size == this.elements.length) {
      this.elements = Arrays.copyOf(this.elements, this.size * 2);
    }
 
    this.elements[size] = e;
    this.size++;
 
    return true;
  }
 
  public int size() {
    return this.size;
  }
 
  public boolean contains(int e){
	for(int i=0; i<this.size;i++){
		if(elements[i]==e)
			return true;
	}
	return false;
  }
  
  public int get(int index){
	  return elements[index];
  }
  
  public int indexOf(int e) {
    for (int i=0; i<this.size; i++) {
      if (this.elements[i] == e) {
        return i;
      }
    }
    return -1;
  }
  
  public int lastIndexOf(int e) {
	    for (int i=size-1; i>=0; i--) {
	      if (this.elements[i] == e) {
	        return i;
	      }
	    }
	    return -1;
	  }
  
  public boolean remove(int e){
		  removeElementAtIndex(indexOf(e));
		  return true;
  }
 
  public int removeElementAtIndex(int index) {
    if (index < 0 || index >= this.size) {
      // should throw IndexOutOfBoundsException
      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
                         " remove element at position " + index);
      return -1;
    }
 
    int removedElement = this.elements[index];
    for (int i=index; i<this.size-1; i++) {
      this.elements[i] = this.elements[i+1];
    }
    this.size--;
 
    return removedElement;
  }
 
  public void clear() {
    this.size = 0;
  }
 
  public int set(int index, int e) {
    if (index < 0 || index >= this.size) {
      // should throw IndexOutOfBoundsException
      System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                         " the element " + e + " at position " + index);
      return -1;
    }
 
    int replacedElement = this.elements[index];
    this.elements[index] = e;
    return replacedElement;
  }
  
  public boolean addAll(MyIntArrayList c){
	  int oldSize = this.size;
	  if(this.size+c.size>elements.length){
		  elements=Arrays.copyOf(elements,this.size+c.size());
		  this.size+=c.size;
	  }
	  for(int i=oldSize;i<this.size;i++){
		  elements[i]=c.get(i);
	  }
	  return true;
  }

 public boolean addAll(int index, MyIntArrayList c){
	  int oldSize = this.size;
	  if(this.size+c.size>elements.length){
		  elements=Arrays.copyOf(elements,this.size+c.size());
		  this.size+=c.size;
	  }
	  if(index<0||index>size-1){
		  System.out.println("INDEX GRESIT !!");
		  return false;
	  }
	  int[] elements2 = new int[size];
	  for(int i=0; i<index; i++){
		  elements2[i]=elements[i];
	  }
	  for(int i=index; i<index+c.size;i++){
		  elements2[i]=c.get(i-index);
	  }
	  for(int i=index+c.size; i<size;i++){
		  elements2[i]=elements[i-c.size()];
	  }
	  elements=elements2;
	  return true;
 	}
 
 	public int[] toArray(){
 		return elements;
 	}
 	public void ensureCapacity(int minCapacity){
 		if(minCapacity>elements.length)
 			elements=Arrays.copyOf(elements, minCapacity);
 	}

 	public void trimToSize(){
 		if(elements.length>size)
 			elements=Arrays.copyOf(elements, size);
 	}

}