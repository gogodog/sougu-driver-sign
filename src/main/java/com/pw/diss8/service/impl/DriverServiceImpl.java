package com.pw.diss8.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pw.diss8.common.exception.BusinessException;
import com.pw.diss8.common.exception.code.BaseResponseCode;
import com.pw.diss8.entity.SouguZhaomuDriver;
import com.pw.diss8.mapper.SouguZhaomuDriverMapper;
import com.pw.diss8.service.DriverService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户 服务类
 *
 * @author Prescott.Wen
 * @version V1.0
 * @date 2021年7月18日
 */
@Service
@Slf4j
public class DriverServiceImpl extends ServiceImpl<SouguZhaomuDriverMapper, SouguZhaomuDriver> implements DriverService {

    @Resource
    private SouguZhaomuDriverMapper souguZhaomuDriverMapper;


    @Override
    public SouguZhaomuDriver sign(SouguZhaomuDriver vo) {
        if(StringUtils.isEmpty(vo.getRealName())){
            throw new BusinessException(BaseResponseCode.NAME_EMPTY_ERROR);
        }
        if(StringUtils.isEmpty(vo.getUserCode())){
            throw new BusinessException(BaseResponseCode.IDENTITY_EMPTY_ERROR);
        }
        if(StringUtils.isEmpty(vo.getPhone())){
            throw new BusinessException(BaseResponseCode.TEL_EMPTY_ERROR);
        }
        if(phoneIsExist(vo.getPhone())){
            throw new BusinessException(BaseResponseCode.TEL_EXISTED_ERROR);
        }
        if(userCodeIsExist(vo.getUserCode())){
            throw new BusinessException(BaseResponseCode.IDENTITY_EXISTED_ERROR);
        }
        if(1 == insert(vo)){
            return vo;
        }
        throw  new BusinessException(BaseResponseCode.SYSTEM_BUSY);
    }

    private int insert(SouguZhaomuDriver vo) {
        return souguZhaomuDriverMapper.insert(vo);
    }

    private boolean phoneIsExist(String phone) {
        SouguZhaomuDriver one = souguZhaomuDriverMapper.selectOne(Wrappers.<SouguZhaomuDriver>lambdaQuery().eq(SouguZhaomuDriver::getPhone, phone));
        return one != null;
    }

    private boolean userCodeIsExist(String userCode) {
        SouguZhaomuDriver one = souguZhaomuDriverMapper.selectOne(Wrappers.<SouguZhaomuDriver>lambdaQuery().eq(SouguZhaomuDriver::getUserCode, userCode));
        return one != null;
    }
}
