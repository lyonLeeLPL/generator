package com.baomidou.mybatisplus.generator.samples;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * PostgreSQL 代码生成
 *
 * @author lanjerry
 * @since 3.5.3
 */
public class PostgreSQLGeneratorTest extends BaseGeneratorTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
        .Builder("jdbc:postgresql://10.222.238.149:5432/po4?useSSL=false&zeroDateTimeBehavior=convertToNull&allowPublicKeyRetrieval=true&serverTimezone=JST", "phpo401", "Hokudenacn")
        .build();

    /**
     * 更改模板生成的文件路径
     *
     * @see OutputFile
     */
    @Test
    public void testCustomTemplatePath() {
        // 设置自定义路径
        Map<OutputFile, String> pathInfo = new HashMap<>();
        pathInfo.put(OutputFile.xml, "D://");
        pathInfo.put(OutputFile.entity, "D://entity//");
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.strategy(strategyConfig().build());
        generator.packageInfo(packageConfig().pathInfo(pathInfo).build());
        generator.global(globalConfig().build());
        generator.execute();
    }
    /**
     *  我的追加
     */
    @Test
    public void testSimple() {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.strategy(strategyConfig().addInclude("").build());
        generator.global(globalConfig().outputDir("C://workspace//code_generator").build());
        generator.execute();
    }
}
