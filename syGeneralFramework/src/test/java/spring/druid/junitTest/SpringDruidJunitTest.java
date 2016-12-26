package spring.druid.junitTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.pool.DruidDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:spring/spring.xml" })
public class SpringDruidJunitTest {
	@Autowired
	private JdbcTemplate druidJDBCTemplate;

	@Autowired
	private DruidDataSource dataSource;

	@Test
	public void testInsert() {
		druidJDBCTemplate.execute("insert into spring_druid (test_name) values ('spring')");
	}

	@Test
	public void testQuery() {
		Map<String, Object> map = druidJDBCTemplate.queryForMap("select * from spring_druid limit 1");
		System.out.println(map);
	}

	@Test
	public void testDruidDataSource() throws SQLException {
		Connection conn = dataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement pstat = conn.prepareStatement("insert into spring_druid(test_name) values (?)",
				Statement.RETURN_GENERATED_KEYS);
		pstat.setString(1, "druid");
		pstat.executeUpdate();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from spring_druid");
		conn.commit();
		while (rs.next()) {
			System.out.println("id=" + rs.getInt("id") + ", test_name=" + rs.getString("test_name"));
		}
	}
}
