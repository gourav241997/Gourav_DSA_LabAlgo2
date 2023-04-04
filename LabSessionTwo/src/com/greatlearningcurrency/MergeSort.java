package com.greatlearningcurrency;

public class MergeSort implements IntegerSorting{
	
	public void sort(int[] arr)
	{
		sort(arr,0,arr.length-1);
	}
	
	private void sort(int[] arr,int left,int right)
	{
		if(left < right)
		{
			int mid =(left +right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	private void merge(int[] arr ,int left ,int mid,int right)
	{
		int n1 =mid -left;
		int n2 =right - mid -1;
		
		int[] leftArr =new int[n1];
		int[] rightArr =new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftArr[i] = arr[left+i];
		}
		for (int j=0;j<n2;j++)
		{
			rightArr[j]=arr[mid+j+1];
		}
		int i=0,j=0,k=left;
		while(i<n1 && j<n2)
		{
			if(leftArr[i] >= rightArr[j])
			{
				arr[k] = leftArr[i];
				i++;
			}else
			{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

}
