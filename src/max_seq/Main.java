package max_seq;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		in.close();
		int[] a=new int [k]; 
		int count=0;
        int isnotpos=1,include0=0;
		String[] slist=s.split(" ");
		for(String cs:slist) {
			a[count++]=Integer.parseInt(cs);
            if (a[count-1]==0){
                include0=1;
            }
            else if (a[count-1]>0) {
				isnotpos=0;
			}
		}
		if ((include0==1)&&(isnotpos==1)){
            System.out.printf("0 0 0");
        }
        else if (isnotpos==1) {
			System.out.printf("%d %d %d",0,a[0],a[a.length-1]);
		}
		else{
			int tsum=0,maxsum=0,end=a.length-1,start=0,lsta=0;
			for (int i=0;i<a.length;i++) {
				tsum+=a[i];
				if (tsum<0) {
					tsum=0;
					lsta=i+1;
				}
				else {
					if(tsum>maxsum) {
						maxsum=tsum;
						end=i;
						start=lsta;
					}
				}
			}
			System.out.printf("%d %d %d", maxsum,a[start],a[end]);
		}
	}

}

