/*
len = 앞으로 갈수 있는 길이
앞으로 가면서 len의 값을 1씩 줄임
현재 순서의 값(앞으로 갈수 있는수)이 len의 값보다 크면 len=현재의값
현재 nums[i]값이 0이면 지나감
len값이 0보다 작으면 실패
복잡도 O(N)
1ms 41.2 MB
*/

class Solution {
    public boolean canJump(int[] nums) {
     int len=0;
        if(nums.length==1)return true;
		if(nums[0]==0) {
			return false;
		}
		len=nums[0];
		boolean can=true;
		for(int i=1;i<nums.length;i++) {
			len--;
			if(len<0) {
				can=false;
				break;
			}
			if(nums[i]==0)continue;
			if(nums[i]>len)len=nums[i];
		}
        return can;
    }
}
