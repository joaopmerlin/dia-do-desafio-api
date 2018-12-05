package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ranking")
public class RankingController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public List findAll() {
        return jdbcTemplate
                .query("select m.usuario, avg(m.valor) as valor, avg(m.tempo) as tempo from Monitoramento m group by m.usuario order by sum(m.valor) desc",
                        BeanPropertyRowMapper.newInstance(Ranking.class));
    }
}
