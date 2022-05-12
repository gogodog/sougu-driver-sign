package com.pw.diss8.controller;

import com.pw.diss8.common.utils.DataResult;
import com.pw.diss8.entity.SouguZhaomuDriver;
import com.pw.diss8.service.DriverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 用户管理
 *
 * @author Prescott.Wen
 * @version V1.0
 * @date 2021年7月18日
 */
@RestController
@RequestMapping("/driver")
@Slf4j
public class DriverController {
    @Resource
    private DriverService driverService;

    @GetMapping("/zhaomu/sign")
    public DataResult sign(@Valid SouguZhaomuDriver vo) {
        SouguZhaomuDriver driver = driverService.sign(vo);
        return DataResult.success(driver);
    }
}
