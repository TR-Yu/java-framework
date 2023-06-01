package tech.tryu.transaction.service;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import tech.tryu.transaction.entity.Foo;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class FootMapper implements RowMapper<Foo> {

    @Override
    public Foo mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Foo(rs.getString("fooName"), rs.getString("barName"));
    }
}
