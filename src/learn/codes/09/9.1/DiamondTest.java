
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
public class DiamondTest
{
	public static void main(String[] args)
	{
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> books = new ArrayList<>();
		books.add("���Java����");
		books.add("���Android����");
		// ����books���ϣ�����Ԫ�ؾ���String����
		books.forEach(ele -> System.out.println(ele.length()));
		// Java�Զ��ƶϳ�HashMap��<>��Ӧ����String, List<String>
		Map<String, List<String>> schoolsInfo = new HashMap<>();
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> schools = new ArrayList<>();
		schools.add("б�����Ƕ�");
		schools.add("����ȡ��·");
		schoolsInfo.put("�����", schools);
		// ����Mapʱ��Map��key��String���ͣ�value��List<String>����
		schoolsInfo.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}