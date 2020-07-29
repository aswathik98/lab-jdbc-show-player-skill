package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	List<Skill> list = new ArrayList<Skill>();
	public List <Skill> listAllSkills() throws SQLException, Exception
	{
		Connection con=ConnectionManager.getConnection();
		Statement st =con.createStatement();
	    String sql="SELECT * FROM SKILL1 ORDER BY NAME ASC";
		ResultSet rs = st.executeQuery(sql);
	
		while(rs.next())
		{
			
			long id = rs.getInt("ID");
			String name = rs.getString("NAME");
			Skill skill = new Skill(id, name);
			list.add(skill);
			
			
		} 
		con.close();
		return list;
	}
		
	}
	
	
	

