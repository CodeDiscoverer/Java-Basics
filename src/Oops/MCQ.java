package Oops;

class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class MCQ {
    public static void main(String[] args) {
        Counter c1 = new Counter(5);
        Counter c2 = c1;

        c1.increment();

        System.out.println(c2.getCount());
    }
}

/*
Correct Answer:

6
Explanation:
In this simplified code:

-> We created another reference c2 and initially point it to the same Counter object as c1.
Both c1 and c2 reference the same Counter object.
-> We use c1.increment() to increment the count in the object.
-> Finally, we print the count value using c2.getCount();.

Since both c1 and c2 refer to the same Counter object, when we increment the count using c1,
it also affects the object referenced by c2. Therefore, the output will be B) 6.
 */