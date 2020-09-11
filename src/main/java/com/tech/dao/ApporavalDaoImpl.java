package com.tech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tech.bean.ApprovalBean;
import com.tech.bean.Login;
import com.tech.bean.User;

public class ApporavalDaoImpl {

	
	ApprovalBean AB1;
	public int IntRate  = AB1.getInterstRate();
	  @Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;

	  public int App(ApprovalBean AB) {
	    String sql = "insert into users values(?,?,?,?,?,?,?)";

	    return jdbcTemplate.update(sql, new Object[] { AB.getEnquiryId(), AB.getCustomerName(), AB.getInterstRate(),
	        AB.getJobType(), AB.getLoanAmount()});
	  }

	  public ApprovalBean Apporaval (Login login) {
	    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
	        + "'";
	    List<ApprovalBean> ABlist = jdbcTemplate.query(sql, new UserMapper());

	    return Apporaval;
	  }

	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	}

	class ApprovalMapper implements RowMapper<User> {

	  public ApprovalBean mapRow(ResultSet rs, int arg1) throws SQLException {
	    
	    ApprovalBean AB = new  ApprovalBean();

	  
	    
	    AB.setCustomerName(rs.getString("custname"));
	    AB.setEnquiryId(rs.getInt("enqid"));
	    AB.setJobType(rs.getString("jobtype"));
	    AB.setLoanAmount(rs.getInt("loanamount"));
	    AB.setInterstRate(rs.getInt("interst"));
	    
	    
	    return AB;
	    
	   
	  }

}
