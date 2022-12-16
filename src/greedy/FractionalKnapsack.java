package greedy;


import java.util.Arrays;

public class FractionalKnapsack {
    static double fractionalKnapsack(int W, Item[] arr, int n)
    {
        double ans = 0.0;
        for (int i = 0; i < n; i++) {
            arr[i].value = arr[i].value/arr[i].weight;
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            int val = arr[i].value*arr[i].weight;
            if(W>arr[i].weight) {
                ans += val;
                W -= arr[i].weight;
            } else {
                ans += arr[i].value*W;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Item[] arr = new Item[3];
        arr[0] = new Item(60,10);
        arr[1] = new Item(100,20);
        arr[2] = new Item(120,30);
        int W = 50;
        double ans = fractionalKnapsack(W, arr, 3);
        System.out.println("The max profit is :" + ans);
    }
    static class Item implements Comparable<Item>{
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
        public int compareTo(Item o) {
            return this.value - o.value;
        }
    }
}
