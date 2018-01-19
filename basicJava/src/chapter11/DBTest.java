package chapter11;

import java.util.List;

import chapter11.dao.OracleDAO;
import chapter11.dto.MovieInfoDO;

public class DBTest {
	public static void main(String[] args) throws Exception {
		OracleDAO dao = new OracleDAO();
		List<MovieInfoDO> resultList = dao.selectMovieInfo();
		
		for (MovieInfoDO row: resultList) {
			System.out.println(row.getMovieNm() + " || " 
								+ row.getMovieDirector());
		}
	}
}
