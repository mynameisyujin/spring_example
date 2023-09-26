package com.example.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@MapperScan(basePackages = "com.example.*") // 쿼리문을 후에 작성하고 클래스를 만들게 되는데 클래스들의 베이스 패키지 위치
@Configuration // 설정 관련된 spring bean
public class DatabaseConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
        // 모든 걸 여기서 찾겠다 라고 약속한 거임 이름 틀리면 안됨!
        sessionFactory.setMapperLocations(res);

        return sessionFactory.getObject();
    }
}
