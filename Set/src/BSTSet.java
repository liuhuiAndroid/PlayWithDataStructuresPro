public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    @Override
    public void add(E e) {
        bst = new BST<>();
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
