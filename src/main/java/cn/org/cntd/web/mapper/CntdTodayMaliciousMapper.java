package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdTodayMalicious;
import cn.org.cntd.web.entity.CntdTodayMaliciousExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdTodayMaliciousMapper {
    long countByExample(CntdTodayMaliciousExample example);

    int deleteByExample(CntdTodayMaliciousExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdTodayMalicious record);

    int insertSelective(CntdTodayMalicious record);

    List<CntdTodayMalicious> selectByExample(CntdTodayMaliciousExample example);

    CntdTodayMalicious selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdTodayMalicious record, @Param("example") CntdTodayMaliciousExample example);

    int updateByExample(@Param("record") CntdTodayMalicious record, @Param("example") CntdTodayMaliciousExample example);

    int updateByPrimaryKeySelective(CntdTodayMalicious record);

    int updateByPrimaryKey(CntdTodayMalicious record);
}