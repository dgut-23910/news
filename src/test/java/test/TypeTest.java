package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bean.NewsType;
import dao.DatabaseDao;
import dao.NewsTypeDao;

public class TypeTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testType() throws Exception {
		NewsTypeDao newsTypeDao=new NewsTypeDao();
		List<NewsType> NewsTypes=new ArrayList<NewsType>();
		DatabaseDao databaseDao=new DatabaseDao();
		NewsTypes= newsTypeDao.getAll();
		assertNotNull(NewsTypes);	
	}
}
