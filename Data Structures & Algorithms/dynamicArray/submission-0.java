class DynamicArray {

    int size = 0;
    int capacity = 0;
    int[] arr;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public int get(int i) {
        if (i>=size) {
            return -1;
        }

        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size==capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return arr[size];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];

        for (int i=0; i<capacity/2; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
