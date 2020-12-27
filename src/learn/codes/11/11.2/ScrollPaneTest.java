
import java.awt.*;
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
public class ScrollPaneTest
{
	public static void main(String[] args)
	{
		var f = new Frame("���Դ���");
		// ����һ��ScrollPane������ָ�����Ǿ��й�����
		var sp = new ScrollPane(
			ScrollPane.SCROLLBARS_ALWAYS);
		// ��ScrollPane�����������������
		sp.add(new TextField(20));
		sp.add(new Button("������"));
		// ��ScrollPane�������ӵ�Frame������
		f.add(sp);
		// ���ô��ڵĴ�С��λ��
		f.setBounds(30, 30, 250, 120);
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
