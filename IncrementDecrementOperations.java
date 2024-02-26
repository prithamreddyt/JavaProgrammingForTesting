package Javasessions;

public class IncrementDecrementOperations {

	public static void main(String[] args) {
		

		// "++" and "--"
		// Post Increment --> a++
		// Pre  Increment --> ++a
		// Post Decrement --> a--
		// Pre  Decrement --> --a
	
		
		System.out.println("Post Increment --> a++");
	
			int a=1;
			int b=a++;
			System.out.println(a);
			System.out.println(b);
						
			int aa=5;
			int bb=aa++;
			System.out.println(aa);
			System.out.println(bb);

			int aaa=-5;
			int bbb=a++;
			System.out.println(aaa);
			System.out.println(bbb);
			
		System.out.println("Pre Increment --> ++a");
		
			int p=1;
			int q=++p;
			System.out.println(p);
			System.out.println(q);
			System.out.println("");

			int pp=6;
			int qq=++pp;
			System.out.println(pp);
			System.out.println(qq);
			System.out.println("");
			
			int ppp=-7;
			int qqq=++ppp;
			System.out.println(ppp);
			System.out.println(qqq);
			System.out.println("");

		System.out.println("Post decrement --> a--");
	
			int d=6;
			int e=d--;
			System.out.println(d);
			System.out.println(e);
			System.out.println("");

			int dd=9;
			int ee=dd--;
			System.out.println(dd);
			System.out.println(ee);
			System.out.println("");
			
			int ddd=-7;
			int eee=ddd--;
			System.out.println(ddd);
			System.out.println(eee);
			System.out.println("");

		System.out.println("Pre decrement --> --a");
		
			int u=6;
			int v=--u;
			System.out.println(u);
			System.out.println(v);
			System.out.println("");
	
			int uu=9;
			int vv=--uu;
			System.out.println(uu);
			System.out.println(vv);
			System.out.println("");
			
			int uuu=-7;
			int vvv=uuu--;
			System.out.println(uuu);
			System.out.println(vvv);
			System.out.println("");
			
			
	}

}
