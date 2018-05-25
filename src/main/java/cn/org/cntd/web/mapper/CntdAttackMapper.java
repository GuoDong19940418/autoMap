package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdAttack;
import cn.org.cntd.web.entity.CntdAttackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdAttackMapper {
    long countByExample(CntdAttackExample example);

    int deleteByExample(CntdAttackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdAttack record);

    int insertSelective(CntdAttack record);

    List<CntdAttack> selectByExampleWithBLOBs(CntdAttackExample example);

    List<CntdAttack> selectByExample(CntdAttackExample example);

    CntdAttack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdAttack record, @Param("example") CntdAttackExample example);

    int updateByExampleWithBLOBs(@Param("record") CntdAttack record, @Param("example") CntdAttackExample example);

    int updateByExample(@Param("record") CntdAttack record, @Param("example") CntdAttackExample example);

    int updateByPrimaryKeySelective(CntdAttack record);

    int updateByPrimaryKeyWithBLOBs(CntdAttack record);

    int updateByPrimaryKey(CntdAttack record);
}