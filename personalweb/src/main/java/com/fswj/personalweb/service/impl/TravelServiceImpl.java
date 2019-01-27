package com.fswj.personalweb.service.impl;

import com.fswj.personalweb.entity.TravelLog;
import com.fswj.personalweb.exception.DataAlreadyExistsException;
import com.fswj.personalweb.exception.InvalidValueException;
import com.fswj.personalweb.mapper.TravelLogMapper;
import com.fswj.personalweb.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImpl implements TravelService{
    @Autowired
    private TravelLogMapper travelLogMapper;
    @Override
    public List<TravelLog> getAllTravelLogs(){
        return travelLogMapper.getTravelLogs();
    }
    @Override
    public TravelLog isProvinceExists(String  province){
        return travelLogMapper.findTravelLogByProvince(province);

    }
    @Override
    public int makePlan(TravelLog travelLog) throws InvalidValueException, DataAlreadyExistsException,Exception{
        if (travelLog.getProvince() == null || travelLog.getProvince().equals("")){
            throw new InvalidValueException("省份不可为空");
        }
        if (travelLog.getRemark() == null || travelLog.getRemark().equals("")){
            throw new InvalidValueException("备注不可为空");
        }
        if (travelLog.getTime() == null ){
            throw new InvalidValueException("备注不可为空");
        }
        if (isProvinceExists(travelLog.getProvince()) != null){
            throw new DataAlreadyExistsException("您已经做过次日志或者计划");
        }
        return travelLogMapper.setPlan(travelLog);
    }

}
