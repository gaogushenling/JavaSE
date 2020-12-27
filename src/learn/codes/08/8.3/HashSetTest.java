
import java.util.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */

// ��A��equals�������Ƿ���true����û����д��hashCode()����
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
// ��B��hashCode()�������Ƿ���1����û����д��equals()����
class B
{
	public int hashCode()
	{
		return 1;
	}
}
// ��C��hashCode()�������Ƿ���2������д��equals()�������Ƿ���true
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashSetTest
{
	public static void main(String[] args)
	{
		var books = new HashSet();
		// �ֱ���books��������������A��������B��������C����
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}