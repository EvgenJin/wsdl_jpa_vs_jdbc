package com.evg_ws.jdbc;

// геты сеты руками 

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModelsDAO {
    
    public Models getById(Integer id_rec) throws Exception {
        String sql_query = "SELECT * FROM models where id = ?";
        Models model = new Models();
        PreparedStatement stmt = ConnectBean.getInstance().getConnection().prepareStatement(sql_query);
        stmt.setInt(1, id_rec);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                model.setId(rs.getInt("id"));
                model.setName(rs.getString("name"));
                model.setManufacturerId(rs.getInt("manufacturer_id"));
                model.setTypeId(rs.getInt("type_id"));
            }
        }        
        return model;
    }    
}
