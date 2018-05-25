package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdAttackAddress;
import cn.org.cntd.web.entity.CntdAttackAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdAttackAddressMapper {
    long countByExample(CntdAttackAddressExample example);

    int deleteByExample(CntdAttackAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdAttackAddress record);

    int insertSelective(CntdAttackAddress record);

    List<CntdAttackAddress> selectByExample(CntdAttackAddressExample example);

    CntdAttackAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdAttackAddress record, @Param("example") CntdAttackAddressExample example);

    int updateByExample(@Param("record") CntdAttackAddress record, @Param("example") CntdAttackAddressExample example);

    int updateByPrimaryKeySelective(CntdAttackAddress record);

    int updateByPrimaryKey(CntdAttackAddress record);
}