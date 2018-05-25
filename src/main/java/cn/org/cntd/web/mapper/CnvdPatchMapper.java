package cn.org.cntd.web.mapper;

import cn.org.cntd.web.entity.CnvdPatch;
import cn.org.cntd.web.entity.CnvdPatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnvdPatchMapper {
    long countByExample(CnvdPatchExample example);

    int deleteByExample(CnvdPatchExample example);

    int deleteByPrimaryKey(String id);

    int insert(CnvdPatch record);

    int insertSelective(CnvdPatch record);

    List<CnvdPatch> selectByExample(CnvdPatchExample example);

    CnvdPatch selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CnvdPatch record, @Param("example") CnvdPatchExample example);

    int updateByExample(@Param("record") CnvdPatch record, @Param("example") CnvdPatchExample example);

    int updateByPrimaryKeySelective(CnvdPatch record);

    int updateByPrimaryKey(CnvdPatch record);
}