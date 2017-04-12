package refactor.app.impl;

public enum Key {
 One(1, 2, 4, 1),
 Two(2, 3, 5, 1),
 Three(3, 3, 6, 2),
 Four(1, 5, 7, 4),
 Five(2, 6, 8, 4),
 Six(3, 6, 9, 5),
 Seven(4, 8, 7, 7),
 Eight(5, 9, 8, 7),
 Nine(6, 9, 9, 8);

 private final int up;
 private final int right;
 private final int down;
 private final int left;

 public Key moveUp(){
 return parseKey(up);
 }

 public Key moveLeft(){
  return parseKey(left);
 }

 public Key moveDown(){
  return parseKey(down);
 }

 public Key moveRight(){
  return parseKey(right);
 }

 Key(int up, int right, int down, int left) {
  this.up = up;
  this.right = right;
  this.down = down;
  this.left = left;
 }

 public static Key parseKey(int key){
  return Key.values()[key-1];
 }

 @Override
 public String toString() {
  return String.valueOf(ordinal()+1);
 }
}
