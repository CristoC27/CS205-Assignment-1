package edu.monmouth.hw1;
import edu.monmouth.vehicle.*;
public class VehicleList {
	private VehicleNode head = null;
	public VehicleList() {
		
	}
	public void insert(Vehicle v) {
		VehicleNode newNode = new VehicleNode(v);
		newNode.setNext(head);
		head = newNode;
	}
	public void insertEnd(Vehicle v) {
		VehicleNode newNode = new VehicleNode(v);
		last().setNext(newNode);
		
	}
	public VehicleNode first() {
		return head;
	
	}
	public VehicleNode last() {
		if (isEmpty()) {
			System.err.println("List is empty! Cannot get last item");
			return null;
		}
		else if (head.getNext() == null){
			return head;
			}
		else {
			VehicleNode nextNode = head.getNext();
			while (nextNode.getNext() != null) {
				nextNode = nextNode.getNext();
			}
			return nextNode;
		}
	}
	public VehicleNode removeFirst() {
		if(isEmpty()) {
			System.err.println("List is empty! Cannot remove item");
			return null;
		}
		else {
		VehicleNode oldHead = head;
		head = head.getNext();
		return oldHead;		
		}
		
	}
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public int size() {
		if (head == null) {
			return 0;
		}
		else if (head.getNext() == null) {
				return 1;
			
		}
		else {
			VehicleNode nextNode = head.getNext();
			int count = 2;
			while (nextNode.getNext() != null) {
				count++;
				nextNode = nextNode.getNext();
			}
			return count;
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(VehicleNode current = head; current != null; current = current.getNext()) {
			sb.append(current.toString());
		}
		return sb.toString();
	}
}
