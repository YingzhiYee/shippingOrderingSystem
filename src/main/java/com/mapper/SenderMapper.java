package com.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Sender;
import com.entity.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
@Mapper
public interface SenderMapper extends BaseMapper<Sender> {
}
