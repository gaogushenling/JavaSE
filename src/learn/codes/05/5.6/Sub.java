

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
class Base
{
	public double size;
	public String name;
	public Base(double size, String name)
	{
		this.size = size;
		this.name = name;
	}
}
public class Sub extends Base
{
	public String color;
	public Sub(double size, String name, String color)
	{
		// ͨ��super���������ø��๹�����ĳ�ʼ������
		super(size, name);
		this.color = color;
	}
	public static void main(String[] args)
	{
		var s = new Sub(5.6, "���Զ���", "��ɫ");
		// ���Sub���������ʵ������
		System.out.println(s.size + "--" + s.name
			+ "--" + s.color);
	}
}