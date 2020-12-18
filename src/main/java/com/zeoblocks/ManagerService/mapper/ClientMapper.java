package com.zeoblocks.ManagerService.mapper;

import com.zeoblocks.ManagerService.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClientMapper {

    @Select("select * from client")
    List<Client> findAll();
}
