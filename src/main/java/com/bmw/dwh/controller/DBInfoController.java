package com.bmw.dwh.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * http://localhost:8080/index
 * @author jedong
 *
 */
@Controller
@RequestMapping(value="/dbinfos")
public class DBInfoController {

	@Autowired
    private DataSource dataSource;
	
	@RequestMapping("/index")
    @ResponseBody
    public String index() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource);
        return "hello spring boot";
    }
}
