class MedianFinder {

    Queue<Integer> minHeap, maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((x, y) -> (y - x));
    }
    
    public void addNum(int num) {
        if(minHeap.size() == maxHeap.size()){
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }else{
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size()){
            return (minHeap.peek() + maxHeap.peek()) / 2.0; //Attention 2.0!!!
        }else{
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
