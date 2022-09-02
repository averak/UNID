package dev.abelab.unid.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatisの設定
 */
@MapperScan("dev.abelab.unid.db.mapper")
@Configuration
public class MyBatisConfig {
}
