package com.fengwenyi.mybatisplusexample;

import com.fengwenyi.mybatisplusexample.entity.AmsT0001;
import com.fengwenyi.mybatisplusexample.mapper.AmsT0001Mapper;
import com.fengwenyi.mybatisplusexample.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fengwenyi.mybatisplusexample.entity.CategoryEntity;
import com.fengwenyi.mybatisplusexample.entity.GoodsEntity;
import com.fengwenyi.mybatisplusexample.entity.enums.GoodsFlagEnum;
import com.fengwenyi.mybatisplusexample.repository.MPCategoryRepository;
import com.fengwenyi.mybatisplusexample.repository.MPGoodsRepository;
import com.fengwenyi.mybatisplusexample.service.IAmsT0001Service;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Component
@Slf4j
public class Amst0001RepositoryTests extends MybatisPlusExampleApplicationTests {

    @Autowired
    private IAmsT0001Service amsT0001Service;

    @Test
    public void testAdd() {
    }

    @Test
    public void testQuery() {
        List<AmsT0001> list = amsT0001Service.list();
        System.out.println(list);
    }


}
