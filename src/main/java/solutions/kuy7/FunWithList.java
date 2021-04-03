package solutions.kuy7;

class FunWithList {
  static int indexOf(Node head, Object value) {
    if (head == null || value == null) {
      return -1;
    }
    Node current = head;
    int count = 0;
    while(current.next != null) {
      if (current.data == value) {
        return count;
      }
      current = current.next;
      count++;
    }
    return -1;
  }
}
