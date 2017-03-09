package com.ichunming.banjia.dao;

import java.util.List;

import com.ichunming.banjia.model.Promote;
import com.ichunming.banjia.vo.PromoteInfo;

public interface PromoteDao extends GenericDao<Promote, Long>{
    public List<PromoteInfo> getPromotes();
}