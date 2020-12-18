package com.zeoblocks.ManagerService;

import com.zeoblocks.ManagerService.model.Client;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Client.class)
@MapperScan("com.zeoblocks.ManagerService.mapper")
@SpringBootApplication
public class ManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerServiceApplication.class, args);
	}

}
