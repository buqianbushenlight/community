package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author buqianbushen_light
 * @create 2022-07-14 16:31
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
