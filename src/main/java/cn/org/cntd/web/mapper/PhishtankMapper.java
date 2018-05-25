package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.Phishtank;
import cn.org.cntd.web.entity.PhishtankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhishtankMapper {
    long countByExample(PhishtankExample example);

    int deleteByExample(PhishtankExample example);

    int deleteByPrimaryKey(String id);

    int insert(Phishtank record);

    int insertSelective(Phishtank record);

    List<Phishtank> selectByExampleWithBLOBs(PhishtankExample example);

    List<Phishtank> selectByExample(PhishtankExample example);

    Phishtank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Phishtank record, @Param("example") PhishtankExample example);

    int updateByExampleWithBLOBs(@Param("record") Phishtank record, @Param("example") PhishtankExample example);

    int updateByExample(@Param("record") Phishtank record, @Param("example") PhishtankExample example);

    int updateByPrimaryKeySelective(Phishtank record);

    int updateByPrimaryKeyWithBLOBs(Phishtank record);

    int updateByPrimaryKey(Phishtank record);
}