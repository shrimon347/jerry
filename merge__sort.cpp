#include <iostream>
using namespace std;
void merge (int ar[], int temp[], int lo, int mid, int hi) {
	for (int i = lo, j = mid + 1, k = lo; k <= hi; k++) {
		if (i == mid + 1) 	temp[k] = ar[j++];
		else if (j == hi + 1) 	temp[k] = ar[i++];
		else if (ar[i] < ar[j]) temp[k] = ar[i++];
		else temp[k] = ar[j++];
	}
	for (int i = lo; i <= hi; ++i)
		ar[i] = temp[i];
}
void ms (int ar[], int temp[], int lo, int hi) {
	if (lo == hi) return;
	int mid = (lo + hi) / 2;
	ms (ar, temp, lo, mid);
	ms (ar, temp, mid + 1, hi);
	merge (ar, temp, lo, mid, hi);
}
int main () {
    cout<< "Enter array length : ";
	int n; cin >> n;
	int ar[n], temp[n];
	cout<< "Enter array elements to merge sort : ";
	for (int i = 0; i  < n; ++i)
		cin >> ar[i];
	ms (ar, temp, 0, n - 1);
    cout<< "Merge Sort elements are : ";
	for (int i = 0; i < n; ++i)
		cout << ar[i] << " \n"[i == n - 1];
}