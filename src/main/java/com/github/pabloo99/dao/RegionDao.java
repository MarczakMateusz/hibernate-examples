package com.github.pabloo99.dao;

import com.github.pabloo99.entity.Region;

public class RegionDao extends HibernateDao {
    public RegionDao(Class type) {
        super(Region.class);
    }
}
