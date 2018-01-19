package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ThreadURL {
	public static void main(String[] args) {
		List<NewsDO> lists = new ArrayList<NewsDO>();
		
		NewsDO news1 = new NewsDO();
		news1.setUrl("http://www.hani.co.kr/arti/society/area/814800.html?_fr=sr1");
		news1.setEncoding("utf-8");
		news1.setFileOutPath("D:\\temp\\result1.html");
		
		NewsDO news2 = new NewsDO();
		news2.setUrl("http://www.hani.co.kr/arti/society/society_general/814799.html?_ns=t1");
		news2.setEncoding("utf-8");
		news2.setFileOutPath("D:\\temp\\result2.html");
		
		NewsDO news3 = new NewsDO();
		news3.setUrl("http://entertain.naver.com/photo/issue/1008311/16#cid=1008311&iid=1646536");
		news3.setEncoding("utf-8");
		news3.setFileOutPath("D:\\temp\\result3.html");
		
		NewsDO news4 = new NewsDO();
		news4.setUrl("http://entertain.naver.com/photo/issue/1008311/16");
		news4.setEncoding("utf-8");
		news4.setFileOutPath("D:\\temp\\result4.html");
		
		NewsDO news5 = new NewsDO();
		news5.setUrl("http://entertain.naver.com/ranking/read?oid=112&aid=0002965920");
		news5.setEncoding("utf-8");
		news5.setFileOutPath("D:\\temp\\result5.html");
		
		NewsDO news6 = new NewsDO();
		news6.setUrl("http://entertain.naver.com/read?oid=416&aid=0000212283");
		news6.setEncoding("utf-8");
		news6.setFileOutPath("D:\\temp\\result6.html");
		
		
		NewsDO news7 = new NewsDO();
		news7.setUrl("http://news.naver.com/main/ranking/read.nhn?mid=etc&sid1=111&rankingType=popular_day&oid=018&aid=0003946625&date=20171017&type=1&rankingSeq=4&rankingSectionId=100");
		news7.setEncoding("euc-kr");
		news7.setFileOutPath("D:\\temp\\result7.html");
		
		NewsDO news8 = new NewsDO();
		news8.setUrl("http://news.naver.com/main/ranking/read.nhn?mid=etc&sid1=111&rankingType=popular_day&oid=008&aid=0003948906&date=20171017&type=1&rankingSeq=1&rankingSectionId=100");
		news8.setEncoding("euc-kr");
		news8.setFileOutPath("D:\\temp\\result8.html");
		
		NewsDO news9 = new NewsDO();
		news9.setUrl("http://news.naver.com/main/read.nhn?oid=001&sid1=100&aid=0009612700&mid=shm&viewType=pc&mode=LSD&nh=20171017165336");
		news9.setEncoding("euc-kr");
		news9.setFileOutPath("D:\\temp\\result9.html");
		
		NewsDO news10 = new NewsDO();
		news10.setUrl("http://news.naver.com/main/ranking/read.nhn?mid=etc&sid1=111&rankingType=memo_week&oid=421&aid=0002977245&date=20171011&type=1&rankingSectionId=100&rankingSeq=1");
		news10.setEncoding("euc-kr");
		news10.setFileOutPath("D:\\temp\\result10.html");
		
		lists.add(news1);
		lists.add(news2);
		lists.add(news3);
		lists.add(news4);
		lists.add(news5);
		lists.add(news6);
		lists.add(news7);
		lists.add(news8);
		lists.add(news9);
		lists.add(news10);
		
		for (NewsDO news: lists) {
			Runnable worker = new GetURL(news.getUrl(), 
										news.getEncoding(), 
										news.getFileOutPath());
			Thread thread = new Thread(worker);
			
			thread.start();
		}
		
		System.out.println("끝");
		
	}
}
