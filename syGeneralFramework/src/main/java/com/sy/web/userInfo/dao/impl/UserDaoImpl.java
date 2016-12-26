package com.sy.web.userInfo.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sy.web.userInfo.dao.UserDao;

/**
 * @Author:liangjilong
 * @Date:2015年10月29日-下午3:45:04
 * @Email:jilonglinag@sina.com
 * @Version:1.0
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate druidJDBCTemplate;

//	@Autowired
//	private DruidDataSource dataSource;

	public List<Map<String, Object>> getAll() {
		System.out.println("这走到了DAO");

		return null;
	}

/*	public void Insert() {
		druidJDBCTemplate.execute("insert into spring_druid (test_name) values ('spring')");
	}
*/
	public int queryUser() {
		Map<String, Object> map = druidJDBCTemplate.queryForMap("SELECT count(*) id FROM USER WHERE username ='liangjilong' AND PASSWORD ='1234566'");
		System.out.println(map.get("id"));
		return Integer.valueOf(map.get("id").toString());
	}
	
	public int register() {	
		System.out.println("这是注册！");
		return 0;
	}

	/*public void DruidDataSource() throws SQLException {
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
	}*/
}
