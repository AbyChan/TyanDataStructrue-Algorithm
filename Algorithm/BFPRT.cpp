/*  * BFPRT.cpp
 *寻找最小的K个数
 *  Created on: 2013-8-19
 *  Author:   */
/************************************************************************/
#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

#define MAX_VALUE 20
#define random() rand()%MAX_VALUE
#define N 20
int a[N];
//测试序列
//int a[N] = {0,5,1,4,4,4,4,3,2};
//int a[N] = {5,5,5,5,5,5,5,5,5};

class Find {
public:
	void bubble(int first, int end) //冒泡排序
			{
		for (int flag = first; flag < end; flag++) {
			for (int i = end; i > flag; i--) {
				if (a[i] < a[i - 1]) {
					int t = a[i];
					a[i] = a[i - 1];
					a[i - 1] = t;
				}
			}
		}
	}

	//求取最小的k个数
	//数组a中从a[p]到a[r]的元素按照x划分,大于或者等于x的在右边,小于x的在左边
	int partitionModify(int p, int r, int x) {
		int i, j;

		for (i = p, j = r; i < j; i++) {
			if (a[i] >= x) {
				while (i < j && a[j] >= x) {
					j--;
				}

				if (i != j) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
					j--;
				} else {
					break;
				}
			}
		}

		/*上面的循环结束分为几种情况
		 1 i > j 此时必定有 a[i] >= x，否则 a[j+1] = a[i] < x 与 a[j+1] >= x 矛盾 ,如果不是边界，进入if语句
		 2 i = j 此时如果 a[i] < x 则a[i+1] = a[j+1] >x 返回 i
		 3 当i==p,此时直接返回边界元素下标
		 4 当i == r,此时为右边界，此时a[i]肯定为x，返回i - 1，也即r - 1
		 */
		if (a[i] >= x && i > p) {
			return i - 1;
		}
		return i;
	}

	//将r-p+1个数据按五个元素分为一组，分别找出各组的中位数，
	//再将各组的中位数与数组开头的数据在组的顺序依次交换，对这些各组的中位数
	//按同样的方法继续求出中位数，最后得出的整个数组的中位数，利用中位数就可以将数据按照与中位数的比较
	//来划分
	int selectModify(int p, int r, int k) //寻找中位数
			{
		int i;

		if (r - p + 1 <= 5) {
			bubble(p, r);
			return a[p + k - 1];
		}

		//将r-p+1个数据按五个元素分为一组，可以分为(r - p + 1) / 5组
		//分别找出各组的中位数，再将各组的中位数与数组开头的数据按组的顺序依次交换
		for (i = 0; i < (r - p + 1) / 5; i++) {
			int s = p + 5 * i, t = s + 4;
			bubble(s, t);
			int temp = a[p + i];
			a[p + i] = a[s + 2];
			a[s + 2] = temp;
		}

		//对这些各组的中位数
		//按同样的方法继续求出中位数，最后得出的整个数组的中位数 x
		int x = selectModify(p, p + (r - p + 1) / 5 - 1, (r - p + 6) / 10);

		i = partitionModify(p, r, x);
		int j = i - p + 1;

		if (k <= j) {
			return selectModify(p, i, k);
		} else {
			return selectModify(i + 1, r, k - j);
		}
	}
};

int main() {
	clock_t start, end;
	double elapsed;
	srand((int) time(NULL));
	for (int k = 0; k < N; k++) {
		a[k] = random();
		cout << a[k] << " ";
	}
	cout << endl;
	start = clock();
	Find f;
	int n = 4;
	cout << "The No." << n << " is :" << f.selectModify(0, N - 1, n) << endl;
	end = clock();
	elapsed = ((double) (end - start));
	//CLOCKS_PER_SEC;
	cout << "Time: " << elapsed << endl;
	cout << "最小的" << n << "个元素为：" << endl;

	for (int k = 0; k < n; k++) {
		cout << a[k] << " ";
	}

	return 0;
}
