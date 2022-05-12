package com.pw.diss8.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pw.diss8.entity.SouguZhaomuDriver;

/**
 * 司机 服务类
 *
 * @author Prescott.Wen
 * @version V1.0
 * @date 2022年5月12日
 */
public interface DriverService extends IService<SouguZhaomuDriver> {

    SouguZhaomuDriver sign(SouguZhaomuDriver vo);
}
