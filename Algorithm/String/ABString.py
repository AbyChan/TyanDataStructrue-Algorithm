__author__ = 'tyan'

# 给定n个A和2n个B，用这些字符拼成一个字符串，要求这个串的所有前缀和后缀B的个数始终不少于A。
# （一个字符串的前缀是只从开头到某个位置为止的子串，后缀是只从某个位置到结尾的子串）。
# 输入格式
# 多组数据，每组数据只有一行，包含一个正整数n。（n<=10^17)。
# 输出格式
# 每组数据输出一行，最终结果对99991取余数的结果。

def count(n,m,ac,bc,sb):
    if(ac==n or bc==m):
        print sb;
        return 1;
    if(ac==bc):
        sb.append('b')
        tmp = count(n,m,ac,bc+1,sb);
        sb.pop()
        return tmp;
    else:
        sb.append('a');
        tmp0=count(n,m,ac+1,bc,sb);
        sb.pop();
        sb.append('b');
        tmp0 = tmp0+count(n,m,ac,bc+1,sb)
        sb.pop()
        return tmp0;


n=2
m=2*n
print count(n,m,0,0,[]);