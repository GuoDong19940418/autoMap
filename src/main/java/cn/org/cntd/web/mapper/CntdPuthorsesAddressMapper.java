package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CntdPuthorsesAddress;
import cn.org.cntd.web.entity.CntdPuthorsesAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntdPuthorsesAddressMapper {
    long countByExample(CntdPuthorsesAddressExample example);

    int deleteByExample(CntdPuthorsesAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CntdPuthorsesAddress record);

    int insertSelective(CntdPuthorsesAddress record);

    List<CntdPuthorsesAddress> selectByExample(CntdPuthorsesAddressExample example);

    CntdPuthorsesAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CntdPuthorsesAddress record, @Param("example") CntdPuthorsesAddressExample example);

    int updateByExample(@Param("record") CntdPuthorsesAddress record, @Param("example") CntdPuthorsesAddressExample example);

    int updateByPrimaryKeySelective(CntdPuthorsesAddress record);

    int updateByPrimaryKey(CntdPuthorsesAddress record);
}