package tech.washmore.gold.web.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tech.washmore.gold.web.dao.Dao;
import tech.washmore.gold.web.model.Demo;

import java.util.List;

/**
 * Created by Washmore on 2017/1/2.
 */
@Repository
public class GetAllDemosLogic {
    @Autowired
    private Dao dao;

    public List<Demo> getAllDemo() {
        return dao.selectList("DemoMapper.select");
    }
}
