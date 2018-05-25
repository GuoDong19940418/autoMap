package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.TorNodes;
import cn.org.cntd.web.entity.TorNodesExample;
import cn.org.cntd.web.entity.TorNodesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TorNodesMapper {
    long countByExample(TorNodesExample example);

    int deleteByExample(TorNodesExample example);

    int deleteByPrimaryKey(TorNodesKey key);

    int insert(TorNodes record);

    int insertSelective(TorNodes record);

    List<TorNodes> selectByExample(TorNodesExample example);

    TorNodes selectByPrimaryKey(TorNodesKey key);

    int updateByExampleSelective(@Param("record") TorNodes record, @Param("example") TorNodesExample example);

    int updateByExample(@Param("record") TorNodes record, @Param("example") TorNodesExample example);

    int updateByPrimaryKeySelective(TorNodes record);

    int updateByPrimaryKey(TorNodes record);
}