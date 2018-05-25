package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdControlAddress;
import cn.org.cntd.web.entity.CntdControlAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdControlAddressMapper {
    long countByExample(CntdControlAddressExample example);

    int deleteByExample(CntdControlAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdControlAddress record);

    int insertSelective(CntdControlAddress record);

    List<CntdControlAddress> selectByExample(CntdControlAddressExample example);

    CntdControlAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdControlAddress record, @Param("example") CntdControlAddressExample example);

    int updateByExample(@Param("record") CntdControlAddress record, @Param("example") CntdControlAddressExample example);

    int updateByPrimaryKeySelective(CntdControlAddress record);

    int updateByPrimaryKey(CntdControlAddress record);
}