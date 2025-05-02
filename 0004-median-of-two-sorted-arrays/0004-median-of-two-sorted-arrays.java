class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,k=0;
        int[] merge=new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                merge[k++]=nums1[i++];
            }
            else{
                merge[k++]=nums2[j++];
            }
        }
        while(i<n){
            merge[k++]=nums1[i++];
        }
        while(j<m){
            merge[k++]=nums2[j++];
        }
        int len=n+m;
        if(len%2!=0){
            return (double)merge[len/2];
        }
        else{
            return (merge[len/2]+merge[(len/2)-1])/2.0;
        }
    }
}