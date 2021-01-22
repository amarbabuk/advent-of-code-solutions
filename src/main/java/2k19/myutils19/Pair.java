package myutils19;

public class Pair <K, V extends Comparable<V>> implements Comparable<Pair<K, V>>{
    private K k;
    private V v;
    
    public Pair(K k, V v) {
	this.k = k;
	this.v = v;
    }
    
    public K k() {
	return k;
    }
    
    public V v() {
	return v;
    }
    
    @Override
    public boolean equals(Object o) {
	if(this == o) {
	    return true;
	}
	if(o == null || !(o instanceof Pair)) {
	    return false;
	}
	@SuppressWarnings("unchecked")
	Pair<K, V> that = (Pair<K, V>) o;
	
	return this.k.equals(that.k);
    }
    
    @Override
    public int hashCode() {
	return k.hashCode();
    }
    
    @Override
    public String toString() {
	return "Key: " + k.toString() + ", Value: " + v.toString();
    }

    @Override
    public int compareTo(Pair<K, V> o) {
	return o.v.compareTo(this.v);
    }

}
