package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdControlAddress2;
import cn.org.cntd.web.entity.CntdControlAddress2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdControlAddress2Mapper {
    long countByExample(CntdControlAddress2Example example);

    int deleteByExample(CntdControlAddress2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdControlAddress2 record);

    int insertSelective(CntdControlAddress2 record);

    List<CntdControlAddress2> selectByExample(CntdControlAddress2Example example);

    CntdControlAddress2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdControlAddress2 record, @Param("example") CntdControlAddress2Example example);

    int updateByExample(@Param("record") CntdControlAddress2 record, @Param("example") CntdControlAddress2Example example);

    int updateByPrimaryKeySelective(CntdControlAddress2 record);

    int updateByPrimaryKey(CntdControlAddress2 record);
}