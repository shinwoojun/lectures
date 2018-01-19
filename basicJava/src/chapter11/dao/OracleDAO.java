package chapter11.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import chapter11.dto.MovieInfoDO;

public class OracleDAO {
	public List<MovieInfoDO> selectMovieInfo() throws Exception {
		// 접속정보 세팅
		String DB_URL = "jdbc:oracle:thin:@192.168.0.190:1521:orcl";
		String DB_USER = "project";
		String DB_PASSWORD = "project";

		// driver 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// db 연결
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

		// 쿼리 날리기
		Statement stmt = conn.createStatement();
		String query = "SELECT MOVIE_ID, MOVIE_NM, MOVIE_INTRO, MOVIE_ACTOR, MOVIE_DIRECTOR,"
				+ "MOVIE_GENRE1, MOVIE_GENRE2, MOVIE_GENRE3, MOVIE_RELEASE_DATE, MOVIE_SHOWING_YN,"
				+ "MOVIE_RATING, MOVIE_SHOWING_TIME, MOVIE_NATION " + "FROM MOVIE_INFO";
		ResultSet rs = stmt.executeQuery(query);
		

		List<MovieInfoDO> resultList = new ArrayList<MovieInfoDO>();

		while (rs.next()) {
			MovieInfoDO movie = new MovieInfoDO();

			movie.setMovieId(rs.getString(1));
			movie.setMovieNm(rs.getString(2));
			movie.setMovieIntro(rs.getString(3));
			movie.setMovieActor(rs.getString(4));
			movie.setMovieDirector(rs.getString(5));
			movie.setMovieGenre1(rs.getString(6));
			movie.setMovieGenre2(rs.getString(7));
			movie.setMovieGenre3(rs.getString(8));
			movie.setMovieReleaseDate(rs.getString(9));
			movie.setMovieShowingYn(rs.getString(10));
			movie.setMovieRating(rs.getString(11));
			movie.setMovieShowingTime(rs.getString(12));
			movie.setMovieNation(rs.getString(13));
			resultList.add(movie);
		}

		rs.close();
		stmt.close();
		conn.close();

		return resultList;
	}
}
