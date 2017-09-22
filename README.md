# 程序设计入门Java
网易云课堂 翁恺老师的 程序设计入门Java课程的测验与作业
因为本学期修了WK的Java应用设计课程，因此希望可以和课程同步学习Java，此项目用来作为记录。

Java语言程序设计入门
Week1
	Outline
		○ 1-2.1 输入 (12:02) 要读输入，需要先构建一个Scanner的对象，然后让它来做各种形式的读的动作。
		○ 1-2.2 变量 (07:38) 要保存读到的内容，就需要定义各种变量。
		○ 1-2.3 赋值 (12:30) 然后用变量做各种计算，将结果直接输出或者保存到变量中。
		○ 1-2.4 浮点数 (13:45) 生活中数字就是数字，可是在计算机里，完整的不带小数点的数和带小数点的数是不同的，不带小数点的数叫做整数，而带小数点的数叫做浮点数。
		○ 1-2.5 优先级 (05:21) 要做计算需要用到各种计算的符号——加减乘除什么的，这些在计算机里叫做运算符。不同的运算符有不同的优先级，就是说当一个式子里有多个运算符的时候，谁先算谁后算是有讲究的。
		○ 1-2.6 类型转换 (04:46) 既然我们有整数还有浮点数，那么这两种数之间怎么互相转换呢？
	
	Note
		1. I/O
			输入:Scanner in = new Scanner(System.in);
			输出:System.out.println("Hello"+in.nexline());
		2. 变量
			Java是一种强类型语言，必须定义数据类型并且不可以改变；
			常量：final+数据类型；
			类型转换：（int）+数据；类型转换不会改变原来的值，只是有了一个新的值作为结果
		
Week2
	Outline:
		1. 比较
		2. 判断
			1) if-else
			2) switch-case
	Notes：
		1. 判断的时候需要注意double，因为会有误差；
		    Math.abs(a-b) < (1e-6);
		2. swich-case记得要加break
	
Week3
	Outline：
		1. while
		2. do-while
		
	Assignment:
		提取整数中的每一位数字
		int a = 1574444;
		 String aS = String.valueOf(a);
		 char[] asC = aS.toCharArray(); 
		 for(int i=0;i<asC.length;i++)
		{
		       System.out.println(asC[i]);
		  }

