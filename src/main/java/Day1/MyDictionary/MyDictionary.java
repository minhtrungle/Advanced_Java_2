package Day1.MyDictionary;
 // Key viết tắt là K
// Value viết tắt V
    public class MyDictionary<K, V> {
        private K k;
        private V v;

        public MyDictionary() {
        }

        public MyDictionary(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return "[Key = " + k + ", Value = " + v + "]";
        }
}
