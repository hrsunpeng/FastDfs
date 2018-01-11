package cn.msosm.shop.mapper;

import cn.msosm.shop.pojo.MyImg;
import cn.msosm.shop.pojo.MyImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyImgMapper {
    int countByExample(MyImgExample example);

    int deleteByExample(MyImgExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(MyImg record);

    int insertSelective(MyImg record);

    List<MyImg> selectByExample(MyImgExample example);

    MyImg selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") MyImg record, @Param("example") MyImgExample example);

    int updateByExample(@Param("record") MyImg record, @Param("example") MyImgExample example);

    int updateByPrimaryKeySelective(MyImg record);

    int updateByPrimaryKey(MyImg record);
}