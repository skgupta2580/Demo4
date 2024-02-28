//03/02/2024
/*
class A{}
class B{}
class C implements Runnable
{
	A a1;
	B b1;
	C(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class C run method");
		synchronized(A.class)
		{
		System.out.println("class C synchronized Block_1");
		synchronized(B.class)
		{
		System.out.println("class C synchronized Block_2");
		}
		}
	}
}
class D implements Runnable
{
	A a1;
	B b1;
	D(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class D run method");
		synchronized(B.class)
		{
		System.out.println("class D synchronized Block_1");
		synchronized(A.class)
		{
		System.out.println("class D synchronized Block_2");
		}
		}
	}
}
class Demo
{
	public static void main(String ar[])
	{
		A a1=new A();
		B b1=new B();
		
		C c1=new C(a1,b1);
		D d1=new D(a1,b1);
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(d1);
		
		t1.start();
		t2.start();
	}
}
*/
/*		
class A{}
class B{}
class C implements Runnable
{
	A a1;
	B b1;
	C(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class C run method");
		synchronized(A.class)
		{
		System.out.println("class C synchronized Block_1");
		synchronized(B.class)
		{
		System.out.println("class C synchronized Block_2");
		}
		}
	}
}
class D implements Runnable
{
	A a1;
	B b1;
	D(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class D run method");
		synchronized(B.class)
		{
		System.out.println("class D synchronized Block_1");
		synchronized(A.class)
		{
		System.out.println("class D synchronized Block_2");
		}
		}
	}
}
class Demo
{
	public static void main(String ar[])
	{
		A a1=new A();
		B b1=new B();
		
		C c1=new C(new A(),new B());
		D d1=new D(new A(),new B());
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(d1);
		
		t1.start();
		t2.start();
	}
}
*/
/*
class A{}
class B{}
class C implements Runnable
{
	A a1;
	B b1;
	C(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class C run method");
		synchronized(a1)
		{
		System.out.println("class C synchronized Block_1");
		synchronized(b1)
		{
		System.out.println("class C synchronized Block_2");
		}
		}
	}
}
class D implements Runnable
{
	A a1;
	B b1;
	D(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class D run method");
		synchronized(b1)
		{
		System.out.println("class D synchronized Block_1");
		synchronized(a1)
		{
		System.out.println("class D synchronized Block_2");
		}
		}
	}
}
class Demo
{
	public static void main(String ar[])
	{
		A a1=new A();
		B b1=new B();
		
		C c1=new C(new A(),new B());
		D d1=new D(new A(),new B());
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(d1);
		
		t1.start();
		t2.start();
	}
}
*/
/*
class A
{
	synchronized void show1()
	{
		System.out.println("class A show1 method");
	}
	synchronized void show2(B b1)
	{
		System.out.println("class A show2 method");
		b1.show1();
	}
}
class B
{
	synchronized void show1()
	{
		System.out.println("class B show1 method");
	}
	synchronized void show2(A a1)
	{
		System.out.println("class B show2 method");
		a1.show1();
	}
}
class C implements Runnable
{
	A a1;
	B b1;
	C(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class C run method");
		a1.show2(b1);
	}
}
class D implements Runnable
{
	A a1;
	B b1;
	D(A a1,B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("class D run method");
		b1.show2(a1);
	}
}
class Demo
{
	public static void main(String ar[])
	{
		A a1=new A();
		B b1=new B();
		
		C c1=new C(a1,b1);
		D d1=new D(a1,b1);
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(d1);
		
		t1.start();
		t2.start();
	}
}
*/
//04/02/2024
/*
class A implements Runnable
{
	synchronized public void run()
	{
		System.out.println("class A run method start");
		
		System.out.println("class A run method complete");
	}
}
class Demo
{
	static public void main(String ar[])
	{
		A a1=new A();
		//A a2=new A();
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		t1.start();
		t2.start();
	}
}
*/
/*
class A
{
	synchronized void show()throws Exception
	{
		System.out.println("ram");
		System.out.println("wait.....");
		try{wait(2000);}catch(Exception e){}
		System.out.println("sita");
	}
}
class Demo
{
	static public void main(String ar[])throws Exception
	{
		A a1=new A();
		a1.show();
	}
}
*/
/*
class A implements Runnable
{
	synchronized void show1()
	{
		System.out.println("show 1 method call");
		notify();
		System.out.println("gita");
		
	}
	synchronized void show2()
	{
		System.out.println("ram");
		System.out.println("wait...");
		try{wait();}catch(Exception e){}
		System.out.println("sita");
	}
	int c=1;
	public void run()
	{
		if(c==1)
		{
			c++;
			show2();
		}
		else
		{
			show1();
		}
	}
}
class Demo
{
	static public void main(String ar[])
	{
		A a1=new A();
		A a2=new A();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		t1.start();
		try{Thread.sleep(1000);}catch(Exception e){}
		t2.start();
	}
}

*/

class A 
{
	void show()
	{
		System.out.println("ram");
		System.out.println("wait>>>>>>>.");
		try{wait();}catch(Exception e){}
		System.out.println("sita");
	}
}
class Demo{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.show();
	}
}