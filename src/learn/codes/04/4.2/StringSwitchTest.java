

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
public class StringSwitchTest
{
	public static void main(String[] args)
	{
		// ��������season
		var season = "����";
		// ִ��swicth��֧���
		switch (season)
		{
			case "����":
				System.out.println("��ů����.");
				break;
			case "����":
				System.out.println("��������.");
				break;
			case "����":
				System.out.println("�����ˬ.");
				break;
			case "����":
				System.out.println("��ѩ����.");
				break;
			default:
				System.out.println("�����������");
		}
	}
}
