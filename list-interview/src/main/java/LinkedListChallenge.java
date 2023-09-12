/**
 * Implementacao base de lista
 * 1 - Permitir adicionar itens na lista
 * 2 - Não permitir adicionar valores na lista repetidos
 * 3 - Permitir remover itens da lista
 */
public class LinkedListChallenge<V> {
    private ListNode<V> first;

    public static class ListNode<V> {
        private V value;
    }


    public void add(V value) {
    }


    public int size() {
        return 0;
    }

    public void remove(V value) {
    }

    private boolean hasValue(Object value) {
        return false;
    }

    public V firstValue() {
        V value = null;
        if (this.first != null) {
            value = this.first.value;
        }
        return value;
    }

    public boolean isEmpty() {
        return this.first == null && this.size() == 0;
    }

}
