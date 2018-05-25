package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdOtherMaliciousAddress;
import cn.org.cntd.web.entity.CntdOtherMaliciousAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdOtherMaliciousAddressMapper {
    long countByExample(CntdOtherMaliciousAddressExample example);

    int deleteByExample(CntdOtherMaliciousAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdOtherMaliciousAddress record);

    int insertSelective(CntdOtherMaliciousAddress record);

    List<CntdOtherMaliciousAddress> selectByExample(CntdOtherMaliciousAddressExample example);

    CntdOtherMaliciousAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdOtherMaliciousAddress record, @Param("example") CntdOtherMaliciousAddressExample example);

    int updateByExample(@Param("record") CntdOtherMaliciousAddress record, @Param("example") CntdOtherMaliciousAddressExample example);

    int updateByPrimaryKeySelective(CntdOtherMaliciousAddress record);

    int updateByPrimaryKey(CntdOtherMaliciousAddress record);
}